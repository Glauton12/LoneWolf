#Criar base
Create database java02;

#selecionar base
Use java02;

#Criar tabela
Create table usuarios(
	idUsuario int auto_increment primary key,
    nomeUsuario varchar(30),
    senhaUsuario varchar(20),
    nivelUsuario int
);

#inserir usuarios
insert into usuarios (nomeUsuario, senhaUsuario, nivelUsuario) values
("Ana Paula", "123", 1),
("Jaime Andrade", "456", 1),
("Patricia Duarte", "P", 2),
("Maria Eduarda", "m", 2),
("Janet Jackson", "j", 2),
("Ruan Freitas", "r", 2),
("Jorge Abrão", "j", 2),
("Rodolfo Nunes", "r", 2),
("Camaleão rubens", "c", 2);

select * from usuarios;

#tabela turmas
create table turmas(
idTurma int auto_increment primary key,
nomeTurma varchar(2),
idProfessor int,
foreign key(idProfessor) references usuarios(idUsuario)
);

#inserir turmas
insert into turmas values
(null, "8A", 1),
(null, "7C", 2);

select * from turmas;

#Tabela alunosTurma
Create table alunosTurma(
idTurma int,
idAluno int,
foreign key(idTurma) references turmas(idTurma),
foreign key(idAluno) references usuarios(idUsuario)
);

#inserir alunos
insert into alunosTurma VALUES
(1, 3),
(2, 4),
(1, 5),
(2, 6),
(1, 7),
(2, 8),
(1, 9);

select * from alunosTurma;

#tabela provas 
create table provas(
idProva int auto_increment primary key,
nomeProva varchar(30),
idProfessor int,
foreign key(idProfessor) references usuarios(idUsuario)
);

#Cadastrar provas
insert into provas values
(null, "Algebra", 1),
(null, "Tabela Periódica", 2),
(null, "Funções", 1),
(null, "Quimica Orgânica", 2),
(null, "Matrizes", 1);

select * from provas;

#tablea notas
create table notas(
idAluno int,
idProva int,
notaProva double,
foreign key(idAluno) references usuarios(idUsuario),
foreign key(idProva) references Provas(idProva)
);

#Inserir notas
insert into notas values
(3, 1, 8),
(5, 1, 4.5),
(7, 1, 10),
(9, 1, 3),

(4, 2, 7),
(6, 2, 8),
(8, 2, 9),

(3, 3, 10),
(5, 3, 7),
(7, 3, 9),
(9, 3, 8),

(4, 4, 6),
(6, 4, 7.5),
(8, 4, 4),

(3, 5, 6),
(5, 5, 8),
(7, 5, 10),
(9, 5, 9.5);

select * from notas;

SELECT * From alunosTurma;

SELECT turmas.nomeTurma FROM turmas INNER JOIN alunosTurma ON turmas.idTurma = alunosTurma.idTurma WHERE alunosTurma.idAluno = 3;

SELECT      provas.nomeProva,      notas.notaProva FROM provas INNER JOIN notas ON provas.idProva = notas.idProva WHERE notas.idAluno = 3;

SELECT idProva FROM provas WHERE nomeProva ="algebra";

SELECT nomeUsuario FROM usuarios INNER JOIN notas on usuarios.idUsuario = notas.idAluno WHERE idProva = 1;

UPDATE notas SET notaProva = 7 WHERE idProva = 1 AND idAluno = 3;

SELECT * FROM notas WHERE idProva = 1 AND idAluno = 3