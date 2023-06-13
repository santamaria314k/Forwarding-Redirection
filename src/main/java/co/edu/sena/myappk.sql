create database myappk;
use myappk;
drop table users_tbl;
drop database myappk;

show tables;

select * from users_tbl;
select * from categories;
select * from products;
-------------------------------------------------------------------
CREATE TABLE `users_tbl` (
`user_id` int  auto_increment,
`user_firstname` varchar(40) NOT NULL,
`user_lastname` varchar(40) NOT NULL,
`user_email` varchar(60) NOT NULL,
`user_password` varbinary(111),
PRIMARY KEY (`user_id`)
) ;

-------------------------------------------------------------------

CREATE TABLE `categories` (
`category_product` int    ,
`name_category` varchar(40) ,
PRIMARY KEY (`category_product`)
) ;
----------------------------------------------------------------------------

CREATE TABLE `products` (
`id_product` int    ,
`name_product` varchar(40) ,
`value_product` varchar(40) ,
`category_product` int ,
PRIMARY KEY (`id_product`),FOREIGN KEY (`category_product`) REFERENCES `categories`(`category_product`)
) ;



----------------------------------------------------------------------

INSERT INTO users_tbl (user_id, user_firstname, user_lastname, user_email, user_password) 
VALUES ('1', 'kevin', 'stiven', 'kevsan@correo.com', 'kevinsa123321');





INSERT INTO myappk.users_tbl (user_id,user_firstname, user_lastname, user_email, user_password)
VALUES (('2'),UPPER('kevi'), UPPER('stiven'), 'kevsan@correo.com',AES_ENCRYPT('kevinsa123321',
'$2a$12$71SJ2B6qdXDQrZUF4KR5suDytQ062kLQf/QHbatSw8wLqu1DoMppm'));



SELECT *,CAST(AES_DECRYPT(user_password,
'$2a$12$71SJ2B6qdXDQrZUF4KR5suDytQ062kLQf/QHbatSw8wLqu1DoMppm') AS CHAR(50))
end_data FROM users_tbl WHERE user_id = 2;






