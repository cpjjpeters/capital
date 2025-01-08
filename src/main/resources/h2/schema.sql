DROP TABLE IF EXISTS  PERSON

CREATE TABLE PERSON (
--                                id INT AUTO_INCREMENT  PRIMARY KEY,
                            id BIGINT IDENTITY(1,1) NOT NULL PRIMARY KEY,
                               first_name VARCHAR(25) NOT NULL,
                               last_name VARCHAR(50) NOT NULL,
                               email VARCHAR(150) DEFAULT NULL
);

