create database exercicio01;

use exercicio01;

create table uzuarios(
	codigo int auto_increment primary key,
    nome varchar(20),
    sobrenome varchar(40),
    idade int
);

alter table uzuarios rename to usuarios;

alter table usuarios add column email varchar(40);

alter table usuarios drop column sobrenome;

insert into usuarios (nome, idade, email) values
("vanessa", 16, "vanessa.rosa@gmail.com"),
("Adailton", 22, "adailton.maas@yahoo.com.br"),
("Andressa", 36, "dessa.simas@uol.com.br"),
("Mayra", 24, "mayra.antunes@gmail.com"),
("cristiane", 14, "criss.maya@gmail.com"),
("leonardo", 15, "leo.kopff@terra.com.br"),
("carina", 27, "carina.almeida@gmail.com"),
("Clóvis", 29, "clovis.simao@hotmail.com"),
("Gabriela", 23, "gabriela.braga@live.com.br"),
("Cibele", null, "cibele.lins@uol.com.br");

select * from usuarios;

select nome, idade from usuarios
where idade > 18;

select email from usuarios
where email like "%gmail%";

select nome, max(idade) from usuarios;

select nome, min(idade) from usuarios;

select nome from usuarios where idade is null;

update usuarios set idade = 27 where idade is null;

set sql_safe_updates=0;

delete from usuarios where idade < 18;

truncate usuarios;

drop table usuarios;