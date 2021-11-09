DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS item_category;
DROP TABLE IF EXISTS shop_user;
DROP TABLE IF EXISTS shop_user_category;
DROP TABLE IF EXISTS item_order;



CREATE TABLE item_category (
  item_cat_id INT AUTO_INCREMENT  PRIMARY KEY,
  item_cat_name VARCHAR(250) NOT NULL,
  item_cat_description VARCHAR(250) NOT NULL,
  bonus NUMBER(1,0) DEFAULT 1 NOT NULL
);

CREATE TABLE item (
  item_id INT AUTO_INCREMENT  PRIMARY KEY,
  item_name VARCHAR(250) NOT NULL,
  item_price Decimal(10,2) NOT NULL,
  item_cat_id INT NOT NULL,
  foreign key (item_cat_id) references item_category(item_cat_id)

);

CREATE TABLE item_order (
  item_order_id INT AUTO_INCREMENT  PRIMARY KEY,
  item_order_description VARCHAR(250) NOT NULL,
  item_order_quantity NUMBER default 0,
  item_id INT NOT NULL,
  foreign key (item_id) references item(item_id)
);


CREATE TABLE shop_user_category (
  cat_id INT AUTO_INCREMENT  PRIMARY KEY,
  cat_description VARCHAR(250) NOT NULL,
  discount Decimal(10,2) NOT NULL

);


CREATE TABLE shop_user (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL,
  cat_id INT NOT NULL,
  foreign key (cat_id) references shop_user_category(cat_id)
);