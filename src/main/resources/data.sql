




-- INSERT INTO billionaires (first_name, last_name, career) VALUES
--   ('Aliko', 'Dangote', 'Billionaire Industrialist'),
--   ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
--   ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

INSERT INTO shop_user_category (cat_description,discount) VALUES
('Employee',30),
('Affiliate',10),
('customer',5);

INSERT INTO shop_user (first_name,last_name,address,cat_id) VALUES
('kossivi selom', 'afeli', '15 apetuple',1),
('John', 'Dow', 'Chantan Market',1),
('Felix', 'Jones', 'East Lagon',1);


INSERT INTO item_category ( item_cat_name, item_cat_description,bonus)
VALUES
('Electronics','All electronic stuffs',1),
('Groceries','All Grocery stuffs',0),
('Dress','Ladies & man dress',1);

INSERT INTO item (item_name, item_price, item_cat_id) VALUES
( 'APPLE',0.5,2),
( 'ORANGE',0.34,2),
( 'T-SHIRT',5,3),
( 'iPhone',1500,1);
