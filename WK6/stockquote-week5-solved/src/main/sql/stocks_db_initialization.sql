CREATE TABLE stocks.person_quotes
(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
 person_id INT NOT NULL,
 quotes_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person (ID),
  FOREIGN KEY (quotes_id) REFERENCES quotes (ID)
);


