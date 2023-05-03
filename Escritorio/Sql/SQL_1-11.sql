create database bd_EscritorioMaia;
use bd_EscritorioMaia;

drop database bd_escritoriomaia;
create table Clientes(
id_Clie int primary Key auto_increment,
nome_Clie varchar(255) not null,
apelido_Clie varchar(30),
cpf_Clie char(14) unique not null,
estadoCivil_Clie varchar(90),
nome_Pai_Clie varchar(100),
nome_Mae_Clie varchar(100),
rg_Clie varchar(15) unique not null,
ssp_Clie varchar(255) not null,
dt_Emissao date /*date not null*/,
dat_Nasc date /*date not null*/,
rcbBeneficio_Clie varchar(90),
prof_Clie varchar(50),
nome_Comp_Clie varchar(255) not null,
tel1_Clie varchar(15) not null,
tel2_Clie varchar(15),
end_Clie varchar(120),
NumCadaClie varchar(10),
indiq_Clie varchar(255),
obsEndereco_Clie text,
tipoAcao_Clie varchar(90) not null,
Observacao varchar(255),
/* Esses são os campos nas quais não estvam sendo utilizados,
seguroDes_Clie char(3) not null,
dat_Atendi date not null - esse pode ser usado para salvar o horario de login,
pontoRef_Clie varchar(90),
contat_indiq_Clie varchar(15),*/
foto_Clie mediumblob
);

select date_format(dat_Nasc , '%d %m %Y') from Clientes;

/*
Dessa forma se formata uma data com base em datas que ja existem:
Não é nessecario usar o AS (NOVO NOME DO CAMPO), porém é uma boa pratica de programação.

select date_format(Dt, '%d %m %Y') as DataFormatada from Cliente;

*/

select * from Clientes;

create table Funcionarios(
id_Func int primary key auto_increment,
nome_Func varchar(95) not null
);
 create table Servico(
 id_Serv int primary key auto_increment,
 fk_id_Func int not null,
 fk_id_Clie int not null,
 constraint ChaveEstrangeira_Funcionário_Servico foreign key (fk_id_Func) references Funcionarios(id_Func),
 constraint ChaveEstrangeira_Cliente_Servico foreign key (fk_id_Clie) references Clientes(id_Clie)
 );
 
create table Usuarios(
id_User int primary key auto_increment,
user_User varchar(10) unique not null,
pass_User varchar(10) unique not null,
tipo_User varchar(10)
/*fk_id_Func int,
constraint ChaveEstrangeira_Funcionário_Usuário foreign key (fk_id_Func) references Funcionarios(id_Func)*/
);

select * from Usuarios;

insert into Usuarios values
(default,"Adm","x","adm"),
(default,"Adm2","z","User");

truncate table Usuarios;
