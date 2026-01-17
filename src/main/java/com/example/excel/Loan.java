package com.example.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table("LOAN")
@Getter
@Setter
@ToString
public class Loan {

    @Id
    @Column("LOAN_ID")
    @JsonProperty("LOAN_ID")
    private Long loanId;

    @Column("LOAN_NUMBER")
    @JsonProperty("LOAN_NUMBER")
    private String loanNumber;

    @Column("APPLICATION_ID")
    @JsonProperty("APPLICATION_ID")
    private String applicationId;

    @Column("EXTERNAL_LOAN_ID")
    @JsonProperty("EXTERNAL_LOAN_ID")
    private String externalLoanId;

    @Column("LEGACY_LOAN_ID")
    @JsonProperty("LEGACY_LOAN_ID")
    private String legacyLoanId;

    // Borrower Information
    @Column("BORROWER_FIRST_NAME")
    @JsonProperty("BORROWER_FIRST_NAME")
    private String borrowerFirstName;

    @Column("BORROWER_MIDDLE_NAME")
    @JsonProperty("BORROWER_MIDDLE_NAME")
    private String borrowerMiddleName;

    @Column("BORROWER_LAST_NAME")
    @JsonProperty("BORROWER_LAST_NAME")
    private String borrowerLastName;

    @Column("BORROWER_SUFFIX")
    @JsonProperty("BORROWER_SUFFIX")
    private String borrowerSuffix;

    @Column("BORROWER_SSN")
    @JsonProperty("BORROWER_SSN")
    private String borrowerSsn;

    @Column("BORROWER_DATE_OF_BIRTH")
    @JsonProperty("BORROWER_DATE_OF_BIRTH")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate borrowerDateOfBirth;

    @Column("BORROWER_EMAIL")
    @JsonProperty("BORROWER_EMAIL")
    private String borrowerEmail;

    @Column("BORROWER_PHONE")
    @JsonProperty("BORROWER_PHONE")
    private String borrowerPhone;

    @Column("BORROWER_MOBILE")
    @JsonProperty("BORROWER_MOBILE")
    private String borrowerMobile;

    @Column("BORROWER_WORK_PHONE")
    @JsonProperty("BORROWER_WORK_PHONE")
    private String borrowerWorkPhone;

    @Column("BORROWER_MARITAL_STATUS")
    @JsonProperty("BORROWER_MARITAL_STATUS")
    private String borrowerMaritalStatus;

    @Column("BORROWER_CITIZENSHIP")
    @JsonProperty("BORROWER_CITIZENSHIP")
    private String borrowerCitizenship;

    @Column("BORROWER_RESIDENCY_STATUS")
    @JsonProperty("BORROWER_RESIDENCY_STATUS")
    private String borrowerResidencyStatus;

    @Column("BORROWER_EMPLOYMENT_STATUS")
    @JsonProperty("BORROWER_EMPLOYMENT_STATUS")
    private String borrowerEmploymentStatus;

    @Column("BORROWER_OCCUPATION")
    @JsonProperty("BORROWER_OCCUPATION")
    private String borrowerOccupation;

    @Column("BORROWER_EMPLOYER_NAME")
    @JsonProperty("BORROWER_EMPLOYER_NAME")
    private String borrowerEmployerName;

    @Column("BORROWER_EMPLOYER_PHONE")
    @JsonProperty("BORROWER_EMPLOYER_PHONE")
    private String borrowerEmployerPhone;

    @Column("BORROWER_YEARS_EMPLOYED")
    @JsonProperty("BORROWER_YEARS_EMPLOYED")
    private BigDecimal borrowerYearsEmployed;

    @Column("BORROWER_MONTHLY_INCOME")
    @JsonProperty("BORROWER_MONTHLY_INCOME")
    private BigDecimal borrowerMonthlyIncome;

    @Column("BORROWER_ANNUAL_INCOME")
    @JsonProperty("BORROWER_ANNUAL_INCOME")
    private BigDecimal borrowerAnnualIncome;

