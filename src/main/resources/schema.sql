DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id       bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email    varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    created  TIMESTAMP
);
