#Criar a base de dados chamada exercicio03
create database atividade03;

#Selecionar base de dados
use atividade03;

#Criar uma tabela chamada alunos
create table alunos(
codigo INT auto_increment primary key,
nome VARCHAR(40),
genero VARCHAR(10),
nota1 DOUBLE,
nota2 DOUBLE,
nota3 DOUBLE
);

#Cadastre os seguintes dados:
insert into alunos (nome, genero, nota1, nota2, nota3) VALUES
("Alana", "Feminino", 7, 8, 9.5),
("Brenda", "Feminino", 8.5, 7.3, 7.7),
("Gustavo", "Masculino", 9, 9.1, 8.6),
("Júlio", "Masculino", 4.5, 3.9, 4),
("Jéssica", "Feminino", 7, 6.8, 7),
("Lúcia", "Feminino", 10, 9.8, 10),
("Rony", "Masculino", 5.6, 6.3, 5.9),
("Tamara", "Feminino", 7 , 8, 7.5),
("Guilherme", "Masculino", 7, 7.1, 7.7),
("Lorena", "Feminino", 4, 4.5, 4.4);

#Exibir a quantidade de homens e mulheres
select genero, count(*) from alunos group by genero;

#Exibir o nome e a média de cada aluno
select nome, (nota1+ nota2+ nota3) /3 as Média from alunos;

#Contar quantos alunos obtiveram média 7 ou superior
select count(*) from alunos where (nota1 + nota2 + nota3) /3 >= 7;

#Nome, notas e média do aluno com a maior média
Select nome, (nota1 + nota2 + nota3) / 3 as Média from alunos
where (nota1 + nota2 + nota3) / 3 = (select max((nota1 + nota2 + nota3) / 3) from alunos);

#Nome, notas e média do aluno com a menor média
Select nome, (nota1 + nota2 + nota3) / 3 as Média from alunos
where (nota1 + nota2 + nota3) / 3 = (select min((nota1 + nota2 + nota3) / 3) from alunos);

#Exibir todos os nomes cadastrados e suas situações. Caso a média seja 7 ou mais exibir Aprovado, caso contrário Reprovado.
Select nome, if((nota1+nota2+nota3)/3 > 7, "Aprovado" , "Reprovado") as situação From alunos;

#Alterar a aluna Jéssica para Joice
update alunos set nome = "joice" where codigo = 5;

#Exibir a quantidade de alunos que tenham média de 7 ou superior e do gênero masculino
select count(*) from alunos where genero = "Masculino" and (nota1+nota2+nota3) /3 >7;

#Exibir a quantidade de alunos que tenham a média entre 8 e 9 do gênero feminino
select count(*) from alunos where genero = "Feminino" and (nota1+nota2+nota3) /3 between 8 and 9;

#Exibir a média da turma
select avg(nota1+nota2+nota3)/3 as média_da_classe from alunos;

#Exibir o nome dos alunos e suas médias, onde suas respectivas médias sejam maiores ou iguais a média da turma
select nome, (nota1+nota2+nota3)/3 from alunos where (nota1+nota2+nota3)/3 >= 7;
SELECT nome, round((nota1+nota2+nota3)/3,2) AS medias FROM alunos WHERE (nota1+nota2+nota3)/3 >= 7;

#Listar o nome dos alunos, onde as três notas obtidos sejam 7 ou superior
select nome, nota1, nota2, nota3 from alunos where nota1 > 7 and nota2 > 7 and nota3 >7;

#Excluir a tabela alunos
drop table alunos;

#Excluir a base de dados
drop database atividade03;