    @Column("BORROWER_OTHER_INCOME")
    @JsonProperty("BORROWER_OTHER_INCOME")
    private BigDecimal borrowerOtherIncome;

    @Column("BORROWER_CREDIT_SCORE")
    @JsonProperty("BORROWER_CREDIT_SCORE")
    private Integer borrowerCreditScore;

    @Column("BORROWER_EDUCATION_LEVEL")
    @JsonProperty("BORROWER_EDUCATION_LEVEL")
    private String borrowerEducationLevel;

    @Column("BORROWER_DEPENDENTS")
    @JsonProperty("BORROWER_DEPENDENTS")
    private Integer borrowerDependents;

    @Column("BORROWER_HOUSING_STATUS")
    @JsonProperty("BORROWER_HOUSING_STATUS")
    private String borrowerHousingStatus;

    // Co-Borrower Information
    @Column("CO_BORROWER_FIRST_NAME")
    @JsonProperty("CO_BORROWER_FIRST_NAME")
    private String coBorrowerFirstName;

    @Column("CO_BORROWER_MIDDLE_NAME")
    @JsonProperty("CO_BORROWER_MIDDLE_NAME")
    private String coBorrowerMiddleName;

    @Column("CO_BORROWER_LAST_NAME")
    @JsonProperty("CO_BORROWER_LAST_NAME")
    private String coBorrowerLastName;

    @Column("CO_BORROWER_SUFFIX")
    @JsonProperty("CO_BORROWER_SUFFIX")
    private String coBorrowerSuffix;

    @Column("CO_BORROWER_SSN")
    @JsonProperty("CO_BORROWER_SSN")
    private String coBorrowerSsn;

    @Column("CO_BORROWER_DATE_OF_BIRTH")
    @JsonProperty("CO_BORROWER_DATE_OF_BIRTH")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate coBorrowerDateOfBirth;

    @Column("CO_BORROWER_EMAIL")
    @JsonProperty("CO_BORROWER_EMAIL")
    private String coBorrowerEmail;

    @Column("CO_BORROWER_PHONE")
    @JsonProperty("CO_BORROWER_PHONE")
    private String coBorrowerPhone;

    @Column("CO_BORROWER_MOBILE")
    @JsonProperty("CO_BORROWER_MOBILE")
    private String coBorrowerMobile;

    @Column("CO_BORROWER_WORK_PHONE")
    @JsonProperty("CO_BORROWER_WORK_PHONE")
    private String coBorrowerWorkPhone;

    @Column("CO_BORROWER_MARITAL_STATUS")
    @JsonProperty("CO_BORROWER_MARITAL_STATUS")
    private String coBorrowerMaritalStatus;

    @Column("CO_BORROWER_CITIZENSHIP")
    @JsonProperty("CO_BORROWER_CITIZENSHIP")
    private String coBorrowerCitizenship;

    @Column("CO_BORROWER_RESIDENCY_STATUS")
    @JsonProperty("CO_BORROWER_RESIDENCY_STATUS")
    private String coBorrowerResidencyStatus;

    @Column("CO_BORROWER_EMPLOYMENT_STATUS")
    @JsonProperty("CO_BORROWER_EMPLOYMENT_STATUS")
    private String coBorrowerEmploymentStatus;

    @Column("CO_BORROWER_OCCUPATION")
    @JsonProperty("CO_BORROWER_OCCUPATION")
    private String coBorrowerOccupation;

    @Column("CO_BORROWER_EMPLOYER_NAME")
    @JsonProperty("CO_BORROWER_EMPLOYER_NAME")
    private String coBorrowerEmployerName;

    @Column("CO_BORROWER_EMPLOYER_PHONE")
    @JsonProperty("CO_BORROWER_EMPLOYER_PHONE")
    private String coBorrowerEmployerPhone;

