DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS item_type;
DROP TABLE IF EXISTS shop_user;
DROP TABLE IF EXISTS shop_user_type;


CREATE TABLE item (
  item_id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  price Decimal(10,2) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

CREATE TABLE item_type (
  type_id INT AUTO_INCREMENT  PRIMARY KEY,
  type_name VARCHAR(250) NOT NULL,
  type_description VARCHAR(250) NOT NULL
);

CREATE TABLE shop_user (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL
);


CREATE TABLE shop_user_category (
  cat_id INT AUTO_INCREMENT  PRIMARY KEY,
  cat_description VARCHAR(250) NOT NULL,
  discount Decimal(10,2) NOT NULL
);

-- INSERT INTO billionaires (first_name, last_name, career) VALUES
--   ('Aliko', 'Dangote', 'Billionaire Industrialist'),
--   ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
--   ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

INSERT INTO shop_user (first_name,last_name,address) VALUES
('kossivi selom', 'afeli', '15 apetuple'),
('John', 'Dow', 'Chantan Market'),
('Felix', 'Jones', 'East Lagon');
