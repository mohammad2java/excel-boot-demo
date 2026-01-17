package com.example.excel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Builder class to generate random test data for Loan entity
 */
public class LoanTestDataBuilder {
    
    private static final Random random = new Random();
    private static final String[] FIRST_NAMES = {"John", "Jane", "Michael", "Sarah", "David", "Emily", "Robert", "Lisa", "James", "Jennifer"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
    private static final String[] STATES = {"CA", "TX", "FL", "NY", "PA", "IL", "OH", "GA", "NC", "MI"};
    private static final String[] CITIES = {"Los Angeles", "Houston", "Miami", "New York", "Philadelphia", "Chicago", "Columbus", "Atlanta", "Charlotte", "Detroit"};
    private static final String[] LOAN_TYPES = {"CONVENTIONAL", "FHA", "VA", "USDA", "JUMBO"};
    private static final String[] LOAN_PURPOSES = {"PURCHASE", "REFINANCE", "CASH_OUT_REFINANCE", "HOME_EQUITY"};
    private static final String[] LOAN_STATUSES = {"ACTIVE", "PENDING", "APPROVED", "FUNDED", "CLOSED", "DENIED"};
    private static final String[] PROPERTY_TYPES = {"SINGLE_FAMILY", "CONDO", "TOWNHOUSE", "MULTI_FAMILY", "MANUFACTURED"};
    private static final String[] EMPLOYMENT_STATUSES = {"EMPLOYED", "SELF_EMPLOYED", "RETIRED", "UNEMPLOYED"};
    private static final String[] MARITAL_STATUSES = {"SINGLE", "MARRIED", "DIVORCED", "WIDOWED"};
    
    private final Loan loan;
    
    public LoanTestDataBuilder() {
        this.loan = new Loan();
    }
    
    /**
     * Build a Loan with completely random data
     */
    public static Loan buildRandom() {
        return new LoanTestDataBuilder()
                .withRandomIds()
                .withRandomBorrowerInfo()
                .withRandomCoBorrowerInfo()
                .withRandomAddresses()
                .withRandomLoanDetails()
                .withRandomPropertyDetails()
                .withRandomFinancials()
                .withRandomCompliance()
                .withRandomPaymentInfo()
                .withRandomAuditFields()
                .build();
    }
    
    /**
     * Build a Loan with basic random data (minimal fields)
     */
    public static Loan buildBasicRandom() {
        return new LoanTestDataBuilder()
                .withRandomIds()
                .withRandomBorrowerInfo()
                .withRandomLoanDetails()
                .withRandomAuditFields()
                .build();
    }
    
    public LoanTestDataBuilder withRandomIds() {
        loan.setLoanId(randomLong(1000, 999999));
        loan.setLoanNumber("LN-" + randomLong(100000, 999999));
        loan.setApplicationId("APP-" + randomLong(100000, 999999));
        loan.setExternalLoanId("EXT-" + randomLong(100000, 999999));
        loan.setLegacyLoanId("LEG-" + randomLong(100000, 999999));
        return this;
    }
    
    public LoanTestDataBuilder withRandomBorrowerInfo() {
        loan.setBorrowerFirstName(randomElement(FIRST_NAMES));
        loan.setBorrowerMiddleName(randomElement(new String[]{"A", "B", "C", "D", "E"}));
        loan.setBorrowerLastName(randomElement(LAST_NAMES));
        loan.setBorrowerSuffix(randomElement(new String[]{"Jr", "Sr", "III", null, null}));
        loan.setBorrowerSsn(randomSSN());
        loan.setBorrowerDateOfBirth(randomDateBetween(1950, 1995));
        loan.setBorrowerEmail(loan.getBorrowerFirstName().toLowerCase() + "." + 
                             loan.getBorrowerLastName().toLowerCase() + "@example.com");
        loan.setBorrowerPhone(randomPhone());
        loan.setBorrowerMobile(randomPhone());
        loan.setBorrowerWorkPhone(randomPhone());
        loan.setBorrowerMaritalStatus(randomElement(MARITAL_STATUSES));
        loan.setBorrowerCitizenship("US_CITIZEN");
        loan.setBorrowerResidencyStatus("PERMANENT_RESIDENT");
        loan.setBorrowerEmploymentStatus(randomElement(EMPLOYMENT_STATUSES));
        loan.setBorrowerOccupation(randomElement(new String[]{"Engineer", "Teacher", "Manager", "Developer", "Nurse"}));
        loan.setBorrowerEmployerName("ABC Corporation");
        loan.setBorrowerEmployerPhone(randomPhone());
        loan.setBorrowerYearsEmployed(randomBigDecimal(0.5, 30, 1));
        loan.setBorrowerMonthlyIncome(randomBigDecimal(3000, 15000, 2));
        loan.setBorrowerAnnualIncome(loan.getBorrowerMonthlyIncome().multiply(new BigDecimal("12")));
        loan.setBorrowerOtherIncome(randomBigDecimal(0, 2000, 2));
        loan.setBorrowerCreditScore(randomInt(580, 850));
        loan.setBorrowerEducationLevel(randomElement(new String[]{"HIGH_SCHOOL", "BACHELOR", "MASTER", "DOCTORATE"}));
        loan.setBorrowerDependents(randomInt(0, 4));
        loan.setBorrowerHousingStatus(randomElement(new String[]{"OWN", "RENT", "LIVING_WITH_PARENTS"}));
        return this;
    }
    
    public LoanTestDataBuilder withRandomCoBorrowerInfo() {
        if (random.nextBoolean()) {
            loan.setCoBorrowerFirstName(randomElement(FIRST_NAMES));
            loan.setCoBorrowerLastName(randomElement(LAST_NAMES));
            loan.setCoBorrowerSsn(randomSSN());
            loan.setCoBorrowerDateOfBirth(randomDateBetween(1950, 1995));
            loan.setCoBorrowerEmail(loan.getCoBorrowerFirstName().toLowerCase() + "." + 
                                   loan.getCoBorrowerLastName().toLowerCase() + "@example.com");
            loan.setCoBorrowerPhone(randomPhone());
            loan.setCoBorrowerMobile(randomPhone());
            loan.setCoBorrowerMaritalStatus(randomElement(MARITAL_STATUSES));
            loan.setCoBorrowerEmploymentStatus(randomElement(EMPLOYMENT_STATUSES));
            loan.setCoBorrowerMonthlyIncome(randomBigDecimal(3000, 12000, 2));
            loan.setCoBorrowerAnnualIncome(loan.getCoBorrowerMonthlyIncome().multiply(new BigDecimal("12")));
            loan.setCoBorrowerCreditScore(randomInt(580, 850));
        }
        return this;
    }
    
    public LoanTestDataBuilder withRandomAddresses() {
        String state = randomElement(STATES);
        String city = randomElement(CITIES);
        
        loan.setPropertyAddressLine1(randomInt(100, 9999) + " " + randomElement(new String[]{"Main", "Oak", "Elm", "Maple"}) + " Street");
        loan.setPropertyCity(city);
        loan.setPropertyState(state);
        loan.setPropertyZipCode(String.format("%05d", randomInt(10000, 99999)));
        loan.setPropertyCounty(city + " County");
        loan.setPropertyCountry("USA");
        
        loan.setMailingAddressLine1(loan.getPropertyAddressLine1());
        loan.setMailingCity(city);
        loan.setMailingState(state);
        loan.setMailingZipCode(loan.getPropertyZipCode());
        loan.setMailingCountry("USA");
        
        if (random.nextBoolean()) {
            loan.setPreviousAddressLine1(randomInt(100, 9999) + " Previous St");
            loan.setPreviousCity(randomElement(CITIES));
            loan.setPreviousState(randomElement(STATES));
            loan.setPreviousZipCode(String.format("%05d", randomInt(10000, 99999)));
        }
        
        loan.setYearsAtCurrentAddress(randomBigDecimal(0, 15, 1));
        loan.setMonthsAtCurrentAddress(randomInt(0, 180));
        
        return this;
    }
    
    public LoanTestDataBuilder withRandomLoanDetails() {
        loan.setLoanType(randomElement(LOAN_TYPES));
        loan.setLoanPurpose(randomElement(LOAN_PURPOSES));
        
        BigDecimal requestedAmount = randomBigDecimal(50000, 750000, 2);
        loan.setRequestedAmount(requestedAmount);
        loan.setApprovedAmount(requestedAmount.multiply(randomBigDecimal(0.9, 1.0, 4)));
        loan.setLoanAmount(loan.getApprovedAmount());
        loan.setDisbursedAmount(loan.getApprovedAmount());
        
        BigDecimal principalBalance = loan.getLoanAmount().multiply(randomBigDecimal(0.7, 1.0, 4));
        loan.setPrincipalBalance(principalBalance);
        loan.setOutstandingBalance(principalBalance.add(randomBigDecimal(0, 1000, 2)));
        
        loan.setInterestRate(randomBigDecimal(2.5, 7.5, 3));
        loan.setAnnualPercentageRate(loan.getInterestRate().add(randomBigDecimal(0.1, 0.5, 3)));
        
        loan.setLoanTermMonths(randomElement(new Integer[]{180, 240, 300, 360}));
        loan.setRemainingTermMonths(randomInt(60, loan.getLoanTermMonths()));
        
        loan.setPaymentFrequency("MONTHLY");
        loan.setMonthlyPayment(randomBigDecimal(1000, 5000, 2));
        
        LocalDate today = LocalDate.now();
        loan.setApplicationDate(today.minusDays(randomInt(60, 180)));
        loan.setApprovalDate(loan.getApplicationDate().plusDays(randomInt(7, 30)));
        loan.setClosingDate(loan.getApprovalDate().plusDays(randomInt(15, 45)));
        loan.setOriginationDate(loan.getClosingDate());
        loan.setFundingDate(loan.getClosingDate().plusDays(randomInt(1, 7)));
        loan.setFirstDisbursementDate(loan.getFundingDate());
        loan.setFirstPaymentDate(loan.getFundingDate().plusMonths(1));
        loan.setMaturityDate(loan.getFirstPaymentDate().plusMonths(loan.getLoanTermMonths()));
        
        loan.setLoanStatus(randomElement(LOAN_STATUSES));
        loan.setLoanSubStatus("CURRENT");
        
        loan.setLoanOfficerId("LO-" + randomInt(1000, 9999));
        loan.setLoanOfficerName(randomElement(FIRST_NAMES) + " " + randomElement(LAST_NAMES));
        loan.setUnderwriterId("UW-" + randomInt(1000, 9999));
        loan.setUnderwriterName(randomElement(FIRST_NAMES) + " " + randomElement(LAST_NAMES));
        loan.setProcessorId("PR-" + randomInt(1000, 9999));
        loan.setProcessorName(randomElement(FIRST_NAMES) + " " + randomElement(LAST_NAMES));
        
        loan.setOriginationFee(loan.getLoanAmount().multiply(randomBigDecimal(0.005, 0.02, 4)));
        loan.setProcessingFee(randomBigDecimal(300, 1500, 2));
        loan.setLateFeeAmount(randomBigDecimal(25, 100, 2));
        loan.setPrepaymentPenalty(BigDecimal.ZERO);
        
        return this;
    }
    
    public LoanTestDataBuilder withRandomPropertyDetails() {
        loan.setPropertyType(randomElement(PROPERTY_TYPES));
        loan.setPropertyUse(randomElement(new String[]{"PRIMARY_RESIDENCE", "INVESTMENT", "VACATION_HOME"}));
        
        BigDecimal propertyValue = randomBigDecimal(200000, 1000000, 2);
        loan.setPropertyValue(propertyValue);
        loan.setAppraisedValue(propertyValue.multiply(randomBigDecimal(0.95, 1.05, 4)));
        loan.setPurchasePrice(propertyValue.multiply(randomBigDecimal(0.9, 1.0, 4)));
        
        loan.setPropertyYearBuilt(randomInt(1960, 2023));
        loan.setPropertySquareFeet(randomInt(1000, 4500));
        loan.setPropertyBedrooms(randomInt(2, 5));
        loan.setPropertyBathrooms(randomBigDecimal(1, 4, 1));
        loan.setPropertyStories(randomInt(1, 3));
        loan.setPropertyGarageSpaces(randomInt(0, 3));
        loan.setPropertyLotSize(randomBigDecimal(0.1, 2.0, 2));
        loan.setPropertyCondition(randomElement(new String[]{"EXCELLENT", "GOOD", "FAIR", "POOR"}));
        loan.setPropertyZoning(randomElement(new String[]{"RESIDENTIAL", "MIXED_USE"}));
        
        loan.setHoaFee(randomBigDecimal(0, 500, 2));
        loan.setPropertyTaxAnnual(propertyValue.multiply(randomBigDecimal(0.01, 0.03, 4)));
        loan.setHomeownersInsurance(randomBigDecimal(800, 3000, 2));
        loan.setFloodInsurance(random.nextBoolean() ? randomBigDecimal(200, 1000, 2) : BigDecimal.ZERO);
        loan.setPmiAmount(random.nextBoolean() ? randomBigDecimal(50, 300, 2) : BigDecimal.ZERO);
        loan.setEscrowAccountBalance(randomBigDecimal(1000, 10000, 2));
        
        BigDecimal downPayment = loan.getPurchasePrice().multiply(randomBigDecimal(0.05, 0.25, 4));
        loan.setDownPaymentAmount(downPayment);
        loan.setDownPaymentPercentage(downPayment.divide(loan.getPurchasePrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100")));
        
        loan.setLoanToValueRatio(loan.getLoanAmount().divide(propertyValue, 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100")));
        
        return this;
    }
    
    public LoanTestDataBuilder withRandomFinancials() {
        BigDecimal monthlyIncome = loan.getBorrowerMonthlyIncome();
        if (loan.getCoBorrowerMonthlyIncome() != null) {
            monthlyIncome = monthlyIncome.add(loan.getCoBorrowerMonthlyIncome());
        }
        
        loan.setAutoLoanPayment(randomBigDecimal(0, 800, 2));
        loan.setCreditCardPayment(randomBigDecimal(0, 500, 2));
        loan.setStudentLoanPayment(randomBigDecimal(0, 600, 2));
        loan.setOtherLoanPayment(randomBigDecimal(0, 300, 2));
        loan.setAlimonyPayment(BigDecimal.ZERO);
        loan.setChildSupportPayment(BigDecimal.ZERO);
        
        BigDecimal totalDebt = loan.getAutoLoanPayment()
                .add(loan.getCreditCardPayment())
                .add(loan.getStudentLoanPayment())
                .add(loan.getOtherLoanPayment());
        loan.setTotalMonthlyDebt(totalDebt);
        
        BigDecimal housingExpense = loan.getMonthlyPayment()
                .add(loan.getPropertyTaxAnnual().divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP))
                .add(loan.getHomeownersInsurance().divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP));
        
        loan.setFrontEndRatio(housingExpense.divide(monthlyIncome, 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100")));
        loan.setBackEndRatio(totalDebt.add(housingExpense).divide(monthlyIncome, 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100")));
        loan.setDebtToIncomeRatio(loan.getBackEndRatio());
        
        loan.setTotalAssets(randomBigDecimal(10000, 500000, 2));
        loan.setLiquidAssets(randomBigDecimal(5000, 100000, 2));
        loan.setCheckingAccountBalance(randomBigDecimal(1000, 25000, 2));
        loan.setSavingsAccountBalance(randomBigDecimal(2000, 50000, 2));
        loan.setRetirementAccountBalance(randomBigDecimal(5000, 300000, 2));
        loan.setInvestmentAccountBalance(randomBigDecimal(0, 100000, 2));
        
        loan.setTotalLiabilities(randomBigDecimal(5000, 150000, 2));
        loan.setCreditCardDebt(randomBigDecimal(0, 20000, 2));
        loan.setOutstandingJudgments(BigDecimal.ZERO);
        loan.setTaxLiens(BigDecimal.ZERO);
        
        loan.setBankruptcyFlag(false);
        loan.setForeclosureFlag(false);
        loan.setShortSaleFlag(false);
        
        return this;
    }
    
    public LoanTestDataBuilder withRandomCompliance() {
        loan.setRiskRating(randomElement(new String[]{"LOW", "MEDIUM", "HIGH"}));
        loan.setRiskScore(randomBigDecimal(1, 100, 2));
        loan.setFraudScore(randomBigDecimal(1, 100, 2));
        loan.setComplianceStatus(randomElement(new String[]{"COMPLIANT", "PENDING_REVIEW", "NON_COMPLIANT"}));
        loan.setKycStatus("VERIFIED");
        loan.setKycVerificationDate(LocalDate.now().minusDays(randomInt(1, 90)));
        loan.setAmlStatus("CLEARED");
        loan.setAmlVerificationDate(LocalDate.now().minusDays(randomInt(1, 90)));
        loan.setOfacStatus("CLEARED");
        loan.setOfacCheckDate(LocalDate.now().minusDays(randomInt(1, 90)));
        loan.setCreditCheckDate(LocalDate.now().minusDays(randomInt(1, 90)));
        loan.setIncomeVerificationStatus("VERIFIED");
        loan.setEmploymentVerificationStatus("VERIFIED");
        loan.setAssetVerificationStatus("VERIFIED");
        loan.setAppraisalStatus("COMPLETED");
        loan.setTitleSearchStatus("CLEAR");
        loan.setInsuranceVerificationStatus("VERIFIED");
        loan.setRegulatoryProductType("QUALIFIED_MORTGAGE");
        loan.setHoepaStatus("NOT_HOEPA");
        loan.setHpmlStatus("NOT_HPML");
        return this;
    }
    
    public LoanTestDataBuilder withRandomPaymentInfo() {
        LocalDate lastPayment = LocalDate.now().minusMonths(1);
        loan.setLastPaymentDate(lastPayment);
        loan.setLastPaymentAmount(loan.getMonthlyPayment());
        loan.setNextPaymentDueDate(LocalDate.now().plusDays(randomInt(1, 30)));
        loan.setNextPaymentAmount(loan.getMonthlyPayment());
        
        int paymentsMade = randomInt(1, 60);
        loan.setTotalPaymentsMade(paymentsMade);
        loan.setPaymentsPastDue(randomInt(0, 2));
        loan.setDaysPastDue(loan.getPaymentsPastDue() > 0 ? randomInt(1, 30) : 0);
        
        BigDecimal paidPrincipal = loan.getLoanAmount().subtract(loan.getPrincipalBalance());
        loan.setTotalPaidPrincipal(paidPrincipal);
        loan.setTotalPaidInterest(randomBigDecimal(1000, 50000, 2));
        loan.setTotalPaidFees(randomBigDecimal(0, 2000, 2));
        
        loan.setLatePaymentCount(randomInt(0, 3));
        loan.setMissedPaymentCount(randomInt(0, 1));
        loan.setPrepaymentAmount(BigDecimal.ZERO);
        loan.setPayoffAmount(loan.getOutstandingBalance().add(randomBigDecimal(100, 1000, 2)));
        
        return this;
    }
    
    public LoanTestDataBuilder withRandomAuditFields() {
        LocalDateTime now = LocalDateTime.now();
        loan.setCreatedDate(now.minusDays(randomInt(30, 365)));
        loan.setCreatedBy("system_" + randomInt(1, 10));
        loan.setModifiedDate(now.minusDays(randomInt(1, 30)));
        loan.setModifiedBy("user_" + randomInt(1, 20));
        loan.setVersion(randomInt(1, 5));
        loan.setRecordStatus("ACTIVE");
        loan.setDataSource(randomElement(new String[]{"MANUAL_ENTRY", "API", "BATCH_IMPORT", "MIGRATION"}));
        loan.setSourceSystem(randomElement(new String[]{"LEGACY_SYSTEM", "CORE_BANKING", "LOAN_ORIGINATION"}));
        loan.setMigrationBatchId("BATCH-" + randomInt(1000, 9999));
        loan.setLastSyncDate(now.minusHours(randomInt(1, 24)));
        loan.setNotes("Test loan record generated for testing purposes");
        loan.setTags("TEST,RANDOM,GENERATED");
        return this;
    }
    
    public Loan build() {
        return loan;
    }
    
    // Utility methods
    private static String randomElement(String[] array) {
        return array[random.nextInt(array.length)];
    }
    
    private static Integer randomElement(Integer[] array) {
        return array[random.nextInt(array.length)];
    }
    
    private static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    private static long randomLong(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
    
    private static BigDecimal randomBigDecimal(double min, double max, int scale) {
        double value = min + (max - min) * random.nextDouble();
        return BigDecimal.valueOf(value).setScale(scale, RoundingMode.HALF_UP);
    }
    
    private static LocalDate randomDateBetween(int startYear, int endYear) {
        int year = randomInt(startYear, endYear);
        int dayOfYear = randomInt(1, 365);
        return LocalDate.ofYearDay(year, dayOfYear);
    }
    
    private static String randomSSN() {
        return String.format("%03d-%02d-%04d", 
                randomInt(100, 899), 
                randomInt(10, 99), 
                randomInt(1000, 9999));
    }
    
    private static String randomPhone() {
        return String.format("(%03d) %03d-%04d", 
                randomInt(200, 999), 
                randomInt(200, 999), 
                randomInt(1000, 9999));
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Generate a fully populated random loan
        IntStream.range(0,10).forEach(i->{
            Loan basicLoan = LoanTestDataBuilder.buildRandom();
            System.out.println("Full Random Loan " + (i+1) + ":");
            System.out.println(basicLoan);
            System.out.println("\n" + "-".repeat(80) + "\n");
        });

    }
}