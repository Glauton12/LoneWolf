#criar base de dados
create database aula01;

#selecionar base de dados
use aula01;

#criar tabela
create table usuarios(
	nome varchar(40), 
    idade int,
    email varchar(50),
    estuda boolean
);

#estrutura da tabela exibe
describe usuarios;

#renomear tabela
rename table usuarios to clientes;

#cadaastrar dados
insert into clientes values("Luana", 19, "luana,muniz@gmail.com", 1);
insert into clientes values
("Gabriel", 16, "gabriel.souza@live.com", 1),
("Samantha", 33, "samantha.borgers@terra.com.br", 0),
("Carlos", 21, "carlos.augusto@gmail.com", 0);
insert into clientes (nome, estuda) values ("Cristina", 1);

#exibir dados
select * from clientes;
select nome, email from clientes;

#if
select nome, if (estuda = 0, "não estuda", "estuda") as "Estuda" from clientes;
select
	nome,
		if(idade >= 18, "Maior de idade", "Menor de idade") as idade
	from clientes;

#Agrupar informações
select count(*) from clientes; #contar registros
select sum(idade) from clientes; #somar registros
select max(idade) from clientes; #maior registro
select min(idade) from clientes; #menor registro
select avg(idade) from clientes; #média dos registros

#where
select concat("foram encontrados: ", count(*), " Clientes com 18 ou mais de idade" ) as Maior from clientes where idade >= 18;

#função null
select * from clientes where idade is null;
select * from clientes where idade is  not null;

#remover dados da tabela
truncate clientes;

#remover tabela
drop table clientes;

#remover base de dados
drop database aula01;