    @Column("CO_BORROWER_YEARS_EMPLOYED")
    @JsonProperty("CO_BORROWER_YEARS_EMPLOYED")
    private BigDecimal coBorrowerYearsEmployed;

    @Column("CO_BORROWER_MONTHLY_INCOME")
    @JsonProperty("CO_BORROWER_MONTHLY_INCOME")
    private BigDecimal coBorrowerMonthlyIncome;

    @Column("CO_BORROWER_ANNUAL_INCOME")
    @JsonProperty("CO_BORROWER_ANNUAL_INCOME")
    private BigDecimal coBorrowerAnnualIncome;

    @Column("CO_BORROWER_OTHER_INCOME")
    @JsonProperty("CO_BORROWER_OTHER_INCOME")
    private BigDecimal coBorrowerOtherIncome;

    @Column("CO_BORROWER_CREDIT_SCORE")
    @JsonProperty("CO_BORROWER_CREDIT_SCORE")
    private Integer coBorrowerCreditScore;

    @Column("CO_BORROWER_EDUCATION_LEVEL")
    @JsonProperty("CO_BORROWER_EDUCATION_LEVEL")
    private String coBorrowerEducationLevel;

    @Column("CO_BORROWER_DEPENDENTS")
    @JsonProperty("CO_BORROWER_DEPENDENTS")
    private Integer coBorrowerDependents;

    @Column("CO_BORROWER_HOUSING_STATUS")
    @JsonProperty("CO_BORROWER_HOUSING_STATUS")
    private String coBorrowerHousingStatus;

    // Property Address
    @Column("PROPERTY_ADDRESS_LINE1")
    @JsonProperty("PROPERTY_ADDRESS_LINE1")
    private String propertyAddressLine1;

    @Column("PROPERTY_ADDRESS_LINE2")
    @JsonProperty("PROPERTY_ADDRESS_LINE2")
    private String propertyAddressLine2;

    @Column("PROPERTY_CITY")
    @JsonProperty("PROPERTY_CITY")
    private String propertyCity;

    @Column("PROPERTY_STATE")
    @JsonProperty("PROPERTY_STATE")
    private String propertyState;

    @Column("PROPERTY_ZIP_CODE")
    @JsonProperty("PROPERTY_ZIP_CODE")
    private String propertyZipCode;

    @Column("PROPERTY_COUNTY")
    @JsonProperty("PROPERTY_COUNTY")
    private String propertyCounty;

    @Column("PROPERTY_COUNTRY")
    @JsonProperty("PROPERTY_COUNTRY")
    private String propertyCountry;

    // Mailing Address
    @Column("MAILING_ADDRESS_LINE1")
    @JsonProperty("MAILING_ADDRESS_LINE1")
    private String mailingAddressLine1;

    @Column("MAILING_ADDRESS_LINE2")
    @JsonProperty("MAILING_ADDRESS_LINE2")
    private String mailingAddressLine2;

    @Column("MAILING_CITY")
    @JsonProperty("MAILING_CITY")
    private String mailingCity;

    @Column("MAILING_STATE")
    @JsonProperty("MAILING_STATE")
    private String mailingState;

    @Column("MAILING_ZIP_CODE")
    @JsonProperty("MAILING_ZIP_CODE")
    private String mailingZipCode;

    @Column("MAILING_COUNTY")
    @JsonProperty("MAILING_COUNTY")
    private String mailingCounty;

    @Column("MAILING_COUNTRY")
    @JsonProperty("MAILING_COUNTRY")
    private String mailingCountry;

    // Previous Address
    @Column("PREVIOUS_ADDRESS_LINE1")
    @JsonProperty("PREVIOUS_ADDRESS_LINE1")
    private String previousAddressLine1;

    @Column("PREVIOUS_CITY")
    @JsonProperty("PREVIOUS_CITY")
    private String previousCity;

    @Column("PREVIOUS_STATE")
    @JsonProperty("PREVIOUS_STATE")
    private String previousState;

