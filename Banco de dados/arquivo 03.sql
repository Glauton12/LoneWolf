#criar base de dados 
create database aula03;

#selecionar base de dados
use aula03;

#tabela de cargos
create table cargos(
	idCargo int auto_increment primary key,
    nomeCargo varchar(20)
);

#cadastrar cargos
insert into cargos (nomeCargo) values
("desenvolvedor java"),
("analista"),
("Desenvolvedor c#");

#tabela de colaboradores
Create table colaboradores(
	idColaborador int auto_increment primary key,
    nomeColaborador varchar(30),
    idCargo int,
	foreign key(idCargo) references cargos(idCargo)
);

#cadastrar colaboradores
insert into colaboradores (nomeColaborador, idCargo) values
("Anderson", 2),
("Raquel", 1);

#inner join
select
	colaboradores.nomeColaborador,
    cargos.nomeCargo
From colaboradores
inner join cargos
on colaboradores.idCargo = cargos.IdCargo;

#inserir colaborador extra
insert into colaboradores values (null, "amanda", 2);

#left/right join
select
	cargos.nomeCargo, 
    colaboradores.nomeColaborador
    From cargos
    Left join colaboradores
    on cargos.idCargo = colaboradores.idCargo;
    
    select * from colaboradores;