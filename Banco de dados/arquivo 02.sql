#criar base de dados
Create database Aula02;

#selecionar base de dados
use aula02;

#criar tabela
create table produtoz(
	coprodutozdigo int auto_increment primary key,
    produto varchar(30), 
    validade date    
);

#renomear tabela
alter table produtoz rename to produtos;

#remover coluna
alter table produtos drop column validade;

#adicionar coluna
alter table produtos add column valor double;
alter table produtos add column marca varchar(30) after produto;

#inserir dados
insert into produtos (produto, marca, valor) values
("Arroz integral", "tio joão", 4),
("Feijão integral", "tio joão", 4.56),
("Macarrão", "galo", 2.35),
("Arroz branco importado", "tio joão", 8.90),
("Farinha de trigo", "nordeste", 4.90);

#selecionar dados
select * from produtos;

#select where
select 
	produto, valor
From produtos
Where Valor > 5;
    
#select like a% comeca com a, %a termina com a, %a% comtem a.
select produto from produtos
where produto like "%c%";

#agrupar dados
select marca, count(*) from produtos group by marca;


#alterar dados
update produtos set valor = 8.9 where codigo = 5;

#select encadeado
select produto, valor
from produtos
where valor = (select max(valor) from produtos);

#remover dados
delete from produtos where codigo = 5;

#remover dados e reiniciar auot_increment
truncate produtos;

#remover base de dados
drop database aula02;

#caso não consiga alterar ou excluir#
set sql_safe_updates=0;  