    @Column("PREVIOUS_ZIP_CODE")
    @JsonProperty("PREVIOUS_ZIP_CODE")
    private String previousZipCode;

    @Column("YEARS_AT_CURRENT_ADDRESS")
    @JsonProperty("YEARS_AT_CURRENT_ADDRESS")
    private BigDecimal yearsAtCurrentAddress;

    @Column("MONTHS_AT_CURRENT_ADDRESS")
    @JsonProperty("MONTHS_AT_CURRENT_ADDRESS")
    private Integer monthsAtCurrentAddress;

    // Loan Details
    @Column("LOAN_TYPE")
    @JsonProperty("LOAN_TYPE")
    private String loanType;

    @Column("LOAN_PURPOSE")
    @JsonProperty("LOAN_PURPOSE")
    private String loanPurpose;

    @Column("LOAN_AMOUNT")
    @JsonProperty("LOAN_AMOUNT")
    private BigDecimal loanAmount;

    @Column("REQUESTED_AMOUNT")
    @JsonProperty("REQUESTED_AMOUNT")
    private BigDecimal requestedAmount;

    @Column("APPROVED_AMOUNT")
    @JsonProperty("APPROVED_AMOUNT")
    private BigDecimal approvedAmount;

    @Column("DISBURSED_AMOUNT")
    @JsonProperty("DISBURSED_AMOUNT")
    private BigDecimal disbursedAmount;

    @Column("OUTSTANDING_BALANCE")
    @JsonProperty("OUTSTANDING_BALANCE")
    private BigDecimal outstandingBalance;

    @Column("PRINCIPAL_BALANCE")
    @JsonProperty("PRINCIPAL_BALANCE")
    private BigDecimal principalBalance;

    @Column("INTEREST_RATE")
    @JsonProperty("INTEREST_RATE")
    private BigDecimal interestRate;

    @Column("ANNUAL_PERCENTAGE_RATE")
    @JsonProperty("ANNUAL_PERCENTAGE_RATE")
    private BigDecimal annualPercentageRate;

    @Column("LOAN_TERM_MONTHS")
    @JsonProperty("LOAN_TERM_MONTHS")
    private Integer loanTermMonths;

    @Column("REMAINING_TERM_MONTHS")
    @JsonProperty("REMAINING_TERM_MONTHS")
    private Integer remainingTermMonths;

    @Column("PAYMENT_FREQUENCY")
    @JsonProperty("PAYMENT_FREQUENCY")
    private String paymentFrequency;

    @Column("MONTHLY_PAYMENT")
    @JsonProperty("MONTHLY_PAYMENT")
    private BigDecimal monthlyPayment;

