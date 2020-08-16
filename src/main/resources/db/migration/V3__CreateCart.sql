CREATE TABLE cart
(
    id         BIGINT(20) NOT NULL AUTO_INCREMENT,
    user_id    BIGINT(20) NOT NULL,
    product_id BIGINT(20) NOT NULL,
    quantity   INT(10)    NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_CART_USER FOREIGN KEY (user_id) REFERENCES user (id),
    CONSTRAINT FK_CART_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id)
);
