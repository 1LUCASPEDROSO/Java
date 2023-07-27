create database db_store; 
use db_store;
create table product (
 id_product int not null auto_increment primary key,
 name_product varchar(100) not null,
 dscription_product varchar(500) not null, 
 quantity_product int not null,
 price_product double not null
);
create table method_payment
(
id_method int not null auto_increment primary key,
name_method varchar(50) not null
);
create table order_product
(
id_transition int not null auto_increment primary key,
total_transition double not null,
payment_method int not null,
product_id int not null,
foreign key (payment_method) references method_payment(id_method),
foreign key (product_id) references product(id_product)
);

insert into method_payment values (null,'debito'),
								  (null,'crédito'),
                                  (null,'pix'),
                                  (null,'crypto')