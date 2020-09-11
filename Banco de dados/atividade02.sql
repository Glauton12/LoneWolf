#criar base
create database atividade02;

#selecionar base
use atividade02;

#criar uma tabela chamda produtos
create table produtos(
	codigo int auto_increment primary key,
    produto varchar(40),
    categoria varchar(20),
    valor double,
    cadastro date
);

#cadastras itens 
insert into produtos (produto, categoria, valor, cadastro) values
("Smartphone samsung A8", "Telefonia", 1400.00, "2019-07-22"),
("Notebook acer A650", "Informática", 3800.00, "2019-03-19"),
("Telefone sem fio intelbras", "Telefonia", 129.00, "2018-12-20"),
("Iphone XR", "Telefonia", 5499.00, "2019-07-08"),
("Notebook Dell inspiron 500", "Informática", 3975.80, "2019-01-29"),
("All in one LG A8574", "informática", 2547.12, "2019-02-13"),
("Smartphone Motorola G7", "telefonia", 799.00, "2019-04-03"),
("Smartphone Galaxy S10", "telefonia", 4600.00, "2019-05-03"),
("Notebook Acer Axpros 47", "informática", 2857.00, "2019-08-16"),
("Smartphone Asus Zenfone 6", "telefonia", 2356.00, "2018-07-29"),
("Smartphone Samsung J4", null, 1700.00, "2018-06-16");

#exibir quantidade de produtos
select count(*) from produtos;

#exibir nome do produto e valor onde o cadastro esteja entre 01/04/19 a 31/07/19
Select produto, valor
from produtos
where cadastro between "2019-04-01" and "2020-02-29";

#Alterar o null para telefonia
update produtos set categoria="telefonia" where categoria is null;

#exibir o nome das categorias e a quantidade
select categoria, count(*) From produtos group by categoria;

#exibir a media dos valore por categoria
Select round(avg(valor),2) from produtos group by categoria;

#nome e valor do produto mais barato
select produto, valor
from produtos
where valor = (select min(valor) from produtos);

#exibir produtos da telefonia com valor igual ou maior a 4000
select * from produtos where categoria = "telefonia" and valor >= 4000;

#lista produtos cadastrados em 2018
select * from produtos where date_format(cadastro, "%Y") = 2018;

#deletar samsung e lg
delete from produtos where produto like '%samsung%' or produto like '%LG%';

#exibir o codigo do produto que contenha intelbras
select codigo from produtos where produto like '%intelbras%';

drop table produtos;

drop database atividade02;