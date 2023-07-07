create database db_agenda;
use db_agenda;

create table contatos
(
id_contato int not null auto_increment primary key,
nome_contato varchar(45) not null,
telefone_Contato varchar(16) not null,
email varchar(50) not null 
);