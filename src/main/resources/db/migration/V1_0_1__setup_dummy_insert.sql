-- Insert 10 sample loan records

INSERT INTO loan (
    loan_number, application_id, external_loan_id, legacy_loan_id,
    borrower_first_name, borrower_last_name, borrower_ssn, borrower_date_of_birth,
    borrower_email, borrower_phone, borrower_marital_status, borrower_employment_status,
    borrower_monthly_income, borrower_annual_income, borrower_credit_score,
    property_address_line1, property_city, property_state, property_zip_code,
    loan_type, loan_purpose, loan_amount, interest_rate, loan_term_months,
    monthly_payment, loan_status, origination_date, application_date,
    property_type, property_value, down_payment_amount, created_by
) VALUES
(
    'LN-2024-001', 'APP-2024-001', 'EXT-001', 'LEG-001',
    'John', 'Smith', '123-45-6789', '1985-03-15',
    'john.smith@email.com', '555-0101', 'Married', 'Full-Time',
    8500.00, 102000.00, 720,
    '123 Main Street', 'Los Angeles', 'CA', '90001',
    'Conventional', 'Purchase', 450000.00, 6.5000, 360,
    2847.00, 'Active', '2024-01-15', '2023-12-01',
    'Single Family', 500000.00, 50000.00, 'SYSTEM'
),
(
    'LN-2024-002', 'APP-2024-002', 'EXT-002', 'LEG-002',
    'Sarah', 'Johnson', '234-56-7890', '1990-07-22',
    'sarah.johnson@email.com', '555-0102', 'Single', 'Full-Time',
    6200.00, 74400.00, 680,
    '456 Oak Avenue', 'San Francisco', 'CA', '94102',
    'FHA', 'Purchase', 380000.00, 6.7500, 360,
    2465.00, 'Active', '2024-02-01', '2024-01-05',
    'Condo', 400000.00, 20000.00, 'SYSTEM'
),
(
    'LN-2024-003', 'APP-2024-003', 'EXT-003', 'LEG-003',
    'Michael', 'Williams', '345-67-8901', '1982-11-30',
    'michael.w@email.com', '555-0103', 'Married', 'Full-Time',
    12000.00, 144000.00, 750,
    '789 Pine Road', 'Seattle', 'WA', '98101',
    'Conventional', 'Refinance', 320000.00, 6.2500, 360,
    1970.00, 'Active', '2024-03-10', '2024-02-15',
    'Single Family', 450000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-004', 'APP-2024-004', 'EXT-004', 'LEG-004',
    'Emily', 'Brown', '456-78-9012', '1988-05-18',
    'emily.brown@email.com', '555-0104', 'Divorced', 'Full-Time',
    7800.00, 93600.00, 695,
    '321 Elm Street', 'Austin', 'TX', '78701',
    'VA', 'Purchase', 275000.00, 6.0000, 360,
    1649.00, 'Active', '2024-04-05', '2024-03-10',
    'Townhouse', 290000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-005', 'APP-2024-005', 'EXT-005', 'LEG-005',
    'David', 'Martinez', '567-89-0123', '1978-09-25',
    'david.martinez@email.com', '555-0105', 'Married', 'Self-Employed',
    15000.00, 180000.00, 780,
    '654 Maple Drive', 'Miami', 'FL', '33101',
    'Jumbo', 'Purchase', 850000.00, 7.0000, 360,
    5653.00, 'Active', '2024-05-20', '2024-04-01',
    'Single Family', 1000000.00, 150000.00, 'SYSTEM'
),
(
    'LN-2024-006', 'APP-2024-006', 'EXT-006', 'LEG-006',
    'Jennifer', 'Garcia', '678-90-1234', '1992-02-14',
    'jennifer.garcia@email.com', '555-0106', 'Single', 'Full-Time',
    5500.00, 66000.00, 650,
    '987 Cedar Lane', 'Phoenix', 'AZ', '85001',
    'FHA', 'Purchase', 225000.00, 6.8750, 360,
    1480.00, 'In Progress', '2024-06-15', '2024-05-20',
    'Single Family', 240000.00, 15000.00, 'SYSTEM'
),
(
    'LN-2024-007', 'APP-2024-007', 'EXT-007', 'LEG-007',
    'Robert', 'Anderson', '789-01-2345', '1986-12-08',
    'robert.anderson@email.com', '555-0107', 'Married', 'Full-Time',
    9500.00, 114000.00, 710,
    '147 Birch Boulevard', 'Denver', 'CO', '80201',
    'Conventional', 'Purchase', 425000.00, 6.3750, 360,
    2630.00, 'Active', '2024-07-10', '2024-06-05',
    'Single Family', 475000.00, 50000.00, 'SYSTEM'
),
(
    'LN-2024-008', 'APP-2024-008', 'EXT-008', 'LEG-008',
    'Lisa', 'Taylor', '890-12-3456', '1991-08-19',
    'lisa.taylor@email.com', '555-0108', 'Single', 'Full-Time',
    6800.00, 81600.00, 670,
    '258 Spruce Court', 'Portland', 'OR', '97201',
    'Conventional', 'Refinance', 195000.00, 6.5000, 360,
    1232.00, 'Active', '2024-08-22', '2024-07-18',
    'Condo', 250000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-009', 'APP-2024-009', 'EXT-009', 'LEG-009',
    'Christopher', 'Thomas', '901-23-4567', '1984-04-27',
    'chris.thomas@email.com', '555-0109', 'Married', 'Full-Time',
    11000.00, 132000.00, 740,
    '369 Willow Way', 'Boston', 'MA', '02101',
    'Conventional', 'Purchase', 575000.00, 6.4500, 360,
    3595.00, 'Active', '2024-09-15', '2024-08-10',
    'Single Family', 625000.00, 62500.00, 'SYSTEM'
),
(
    'LN-2024-010', 'APP-2024-010', 'EXT-010', 'LEG-010',
    'Amanda', 'White', '012-34-5678', '1989-06-11',
    'amanda.white@email.com', '555-0110', 'Married', 'Full-Time',
    8200.00, 98400.00, 700,
    '741 Aspen Street', 'Atlanta', 'GA', '30301',
    'FHA', 'Purchase', 310000.00, 6.6250, 360,
    1999.00, 'In Progress', '2024-10-05', '2024-09-15',
    'Single Family', 330000.00, 20000.00, 'SYSTEM'
),
(
    'LN-2024-011', 'APP-2024-011', 'EXT-011', 'LEG-011',
    'James', 'Harris', '123-45-6780', '1987-01-05',
    'james.harris@email.com', '555-0111', 'Married', 'Full-Time',
    10200.00, 122400.00, 730,
    '852 Redwood Avenue', 'San Diego', 'CA', '92101',
    'Conventional', 'Purchase', 520000.00, 6.3500, 360,
    3235.00, 'Active', '2024-11-12', '2024-10-08',
    'Single Family', 560000.00, 56000.00, 'SYSTEM'
),
(
    'LN-2024-012', 'APP-2024-012', 'EXT-012', 'LEG-012',
    'Patricia', 'Clark', '234-56-7891', '1993-03-29',
    'patricia.clark@email.com', '555-0112', 'Single', 'Full-Time',
    5800.00, 69600.00, 665,
    '963 Oakwood Circle', 'Nashville', 'TN', '37201',
    'FHA', 'Purchase', 245000.00, 6.7500, 360,
    1588.00, 'Active', '2024-11-25', '2024-10-20',
    'Condo', 260000.00, 18000.00, 'SYSTEM'
),
(
    'LN-2024-013', 'APP-2024-013', 'EXT-013', 'LEG-013',
    'Daniel', 'Lewis', '345-67-8902', '1980-07-16',
    'daniel.lewis@email.com', '555-0113', 'Divorced', 'Full-Time',
    13500.00, 162000.00, 760,
    '159 Hickory Place', 'Chicago', 'IL', '60601',
    'Conventional', 'Refinance', 385000.00, 6.1250, 360,
    2338.00, 'Active', '2024-12-08', '2024-11-15',
    'Single Family', 550000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-014', 'APP-2024-014', 'EXT-014', 'LEG-014',
    'Michelle', 'Walker', '456-78-9013', '1994-09-12',
    'michelle.walker@email.com', '555-0114', 'Single', 'Full-Time',
    7200.00, 86400.00, 690,
    '357 Sycamore Street', 'Charlotte', 'NC', '28201',
    'Conventional', 'Purchase', 295000.00, 6.5500, 360,
    1865.00, 'In Progress', '2024-12-20', '2024-11-28',
    'Townhouse', 315000.00, 31500.00, 'SYSTEM'
),
(
    'LN-2024-015', 'APP-2024-015', 'EXT-015', 'LEG-015',
    'Kevin', 'Hall', '567-89-0124', '1983-11-03',
    'kevin.hall@email.com', '555-0115', 'Married', 'Self-Employed',
    16500.00, 198000.00, 770,
    '468 Magnolia Drive', 'Dallas', 'TX', '75201',
    'Jumbo', 'Purchase', 925000.00, 7.1250, 360,
    6222.00, 'Active', '2025-01-10', '2024-12-05',
    'Single Family', 1100000.00, 175000.00, 'SYSTEM'
),
(
    'LN-2024-016', 'APP-2024-016', 'EXT-016', 'LEG-016',
    'Barbara', 'Young', '678-90-1235', '1991-05-28',
    'barbara.young@email.com', '555-0116', 'Married', 'Full-Time',
    8900.00, 106800.00, 715,
    '579 Poplar Road', 'Minneapolis', 'MN', '55401',
    'Conventional', 'Purchase', 365000.00, 6.4000, 360,
    2280.00, 'Active', '2025-01-25', '2024-12-18',
    'Single Family', 395000.00, 39500.00, 'SYSTEM'
),
(
    'LN-2024-017', 'APP-2024-017', 'EXT-017', 'LEG-017',
    'Jason', 'King', '789-01-2346', '1988-02-20',
    'jason.king@email.com', '555-0117', 'Single', 'Full-Time',
    6500.00, 78000.00, 675,
    '680 Dogwood Lane', 'Indianapolis', 'IN', '46201',
    'FHA', 'Purchase', 185000.00, 6.8125, 360,
    1220.00, 'In Progress', '2025-02-05', '2025-01-12',
    'Single Family', 198000.00, 12000.00, 'SYSTEM'
),
(
    'LN-2024-018', 'APP-2024-018', 'EXT-018', 'LEG-018',
    'Nancy', 'Wright', '890-12-3457', '1986-08-07',
    'nancy.wright@email.com', '555-0118', 'Married', 'Full-Time',
    9800.00, 117600.00, 725,
    '791 Chestnut Avenue', 'Philadelphia', 'PA', '19101',
    'Conventional', 'Purchase', 410000.00, 6.3250, 360,
    2532.00, 'Active', '2025-02-18', '2025-01-25',
    'Single Family', 445000.00, 44500.00, 'SYSTEM'
),
(
    'LN-2024-019', 'APP-2024-019', 'EXT-019', 'LEG-019',
    'Brian', 'Lopez', '901-23-4568', '1992-12-14',
    'brian.lopez@email.com', '555-0119', 'Single', 'Full-Time',
    7500.00, 90000.00, 685,
    '802 Beech Street', 'Las Vegas', 'NV', '89101',
    'VA', 'Purchase', 315000.00, 6.0000, 360,
    1889.00, 'Active', '2025-03-05', '2025-02-10',
    'Single Family', 330000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-020', 'APP-2024-020', 'EXT-020', 'LEG-020',
    'Sandra', 'Hill', '012-34-5679', '1990-04-22',
    'sandra.hill@email.com', '555-0120', 'Divorced', 'Full-Time',
    8400.00, 100800.00, 705,
    '913 Walnut Court', 'Columbus', 'OH', '43201',
    'Conventional', 'Refinance', 275000.00, 6.2500, 360,
    1694.00, 'Active', '2025-03-20', '2025-02-28',
    'Condo', 325000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-021', 'APP-2024-021', 'EXT-021', 'LEG-021',
    'Mark', 'Scott', '123-45-6781', '1985-10-09',
    'mark.scott@email.com', '555-0121', 'Married', 'Full-Time',
    11500.00, 138000.00, 745,
    '124 Laurel Drive', 'Raleigh', 'NC', '27601',
    'Conventional', 'Purchase', 465000.00, 6.4500, 360,
    2912.00, 'Active', '2025-04-08', '2025-03-15',
    'Single Family', 510000.00, 51000.00, 'SYSTEM'
),
(
    'LN-2024-022', 'APP-2024-022', 'EXT-022', 'LEG-022',
    'Carol', 'Green', '234-56-7892', '1989-06-30',
    'carol.green@email.com', '555-0122', 'Single', 'Full-Time',
    6100.00, 73200.00, 660,
    '235 Juniper Street', 'Salt Lake City', 'UT', '84101',
    'FHA', 'Purchase', 265000.00, 6.9375, 360,
    1756.00, 'In Progress', '2025-04-22', '2025-03-28',
    'Townhouse', 280000.00, 19000.00, 'SYSTEM'
),
(
    'LN-2024-023', 'APP-2024-023', 'EXT-023', 'LEG-023',
    'Steven', 'Adams', '345-67-8903', '1981-01-17',
    'steven.adams@email.com', '555-0123', 'Married', 'Self-Employed',
    14200.00, 170400.00, 755,
    '346 Cypress Lane', 'San Antonio', 'TX', '78201',
    'Conventional', 'Purchase', 535000.00, 6.3750, 360,
    3312.00, 'Active', '2025-05-10', '2025-04-12',
    'Single Family', 590000.00, 59000.00, 'SYSTEM'
),
(
    'LN-2024-024', 'APP-2024-024', 'EXT-024', 'LEG-024',
    'Donna', 'Baker', '456-78-9014', '1995-03-25',
    'donna.baker@email.com', '555-0124', 'Single', 'Full-Time',
    5600.00, 67200.00, 655,
    '457 Fir Avenue', 'Oklahoma City', 'OK', '73101',
    'FHA', 'Purchase', 215000.00, 6.8750, 360,
    1416.00, 'Active', '2025-05-28', '2025-04-25',
    'Single Family', 230000.00, 14000.00, 'SYSTEM'
),
(
    'LN-2024-025', 'APP-2024-025', 'EXT-025', 'LEG-025',
    'Paul', 'Nelson', '567-89-0125', '1987-09-08',
    'paul.nelson@email.com', '555-0125', 'Married', 'Full-Time',
    10800.00, 129600.00, 735,
    '568 Hemlock Road', 'Pittsburgh', 'PA', '15201',
    'Conventional', 'Refinance', 340000.00, 6.1875, 360,
    2072.00, 'Active', '2025-06-15', '2025-05-20',
    'Single Family', 480000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-026', 'APP-2024-026', 'EXT-026', 'LEG-026',
    'Sharon', 'Carter', '678-90-1236', '1993-11-19',
    'sharon.carter@email.com', '555-0126', 'Single', 'Full-Time',
    7800.00, 93600.00, 695,
    '679 Sequoia Place', 'Milwaukee', 'WI', '53201',
    'Conventional', 'Purchase', 325000.00, 6.5000, 360,
    2054.00, 'In Progress', '2025-07-02', '2025-06-08',
    'Condo', 350000.00, 35000.00, 'SYSTEM'
),
(
    'LN-2024-027', 'APP-2024-027', 'EXT-027', 'LEG-027',
    'Gary', 'Mitchell', '789-01-2347', '1984-05-13',
    'gary.mitchell@email.com', '555-0127', 'Married', 'Full-Time',
    12800.00, 153600.00, 750,
    '780 Cottonwood Drive', 'Kansas City', 'MO', '64101',
    'Conventional', 'Purchase', 495000.00, 6.3500, 360,
    3081.00, 'Active', '2025-07-20', '2025-06-22',
    'Single Family', 540000.00, 54000.00, 'SYSTEM'
),
(
    'LN-2024-028', 'APP-2024-028', 'EXT-028', 'LEG-028',
    'Helen', 'Perez', '890-12-3458', '1991-08-02',
    'helen.perez@email.com', '555-0128', 'Single', 'Full-Time',
    6400.00, 76800.00, 670,
    '891 Pinecone Court', 'Albuquerque', 'NM', '87101',
    'FHA', 'Purchase', 238000.00, 6.8125, 360,
    1569.00, 'Active', '2025-08-05', '2025-07-10',
    'Townhouse', 252000.00, 17000.00, 'SYSTEM'
),
(
    'LN-2024-029', 'APP-2024-029', 'EXT-029', 'LEG-029',
    'Timothy', 'Roberts', '901-23-4569', '1986-12-27',
    'timothy.roberts@email.com', '555-0129', 'Married', 'Full-Time',
    9200.00, 110400.00, 720,
    '902 Cedarwood Lane', 'Richmond', 'VA', '23218',
    'VA', 'Purchase', 355000.00, 6.0000, 360,
    2129.00, 'Active', '2025-08-25', '2025-07-28',
    'Single Family', 372000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-030', 'APP-2024-030', 'EXT-030', 'LEG-030',
    'Betty', 'Turner', '012-34-5670', '1988-02-11',
    'betty.turner@email.com', '555-0130', 'Divorced', 'Full-Time',
    8600.00, 103200.00, 710,
    '113 Maplewood Avenue', 'Louisville', 'KY', '40201',
    'Conventional', 'Purchase', 298000.00, 6.4250, 360,
    1853.00, 'In Progress', '2025-09-12', '2025-08-15',
    'Single Family', 320000.00, 32000.00, 'SYSTEM'
),
(
    'LN-2024-031', 'APP-2024-031', 'EXT-031', 'LEG-031',
    'Kenneth', 'Phillips', '123-45-6782', '1990-07-04',
    'kenneth.phillips@email.com', '555-0131', 'Married', 'Full-Time',
    11200.00, 134400.00, 740,
    '224 Birchwood Street', 'Memphis', 'TN', '38101',
    'Conventional', 'Purchase', 385000.00, 6.3750, 360,
    2383.00, 'Active', '2025-09-28', '2025-08-30',
    'Single Family', 425000.00, 42500.00, 'SYSTEM'
),
(
    'LN-2024-032', 'APP-2024-032', 'EXT-032', 'LEG-032',
    'Dorothy', 'Campbell', '234-56-7893', '1994-04-16',
    'dorothy.campbell@email.com', '555-0132', 'Single', 'Full-Time',
    6800.00, 81600.00, 680,
    '335 Rosewood Circle', 'Baltimore', 'MD', '21201',
    'FHA', 'Purchase', 255000.00, 6.7500, 360,
    1653.00, 'Active', '2025-10-15', '2025-09-18',
    'Condo', 270000.00, 18500.00, 'SYSTEM'
),
(
    'LN-2024-033', 'APP-2024-033', 'EXT-033', 'LEG-033',
    'Larry', 'Parker', '345-67-8904', '1982-10-21',
    'larry.parker@email.com', '555-0133', 'Married', 'Self-Employed',
    17500.00, 210000.00, 775,
    '446 Ashwood Drive', 'Jacksonville', 'FL', '32099',
    'Jumbo', 'Purchase', 1050000.00, 7.2500, 360,
    7153.00, 'Active', '2025-11-02', '2025-10-05',
    'Single Family', 1250000.00, 200000.00, 'SYSTEM'
),
(
    'LN-2024-034', 'APP-2024-034', 'EXT-034', 'LEG-034',
    'Angela', 'Evans', '456-78-9015', '1989-01-28',
    'angela.evans@email.com', '555-0134', 'Single', 'Full-Time',
    7400.00, 88800.00, 690,
    '557 Elmwood Place', 'Tucson', 'AZ', '85701',
    'Conventional', 'Purchase', 305000.00, 6.5500, 360,
    1928.00, 'In Progress', '2025-11-20', '2025-10-25',
    'Townhouse', 325000.00, 32500.00, 'SYSTEM'
),
(
    'LN-2024-035', 'APP-2024-035', 'EXT-035', 'LEG-035',
    'Jerry', 'Edwards', '567-89-0126', '1985-05-14',
    'jerry.edwards@email.com', '555-0135', 'Married', 'Full-Time',
    10500.00, 126000.00, 725,
    '668 Oakmont Avenue', 'Fresno', 'CA', '93650',
    'Conventional', 'Refinance', 365000.00, 6.2000, 360,
    2239.00, 'Active', '2025-12-08', '2025-11-12',
    'Single Family', 515000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-036', 'APP-2024-036', 'EXT-036', 'LEG-036',
    'Marilyn', 'Collins', '678-90-1237', '1992-09-06',
    'marilyn.collins@email.com', '555-0136', 'Single', 'Full-Time',
    6200.00, 74400.00, 665,
    '779 Lakeside Road', 'Sacramento', 'CA', '94203',
    'FHA', 'Purchase', 268000.00, 6.8750, 360,
    1765.00, 'Active', '2025-12-22', '2025-11-28',
    'Single Family', 285000.00, 19000.00, 'SYSTEM'
),
(
    'LN-2024-037', 'APP-2024-037', 'EXT-037', 'LEG-037',
    'Willie', 'Stewart', '789-01-2348', '1987-11-23',
    'willie.stewart@email.com', '555-0137', 'Married', 'Full-Time',
    9600.00, 115200.00, 715,
    '880 Parkview Lane', 'Mesa', 'AZ', '85201',
    'VA', 'Purchase', 340000.00, 6.0000, 360,
    2039.00, 'Active', '2026-01-10', '2025-12-15',
    'Single Family', 357000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-038', 'APP-2024-038', 'EXT-038', 'LEG-038',
    'Rachel', 'Morris', '890-12-3459', '1991-03-18',
    'rachel.morris@email.com', '555-0138', 'Divorced', 'Full-Time',
    8100.00, 97200.00, 700,
    '991 Hillcrest Drive', 'Omaha', 'NE', '68102',
    'Conventional', 'Purchase', 285000.00, 6.4500, 360,
    1786.00, 'In Progress', '2026-01-25', '2025-12-30',
    'Condo', 305000.00, 30500.00, 'SYSTEM'
),
(
    'LN-2024-039', 'APP-2024-039', 'EXT-039', 'LEG-039',
    'Arthur', 'Rogers', '901-23-4570', '1983-07-09',
    'arthur.rogers@email.com', '555-0139', 'Married', 'Full-Time',
    13200.00, 158400.00, 755,
    '102 Valleyview Court', 'Long Beach', 'CA', '90802',
    'Conventional', 'Purchase', 615000.00, 6.4000, 360,
    3845.00, 'Active', '2026-02-12', '2026-01-15',
    'Single Family', 675000.00, 67500.00, 'SYSTEM'
),
(
    'LN-2024-040', 'APP-2024-040', 'EXT-040', 'LEG-040',
    'Janice', 'Reed', '012-34-5671', '1990-12-01',
    'janice.reed@email.com', '555-0140', 'Single', 'Full-Time',
    5900.00, 70800.00, 660,
    '213 Meadowbrook Street', 'Tulsa', 'OK', '74103',
    'FHA', 'Purchase', 220000.00, 6.9375, 360,
    1459.00, 'Active', '2026-02-28', '2026-01-30',
    'Townhouse', 235000.00, 15500.00, 'SYSTEM'
),
(
    'LN-2024-041', 'APP-2024-041', 'EXT-041', 'LEG-041',
    'Carl', 'Cook', '123-45-6783', '1986-04-12',
    'carl.cook@email.com', '555-0141', 'Married', 'Self-Employed',
    15800.00, 189600.00, 765,
    '324 Mountainview Drive', 'Colorado Springs', 'CO', '80903',
    'Conventional', 'Purchase', 545000.00, 6.3250, 360,
    3365.00, 'Active', '2026-03-15', '2026-02-18',
    'Single Family', 600000.00, 60000.00, 'SYSTEM'
),
(
    'LN-2024-042', 'APP-2024-042', 'EXT-042', 'LEG-042',
    'Theresa', 'Morgan', '234-56-7894', '1993-08-24',
    'theresa.morgan@email.com', '555-0142', 'Single', 'Full-Time',
    7100.00, 85200.00, 685,
    '435 Riverside Avenue', 'Wichita', 'KS', '67202',
    'Conventional', 'Refinance', 255000.00, 6.2500, 360,
    1571.00, 'Active', '2026-04-02', '2026-03-05',
    'Single Family', 360000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-043', 'APP-2024-043', 'EXT-043', 'LEG-043',
    'Albert', 'Bell', '345-67-8905', '1984-02-07',
    'albert.bell@email.com', '555-0143', 'Married', 'Full-Time',
    11800.00, 141600.00, 745,
    '546 Forestwood Place', 'Arlington', 'TX', '76010',
    'Conventional', 'Purchase', 475000.00, 6.4250, 360,
    2955.00, 'Active', '2026-04-20', '2026-03-22',
    'Single Family', 520000.00, 52000.00, 'SYSTEM'
),
(
    'LN-2024-044', 'APP-2024-044', 'EXT-044', 'LEG-044',
    'Gloria', 'Murphy', '456-78-9016', '1991-06-15',
    'gloria.murphy@email.com', '555-0144', 'Single', 'Full-Time',
    6600.00, 79200.00, 675,
    '657 Sunset Boulevard', 'Tampa', 'FL', '33602',
    'FHA', 'Purchase', 248000.00, 6.8125, 360,
    1635.00, 'In Progress', '2026-05-08', '2026-04-10',
    'Condo', 263000.00, 17800.00, 'SYSTEM'
),
(
    'LN-2024-045', 'APP-2024-045', 'EXT-045', 'LEG-045',
    'Frank', 'Bailey', '567-89-0127', '1988-10-29',
    'frank.bailey@email.com', '555-0145', 'Married', 'Full-Time',
    10100.00, 121200.00, 730,
    '768 Creekside Lane', 'Honolulu', 'HI', '96813',
    'Conventional', 'Purchase', 725000.00, 6.5500, 360,
    4585.00, 'Active', '2026-05-25', '2026-04-28',
    'Single Family', 800000.00, 80000.00, 'SYSTEM'
),
(
    'LN-2024-046', 'APP-2024-046', 'EXT-046', 'LEG-046',
    'Deborah', 'Rivera', '678-90-1238', '1992-01-11',
    'deborah.rivera@email.com', '555-0146', 'Single', 'Full-Time',
    7600.00, 91200.00, 695,
    '879 Oceanview Drive', 'Virginia Beach', 'VA', '23451',
    'VA', 'Purchase', 328000.00, 6.0000, 360,
    1967.00, 'Active', '2026-06-12', '2026-05-15',
    'Townhouse', 345000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-047', 'APP-2024-047', 'EXT-047', 'LEG-047',
    'Peter', 'Cooper', '789-01-2349', '1985-09-03',
    'peter.cooper@email.com', '555-0147', 'Married', 'Full-Time',
    12500.00, 150000.00, 750,
    '980 Harborview Court', 'Oakland', 'CA', '94612',
    'Conventional', 'Refinance', 485000.00, 6.1875, 360,
    2952.00, 'Active', '2026-06-30', '2026-06-02',
    'Single Family', 690000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-048', 'APP-2024-048', 'EXT-048', 'LEG-048',
    'Ruth', 'Richardson', '890-12-3460', '1990-05-26',
    'ruth.richardson@email.com', '555-0148', 'Divorced', 'Full-Time',
    8300.00, 99600.00, 705,
    '191 Bayside Avenue', 'Aurora', 'CO', '80012',
    'Conventional', 'Purchase', 395000.00, 6.4500, 360,
    2476.00, 'In Progress', '2026-07-18', '2026-06-20',
    'Single Family', 430000.00, 43000.00, 'SYSTEM'
),
(
    'LN-2024-049', 'APP-2024-049', 'EXT-049', 'LEG-049',
    'Henry', 'Cox', '901-23-4571', '1987-03-19',
    'henry.cox@email.com', '555-0149', 'Married', 'Self-Employed',
    16200.00, 194400.00, 770,
    '202 Ridgeview Street', 'Anaheim', 'CA', '92805',
    'Jumbo', 'Purchase', 895000.00, 7.0000, 360,
    5955.00, 'Active', '2026-08-05', '2026-07-08',
    'Single Family', 1050000.00, 155000.00, 'SYSTEM'
),
(
    'LN-2024-050', 'APP-2024-050', 'EXT-050', 'LEG-050',
    'Diane', 'Howard', '012-34-5672', '1994-11-08',
    'diane.howard@email.com', '555-0150', 'Single', 'Full-Time',
    6300.00, 75600.00, 670,
    '313 Lakeshore Drive', 'Bakersfield', 'CA', '93301',
    'FHA', 'Purchase', 235000.00, 6.8750, 360,
    1548.00, 'Active', '2026-08-22', '2026-07-25',
    'Single Family', 250000.00, 16500.00, 'SYSTEM'
),
(
    'LN-2024-051', 'APP-2024-051', 'EXT-051', 'LEG-051',
    'Raymond', 'Ward', '123-45-6784', '1983-06-02',
    'raymond.ward@email.com', '555-0151', 'Married', 'Full-Time',
    10900.00, 130800.00, 735,
    '424 Woodland Place', 'Corpus Christi', 'TX', '78401',
    'Conventional', 'Purchase', 345000.00, 6.3500, 360,
    2147.00, 'Active', '2026-09-10', '2026-08-12',
    'Single Family', 380000.00, 38000.00, 'SYSTEM'
),
(
    'LN-2024-052', 'APP-2024-052', 'EXT-052', 'LEG-052',
    'Virginia', 'Torres', '234-56-7895', '1989-12-20',
    'virginia.torres@email.com', '555-0152', 'Single', 'Full-Time',
    7300.00, 87600.00, 690,
    '535 Summit Avenue', 'Lexington', 'KY', '40507',
    'Conventional', 'Refinance', 278000.00, 6.2000, 360,
    1704.00, 'Active', '2026-09-28', '2026-08-30',
    'Condo', 395000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-053', 'APP-2024-053', 'EXT-053', 'LEG-053',
    'Eugene', 'Peterson', '345-67-8906', '1986-08-13',
    'eugene.peterson@email.com', '555-0153', 'Married', 'Full-Time',
    11400.00, 136800.00, 740,
    '646 Glenwood Road', 'Anchorage', 'AK', '99501',
    'VA', 'Purchase', 425000.00, 6.0000, 360,
    2549.00, 'Active', '2026-10-15', '2026-09-18',
    'Single Family', 445000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-054', 'APP-2024-054', 'EXT-054', 'LEG-054',
    'Phyllis', 'Gray', '456-78-9017', '1992-04-06',
    'phyllis.gray@email.com', '555-0154', 'Single', 'Full-Time',
    6700.00, 80400.00, 680,
    '757 Heritage Lane', 'Stockton', 'CA', '95202',
    'FHA', 'Purchase', 258000.00, 6.7500, 360,
    1673.00, 'In Progress', '2026-11-02', '2026-10-05',
    'Townhouse', 275000.00, 18800.00, 'SYSTEM'
),
(
    'LN-2024-055', 'APP-2024-055', 'EXT-055', 'LEG-055',
    'Harold', 'Ramirez', '567-89-0128', '1984-10-17',
    'harold.ramirez@email.com', '555-0155', 'Married', 'Self-Employed',
    14800.00, 177600.00, 760,
    '868 Seaside Court', 'Plano', 'TX', '75023',
    'Conventional', 'Purchase', 565000.00, 6.3750, 360,
    3497.00, 'Active', '2026-11-20', '2026-10-22',
    'Single Family', 620000.00, 62000.00, 'SYSTEM'
),
(
    'LN-2024-056', 'APP-2024-056', 'EXT-056', 'LEG-056',
    'Rebecca', 'James', '678-90-1239', '1991-02-28',
    'rebecca.james@email.com', '555-0156', 'Single', 'Full-Time',
    7900.00, 94800.00, 700,
    '979 Shadowbrook Drive', 'Henderson', 'NV', '89002',
    'Conventional', 'Purchase', 355000.00, 6.4750, 360,
    2236.00, 'Active', '2026-12-08', '2026-11-10',
    'Single Family', 385000.00, 38500.00, 'SYSTEM'
),
(
    'LN-2024-057', 'APP-2024-057', 'EXT-057', 'LEG-057',
    'Joe', 'Watson', '789-01-2350', '1988-07-21',
    'joe.watson@email.com', '555-0157', 'Married', 'Full-Time',
    9400.00, 112800.00, 720,
    '180 Clearwater Avenue', 'Lincoln', 'NE', '68508',
    'Conventional', 'Refinance', 315000.00, 6.1250, 360,
    1912.00, 'Active', '2026-12-22', '2026-11-25',
    'Single Family', 445000.00, 0.00, 'SYSTEM'
),
(
    'LN-2024-058', 'APP-2024-058', 'EXT-058', 'LEG-058',
    'Judy', 'Brooks', '890-12-3461', '1993-05-10',
    'judy.brooks@email.com', '555-0158', 'Divorced', 'Full-Time',
    8500.00, 102000.00, 710,
    '291 Broadview Street', 'Greensboro', 'NC', '27401',
    'Conventional', 'Purchase', 325000.00, 6.4250, 360,
    2020.00, 'In Progress', '2027-01-10', '2026-12-12',
    'Condo', 350000.00, 35000.00, 'SYSTEM'
),
(
    'LN-2024-059', 'APP-2024-059', 'EXT-059', 'LEG-059',
    'Walter', 'Kelly', '901-23-4572', '1985-11-03',
    'walter.kelly@email.com', '555-0159', 'Married', 'Full-Time',
    13600.00, 163200.00, 755,
    '302 Stonebridge Place', 'Chandler', 'AZ', '85224',
    'Conventional', 'Purchase', 505000.00, 6.3500, 360,
    3144.00, 'Active', '2027-01-25', '2026-12-28',
    'Single Family', 555000.00, 55500.00, 'SYSTEM'
),
(
    'LN-2024-060', 'APP-2024-060', 'EXT-060', 'LEG-060',
    'Martha', 'Sanders', '012-34-5673', '1990-09-14',
    'martha.sanders@email.com', '555-0160', 'Single', 'Full-Time',
    6500.00, 78000.00, 675,
    '413 Fairview Lane', 'Scottsdale', 'AZ', '85251',
    'FHA', 'Purchase', 268000.00, 6.8125, 360,
    1767.00, 'Active', '2027-02-12', '2027-01-15',
    'Townhouse', 285000.00, 19500.00, 'SYSTEM'
);