CREATE TABLE product
(
    id        BIGINT(20)     NOT NULL AUTO_INCREMENT,
    name      VARCHAR(100)   NOT NULL,
    price     DECIMAL(20, 2) NOT NULL,
    quantity  INT(10)        NOT NULL DEFAULT 0,
    image_name varchar(100)   NOT NULL,
    PRIMARY KEY (id)
);
