#criar base
create database aula04;

#selecionar a base
use aula04;

#cria uma tabela
create table cursos(
	idCurso int auto_increment primary key,
    nomeCurso varchar(40),
    valorCurso double
); 

#procedimento para cadastrar cursos
delimiter $
	create procedure cadastrar(in nome varchar(30), in valor double)
    
    begin
		
			declare quantidade int;
            declare mensagem varchar(40);
            
            set quantidade = (select count(*) from cursos where nomeCurso = nome);
            
            if quantidade = 0 then
            insert into cursos (nomeCurso, valorCurso) values (nome, valor);
            set mensagem = "Curso cadastrado com sucesso!";
				else 
                set mensagem = "Cadastre um outro curso!";
			end if;
            
			select mensagem;
    end $
delimiter ;

#testar procedimento
call cadastrar("delphi", 1300);

#selecionar dados
select * from cursos;

#criar uma trigger
alter table cursos ADD valorDesconto double;

create trigger desconto before insert
on cursos
for each row 
set new.valorDesconto = new.valorCurso * 0.9;

/*
Before: executa as trigger antes dos comandos insert, update ou delete
After: executa as trigger depois dos comandos insert, update ou delete

New: obtem um dado que não está na tabela ou altera o valor de uma coluna
Old:obtem um dado que já se encontra na tabela
*/
