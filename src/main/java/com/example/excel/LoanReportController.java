package com.example.excel;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.Map;

@RestController
	@RequestMapping("/api/reports")
	@RequiredArgsConstructor
	public  class LoanReportController {
	
		private final LoanReportService reportService;


		@PostMapping("/generate-test-data")
		public ResponseEntity<Map<String, Object>> generateTestData(@RequestParam(name = "count", defaultValue = "100") int count) {
			Map<String, Object> result = reportService.generateTestData(count);
			return ResponseEntity.ok(result);
		}

		@GetMapping("/template")
		public ResponseEntity<Resource> generateTemplateReport() {
			String templatePath = "Loan_Template.xlsx";
			String outputPath = System.getProperty("java.io.tmpdir")+"/loan_template_report_"
						  + System.currentTimeMillis() + ".xlsx";

			reportService.createTemplateReport(templatePath, outputPath);

			File file = new File(outputPath);
			Resource resource = new FileSystemResource(file);
			
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, 
					   "attachment; filename=" + file.getName())
					.contentType(MediaType.parseMediaType(
					   "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
					.body(resource);
		}

	}
