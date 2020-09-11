#base de dados
create database biblioteca;

#selecionar tabela
use biblioteca;

#tabela autores
create table autores(
	idAutor int auto_increment primary key,
	nomeAutor varchar(30)
);

#tabela generos
create table generos(
	idGenero int auto_increment primary key,
    nomeGenero varchar(30)
);

#tabela livros
create table livros(
	nomeLivro varchar(40),
    idAutor int,
    idGenero int,
    foreign key (idAutor) references autores(idAutor),
    foreign key (idGenero) references generos(idGenero)
);

#cadastrar autores
insert into autores (nomeAutor) values
("Ana"),
("Beatriz"),
("Caio"),
("Daniel");

#cadastrar Gêneros
insert into generos (nomeGenero) values
("Ação"),
("Aventura"),
("Drama"),
("Romance"),
("Terror");

#cadastrar livros
insert into livros values
("Fúria de titãs", 1, 1),
("Pesando na vida", 2, 3 ),
("Destino Sombrio", 4, 5);

#inner join
select
	livros.nomeLivro,
    autores.nomeAutor,
    generos.nomeGenero
From livros
inner join autores
on livros.idAutor= autores.idAutor
inner join generos
on livros.idGenero = generos.idGenero;

#left join
select
	generos.nomeGenero,
    livros.nomeLivro
from generos
left join livros
on livros.idGenero = generos.idGenero;

#right join
select
	livros.nomeLivro,
    autores.nomeAutor
from livros
right join autores
on livros.idAutor = autores.idAutor;

#procedure para cadastrar autores
create procedure cadastrarAutor(nome varchar(40))
insert into autores (nomeAutor) values (nome);

#chamar procedure
call cadastrarAutor("Elaine");
select * from autores;

#procedure para cadastrar genero e listar todos os generos
delimiter $$
	Create procedure cadastrarGenero (genero varchar (30))
   Begin
		insert into generos (nomeGenero) values (genero);
		select * from  generos;
   end $$
delimiter ;

Call cadastrarGenero ("comédia");

#contar livros cadastrados
Create procedure contarlivros()
select count(*) as "quantidades de livros" from livros;

call contarlivros;




