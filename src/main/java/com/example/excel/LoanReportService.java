package com.example.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoanReportService {

    private final LaonRepo laonRepo;


    public Map<String,Object> generateTestData(int count) {

        List<Loan> loanAll = new ArrayList<>();
        IntStream.range(0,count).forEach(s-> {
            Loan loan = LoanTestDataBuilder.buildRandom();
            loan.setLoanId(null);
            loanAll.add(loan);
            try {
                Loan save = laonRepo.save(loan);
                log.info("saved loan: {}", save.getLoanId());
            } catch (Exception e) {
                log.warn("ignore this: {} ",e.getMessage());
            }

        });
        int size = laonRepo.findAll().size();
        log.info("Total loan records in DB: {}", size);
        //  laonRepo.saveAll(loanAll);
        return Map.of("status","success","message",count + " test loan records generated");
    }

        /**
         * Generate Excel report using template fill
         */
    public void createTemplateReport(String templatePath, String outputPath) {

        List<Loan> loans = laonRepo.findAll();

        List<Map<String,Object>> mapList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        for (Loan loan : loans) {
            Map<String, Object> target = objectMapper.convertValue(loan, Map.class);
            target.entrySet().stream().filter(s->s.getValue() != null).
                    filter(s->s.getValue() instanceof List<?>).forEach(System.out::println);
            mapList.add(target);
        }

        // Load template from resources
        InputStream templateInputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(templatePath);

        try (ExcelWriter excelWriter = EasyExcel.write(outputPath)
                .withTemplate(templateInputStream)
                .build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();
            //filling list data
            excelWriter.fill(mapList, writeSheet);
            //filling single object data
            excelWriter.fill(Map.of("titleOfReport","This is Title of Single map object filling!! "), writeSheet);

        } catch (Exception ex){
            log.error("Error writing Excel report: {}", ex.getMessage(), ex);
        }
        log.info("Template report generated: {}", outputPath);
    }
}
