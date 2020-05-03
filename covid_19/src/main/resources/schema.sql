DROP TABLE IF EXISTS Survey;
  
CREATE TABLE Survey(
  id INT PRIMARY KEY,
  state VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  positiveCasesReported INT DEFAULT 0,
  casesUnderObservation INT DEFAULT 0);

INSERT INTO Survey(id, state, country,positiveCasesReported,casesUnderObservation) VALUES
  (1,'INDIA', 'MAHARAHSTRA',75 ,0),
  (2,'KARNATAKA', 'INDIA', 35,0),
  (3,'UP', 'INDIA',25,0);