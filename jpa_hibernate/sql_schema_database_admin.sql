-- TABLE
CREATE TABLE Pessoa (id integer not null, cpf varchar(255), dataNascimento datetime, email varchar(255), idade integer, nome varchar(255), primary key (id));
CREATE TABLE Pessoas (id  integer, cpf varchar(255), dataNascimento date, email varchar(255), idade integer, nome varchar(255), primary key (id));
CREATE TABLE Produto (id integer not null, nome varchar(255), preco double precision, quantidade integer, status boolean, primary key (id));
CREATE TABLE Produtos (id  integer, nome varchar(255), preco numeric(19,2), quantidade integer not null, status boolean not null, primary key (id));
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
