CREATE TABLE SEQUENCES (
		ID VARCHAR2(50) NOT NULL,
		VALUE NUMBER NOT NULL
	)
	LOGGING;

CREATE UNIQUE INDEX PK_SEQUENCES ON SEQUENCES (ID ASC)
	LOGGING;

ALTER TABLE SEQUENCES ADD CONSTRAINT PK_SEQUENCES PRIMARY KEY (ID);

