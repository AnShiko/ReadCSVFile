create TABLE A
(CUST_NUM INTEGER NOT NULL,
 POSTING_DATE DATE NOT NULL,
 AMOUNT DECIMAL(12,3) CHECK (AMOUNT <=1000) ,
 primary key (CUST_NUM)
 );
INSERT INTO A (CUST_NUM, POSTING_DATE, AMOUNT) VALUES (A-100,23012017,867)