    @Column("FIRST_PAYMENT_DATE")
    @JsonProperty("FIRST_PAYMENT_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate firstPaymentDate;

    @Column("MATURITY_DATE")
    @JsonProperty("MATURITY_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate maturityDate;

    @Column("LOAN_STATUS")
    @JsonProperty("LOAN_STATUS")
    private String loanStatus;

    @Column("LOAN_SUB_STATUS")
    @JsonProperty("LOAN_SUB_STATUS")
    private String loanSubStatus;

    @Column("ORIGINATION_DATE")
    @JsonProperty("ORIGINATION_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate originationDate;

    @Column("FUNDING_DATE")
    @JsonProperty("FUNDING_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fundingDate;

    @Column("APPLICATION_DATE")
    @JsonProperty("APPLICATION_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate applicationDate;

    @Column("APPROVAL_DATE")
    @JsonProperty("APPROVAL_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate approvalDate;

    @Column("CLOSING_DATE")
    @JsonProperty("CLOSING_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate closingDate;

    @Column("FIRST_DISBURSEMENT_DATE")
    @JsonProperty("FIRST_DISBURSEMENT_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate firstDisbursementDate;

    // Loan Officers
    @Column("LOAN_OFFICER_ID")
    @JsonProperty("LOAN_OFFICER_ID")
    private String loanOfficerId;

    @Column("LOAN_OFFICER_NAME")
    @JsonProperty("LOAN_OFFICER_NAME")
    private String loanOfficerName;

    @Column("UNDERWRITER_ID")
    @JsonProperty("UNDERWRITER_ID")
    private String underwriterId;

    @Column("UNDERWRITER_NAME")
    @JsonProperty("UNDERWRITER_NAME")
    private String underwriterName;

    @Column("PROCESSOR_ID")
    @JsonProperty("PROCESSOR_ID")
    private String processorId;

    @Column("PROCESSOR_NAME")
    @JsonProperty("PROCESSOR_NAME")
    private String processorName;

    // Fees
    @Column("ORIGINATION_FEE")
    @JsonProperty("ORIGINATION_FEE")
    private BigDecimal originationFee;

    @Column("PROCESSING_FEE")
    @JsonProperty("PROCESSING_FEE")
    private BigDecimal processingFee;

    @Column("LATE_FEE_AMOUNT")
    @JsonProperty("LATE_FEE_AMOUNT")
    private BigDecimal lateFeeAmount;

    @Column("PREPAYMENT_PENALTY")
    @JsonProperty("PREPAYMENT_PENALTY")
    private BigDecimal prepaymentPenalty;

    @Column("LOAN_TO_VALUE_RATIO")
    @JsonProperty("LOAN_TO_VALUE_RATIO")
    private BigDecimal loanToValueRatio;

    // Property Details
    @Column("PROPERTY_TYPE")
    @JsonProperty("PROPERTY_TYPE")
    private String propertyType;

    @Column("PROPERTY_USE")
    @JsonProperty("PROPERTY_USE")
    private String propertyUse;

    @Column("PROPERTY_VALUE")
    @JsonProperty("PROPERTY_VALUE")
    private BigDecimal propertyValue;

    @Column("APPRAISED_VALUE")
    @JsonProperty("APPRAISED_VALUE")
    private BigDecimal appraisedValue;

    @Column("PURCHASE_PRICE")
    @JsonProperty("PURCHASE_PRICE")
    private BigDecimal purchasePrice;

    @Column("PROPERTY_YEAR_BUILT")
    @JsonProperty("PROPERTY_YEAR_BUILT")
    private Integer propertyYearBuilt;

    @Column("PROPERTY_SQUARE_FEET")
    @JsonProperty("PROPERTY_SQUARE_FEET")
    private Integer propertySquareFeet;

    @Column("PROPERTY_BEDROOMS")
    @JsonProperty("PROPERTY_BEDROOMS")
    private Integer propertyBedrooms;

    @Column("PROPERTY_BATHROOMS")
    @JsonProperty("PROPERTY_BATHROOMS")
    private BigDecimal propertyBathrooms;

    @Column("PROPERTY_STORIES")
    @JsonProperty("PROPERTY_STORIES")
    private Integer propertyStories;

    @Column("PROPERTY_GARAGE_SPACES")
    @JsonProperty("PROPERTY_GARAGE_SPACES")
    private Integer propertyGarageSpaces;

    @Column("PROPERTY_LOT_SIZE")
    @JsonProperty("PROPERTY_LOT_SIZE")
    private BigDecimal propertyLotSize;

    @Column("PROPERTY_CONDITION")
    @JsonProperty("PROPERTY_CONDITION")
    private String propertyCondition;

    @Column("PROPERTY_ZONING")
    @JsonProperty("PROPERTY_ZONING")
    private String propertyZoning;

    @Column("HOA_FEE")
    @JsonProperty("HOA_FEE")
    private BigDecimal hoaFee;

    @Column("PROPERTY_TAX_ANNUAL")
    @JsonProperty("PROPERTY_TAX_ANNUAL")
    private BigDecimal propertyTaxAnnual;

    @Column("HOMEOWNERS_INSURANCE")
    @JsonProperty("HOMEOWNERS_INSURANCE")
    private BigDecimal homeownersInsurance;

    @Column("FLOOD_INSURANCE")
    @JsonProperty("FLOOD_INSURANCE")
    private BigDecimal floodInsurance;

    @Column("PMI_AMOUNT")
    @JsonProperty("PMI_AMOUNT")
    private BigDecimal pmiAmount;

    @Column("ESCROW_ACCOUNT_BALANCE")
    @JsonProperty("ESCROW_ACCOUNT_BALANCE")
    private BigDecimal escrowAccountBalance;

    @Column("DOWN_PAYMENT_AMOUNT")
    @JsonProperty("DOWN_PAYMENT_AMOUNT")
    private BigDecimal downPaymentAmount;

    @Column("DOWN_PAYMENT_PERCENTAGE")
    @JsonProperty("DOWN_PAYMENT_PERCENTAGE")
    private BigDecimal downPaymentPercentage;

    // Financial Ratios
    @Column("DEBT_TO_INCOME_RATIO")
    @JsonProperty("DEBT_TO_INCOME_RATIO")
    private BigDecimal debtToIncomeRatio;

    @Column("FRONT_END_RATIO")
    @JsonProperty("FRONT_END_RATIO")
    private BigDecimal frontEndRatio;

    @Column("BACK_END_RATIO")
    @JsonProperty("BACK_END_RATIO")
    private BigDecimal backEndRatio;

    @Column("TOTAL_MONTHLY_DEBT")
    @JsonProperty("TOTAL_MONTHLY_DEBT")
    private BigDecimal totalMonthlyDebt;

    @Column("AUTO_LOAN_PAYMENT")
    @JsonProperty("AUTO_LOAN_PAYMENT")
    private BigDecimal autoLoanPayment;

    @Column("CREDIT_CARD_PAYMENT")
    @JsonProperty("CREDIT_CARD_PAYMENT")
    private BigDecimal creditCardPayment;

    @Column("STUDENT_LOAN_PAYMENT")
    @JsonProperty("STUDENT_LOAN_PAYMENT")
    private BigDecimal studentLoanPayment;

    @Column("OTHER_LOAN_PAYMENT")
    @JsonProperty("OTHER_LOAN_PAYMENT")
    private BigDecimal otherLoanPayment;

    @Column("ALIMONY_PAYMENT")
    @JsonProperty("ALIMONY_PAYMENT")
    private BigDecimal alimonyPayment;

    @Column("CHILD_SUPPORT_PAYMENT")
    @JsonProperty("CHILD_SUPPORT_PAYMENT")
    private BigDecimal childSupportPayment;

    // Assets and Liabilities
    @Column("TOTAL_ASSETS")
    @JsonProperty("TOTAL_ASSETS")
    private BigDecimal totalAssets;

    @Column("LIQUID_ASSETS")
    @JsonProperty("LIQUID_ASSETS")
    private BigDecimal liquidAssets;

    @Column("CHECKING_ACCOUNT_BALANCE")
    @JsonProperty("CHECKING_ACCOUNT_BALANCE")
    private BigDecimal checkingAccountBalance;

    @Column("SAVINGS_ACCOUNT_BALANCE")
    @JsonProperty("SAVINGS_ACCOUNT_BALANCE")
    private BigDecimal savingsAccountBalance;

    @Column("RETIREMENT_ACCOUNT_BALANCE")
    @JsonProperty("RETIREMENT_ACCOUNT_BALANCE")
    private BigDecimal retirementAccountBalance;

    @Column("INVESTMENT_ACCOUNT_BALANCE")
    @JsonProperty("INVESTMENT_ACCOUNT_BALANCE")
    private BigDecimal investmentAccountBalance;

    @Column("TOTAL_LIABILITIES")
    @JsonProperty("TOTAL_LIABILITIES")
    private BigDecimal totalLiabilities;

    @Column("CREDIT_CARD_DEBT")
    @JsonProperty("CREDIT_CARD_DEBT")
    private BigDecimal creditCardDebt;

    @Column("OUTSTANDING_JUDGMENTS")
    @JsonProperty("OUTSTANDING_JUDGMENTS")
    private BigDecimal outstandingJudgments;

    @Column("TAX_LIENS")
    @JsonProperty("TAX_LIENS")
    private BigDecimal taxLiens;

    @Column("BANKRUPTCY_FLAG")
    @JsonProperty("BANKRUPTCY_FLAG")
    private Boolean bankruptcyFlag;

    @Column("FORECLOSURE_FLAG")
    @JsonProperty("FORECLOSURE_FLAG")
    private Boolean foreclosureFlag;

    @Column("SHORT_SALE_FLAG")
    @JsonProperty("SHORT_SALE_FLAG")
    private Boolean shortSaleFlag;

    // Risk and Compliance
    @Column("RISK_RATING")
    @JsonProperty("RISK_RATING")
    private String riskRating;

    @Column("RISK_SCORE")
    @JsonProperty("RISK_SCORE")
    private BigDecimal riskScore;

    @Column("FRAUD_SCORE")
    @JsonProperty("FRAUD_SCORE")
    private BigDecimal fraudScore;

    @Column("COMPLIANCE_STATUS")
    @JsonProperty("COMPLIANCE_STATUS")
    private String complianceStatus;

    @Column("KYC_STATUS")
    @JsonProperty("KYC_STATUS")
    private String kycStatus;

    @Column("KYC_VERIFICATION_DATE")
    @JsonProperty("KYC_VERIFICATION_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate kycVerificationDate;

    @Column("AML_STATUS")
    @JsonProperty("AML_STATUS")
    private String amlStatus;

    @Column("AML_VERIFICATION_DATE")
    @JsonProperty("AML_VERIFICATION_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate amlVerificationDate;

    @Column("OFAC_STATUS")
    @JsonProperty("OFAC_STATUS")
    private String ofacStatus;

    @Column("OFAC_CHECK_DATE")
    @JsonProperty("OFAC_CHECK_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate ofacCheckDate;

    @Column("CREDIT_CHECK_DATE")
    @JsonProperty("CREDIT_CHECK_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate creditCheckDate;

    @Column("INCOME_VERIFICATION_STATUS")
    @JsonProperty("INCOME_VERIFICATION_STATUS")
    private String incomeVerificationStatus;

    @Column("EMPLOYMENT_VERIFICATION_STATUS")
    @JsonProperty("EMPLOYMENT_VERIFICATION_STATUS")
    private String employmentVerificationStatus;

    @Column("ASSET_VERIFICATION_STATUS")
    @JsonProperty("ASSET_VERIFICATION_STATUS")
    private String assetVerificationStatus;

    @Column("APPRAISAL_STATUS")
    @JsonProperty("APPRAISAL_STATUS")
    private String appraisalStatus;

    @Column("TITLE_SEARCH_STATUS")
    @JsonProperty("TITLE_SEARCH_STATUS")
    private String titleSearchStatus;

    @Column("INSURANCE_VERIFICATION_STATUS")
    @JsonProperty("INSURANCE_VERIFICATION_STATUS")
    private String insuranceVerificationStatus;

    @Column("REGULATORY_PRODUCT_TYPE")
    @JsonProperty("REGULATORY_PRODUCT_TYPE")
    private String regulatoryProductType;

    @Column("HOEPA_STATUS")
    @JsonProperty("HOEPA_STATUS")
    private String hoepaStatus;

    @Column("HPML_STATUS")
    @JsonProperty("HPML_STATUS")
    private String hpmlStatus;

    // Payment Information
    @Column("LAST_PAYMENT_DATE")
    @JsonProperty("LAST_PAYMENT_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate lastPaymentDate;

    @Column("LAST_PAYMENT_AMOUNT")
    @JsonProperty("LAST_PAYMENT_AMOUNT")
    private BigDecimal lastPaymentAmount;

    @Column("NEXT_PAYMENT_DUE_DATE")
    @JsonProperty("NEXT_PAYMENT_DUE_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate nextPaymentDueDate;

    @Column("NEXT_PAYMENT_AMOUNT")
    @JsonProperty("NEXT_PAYMENT_AMOUNT")
    private BigDecimal nextPaymentAmount;

    @Column("TOTAL_PAYMENTS_MADE")
    @JsonProperty("TOTAL_PAYMENTS_MADE")
    private Integer totalPaymentsMade;

    @Column("PAYMENTS_PAST_DUE")
    @JsonProperty("PAYMENTS_PAST_DUE")
    private Integer paymentsPastDue;

    @Column("DAYS_PAST_DUE")
    @JsonProperty("DAYS_PAST_DUE")
    private Integer daysPastDue;

    @Column("TOTAL_PAID_PRINCIPAL")
    @JsonProperty("TOTAL_PAID_PRINCIPAL")
    private BigDecimal totalPaidPrincipal;

    @Column("TOTAL_PAID_INTEREST")
    @JsonProperty("TOTAL_PAID_INTEREST")
    private BigDecimal totalPaidInterest;

    @Column("TOTAL_PAID_FEES")
    @JsonProperty("TOTAL_PAID_FEES")
    private BigDecimal totalPaidFees;

    @Column("LATE_PAYMENT_COUNT")
    @JsonProperty("LATE_PAYMENT_COUNT")
    private Integer latePaymentCount;

    @Column("MISSED_PAYMENT_COUNT")
    @JsonProperty("MISSED_PAYMENT_COUNT")
    private Integer missedPaymentCount;

    @Column("PREPAYMENT_AMOUNT")
    @JsonProperty("PREPAYMENT_AMOUNT")
    private BigDecimal prepaymentAmount;

    @Column("PAYOFF_AMOUNT")
    @JsonProperty("PAYOFF_AMOUNT")
    private BigDecimal payoffAmount;

    @Column("PAYOFF_DATE")
    @JsonProperty("PAYOFF_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate payoffDate;

    // Audit Fields
    @Column("CREATED_DATE")
    @JsonProperty("CREATED_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime createdDate;

    @Column("CREATED_BY")
    @JsonProperty("CREATED_BY")
    private String createdBy;

    @Column("MODIFIED_DATE")
    @JsonProperty("MODIFIED_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime modifiedDate;

    @Column("MODIFIED_BY")
    @JsonProperty("MODIFIED_BY")
    private String modifiedBy;

    @Column("VERSION")
    @JsonProperty("VERSION")
    private Integer version;

    @Column("RECORD_STATUS")
    @JsonProperty("RECORD_STATUS")
    private String recordStatus;

    @Column("DATA_SOURCE")
    @JsonProperty("DATA_SOURCE")
    private String dataSource;

    @Column("SOURCE_SYSTEM")
    @JsonProperty("SOURCE_SYSTEM")
    private String sourceSystem;

    @Column("MIGRATION_BATCH_ID")
    @JsonProperty("MIGRATION_BATCH_ID")
    private String migrationBatchId;

    @Column("LAST_SYNC_DATE")
    @JsonProperty("LAST_SYNC_DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime lastSyncDate;

    // Notes
    @Column("NOTES")
    @JsonProperty("NOTES")
    private String notes;

    @Column("INTERNAL_NOTES")
    @JsonProperty("INTERNAL_NOTES")
    private String internalNotes;

    @Column("CUSTOMER_NOTES")
    @JsonProperty("CUSTOMER_NOTES")
    private String customerNotes;

    @Column("SPECIAL_INSTRUCTIONS")
    @JsonProperty("SPECIAL_INSTRUCTIONS")
    private String specialInstructions;

    @Column("TAGS")
    @JsonProperty("TAGS")
    private String tags;

    // Constructors
    public Loan() {
    }
}