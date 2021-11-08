DROP TABLE IF EXISTS billionaires;
DROP TABLE IF EXISTS shop_user;

CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

CREATE TABLE shop_user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL
);

-- INSERT INTO billionaires (first_name, last_name, career) VALUES
--   ('Aliko', 'Dangote', 'Billionaire Industrialist'),
--   ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
--   ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

INSERT INTO shop_user (first_name,last_name,address) VALUES
('kossivi selom', 'afeli', '15 apetuple'),
('John', 'Dow', 'Chantan Market'),
('Felix', 'Jones', 'East Lagon');
