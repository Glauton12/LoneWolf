#criar base
create database pizzaria;

#selecionar a base
use pizzaria;

#criar tabela
create table pizza(
	idPizza int auto_increment primary key,
    saborPizza varchar(40),
    ingredientesPizza varchar(200)
);

#inserir pizzas
insert into pizza (saborPizza, ingredientesPizza) values
("Calabresa","Molho de tomate, calabresa e queijo"),
("Marguerita","Molho de tomate, manjericão e queijo"),
("Frango com catupiry","Frango, queijo e catupiry"),
("Portuguesa","Ovos, azeitona, queijo, ervilha e presunto");

#criar uma tabela de clientes
create table clientes(
	idCliente int auto_increment primary key,
    nomeCliente varchar(30)
);

#inserir clientes
insert into clientes (nomeCliente) values
("leticia"),
("cleber");

#tabelas para unir o cliente a pizza(pedidos)
create table pedidos(
	idCliente int,
    idPizza int,
    dataPedido datetime,
    foreign key (idCliente) references clientes(idCliente),
    foreign key (idPizza) references pizza(idPizza)
);

#inserir pedidos
insert into pedidos values
(1, 4, now()),
(2, 1, now()),
(1, 2, now());

#selecionar pedidos
select * from pedidos;

#inner join
select
	clientes.nomeCliente,
    pizza.saborPizza,
    date_format(pedidos.dataPedido, "%d/%m/%Y") as "data",
    date_format(pedidos.dataPedido, "%H:%i") as "Hora"
From pedidos
inner join clientes
on pedidos.idCliente = clientes.idCliente
inner join pizza
on pedidos.idPizza = pizza.idPizza
order by pizza.saborPizza desc;

#criar uma view
create view selecionarPedidos as
select
	clientes.nomeCliente,
    pizza.saborPizza,
    date_format(pedidos.dataPedido, "%d/%m/%Y") as "data",
    date_format(pedidos.dataPedido, "%H:%i") as "Hora"
From pedidos
inner join clientes
on pedidos.idCliente = clientes.idCliente
inner join pizza
on pedidos.idPizza = pizza.idPizza
order by pizza.saborPizza desc;

#executar a view
select * from selecionarPedidos;
select nomeCliente, saborPizza from selecionarPedidos;


#remover a view
drop view selecionarPedidos;

#alterar data do pedido
update pedidos set dataPedido = "2020-03-01 12:44" where idCliente=1;
update pedidos set dataPedido = "2020-02-02 17:34:20" where idCliente=2;

#acesso ao alterar dados
set sql_safe_updates = 0;

#between. todo tipo de date e time com aspas
select * from pedidos where dataPedido between "2020-02-01" and "2020-02-29";

