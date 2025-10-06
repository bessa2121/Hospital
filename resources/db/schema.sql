-- Reset do banco
DROP DATABASE IF EXISTS Hospital_BD;
CREATE DATABASE Hospital_BD CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE Hospital_BD;

-- Tabela de cargos
CREATE TABLE Cargo (
    id_cargo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

-- Tabela de pacientes
CREATE TABLE Paciente (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    data_nascimento DATE,
    cpf CHAR(11) UNIQUE,
    rg CHAR(9),
    endereco VARCHAR(120),
    cep CHAR(8),
    uf CHAR(2)
);

-- Tabela de funcionários
CREATE TABLE Funcionario (
    id_funcionario INT AUTO_INCREMENT PRIMARY KEY,
    id_cargo INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    data_nascimento DATE,
    cpf CHAR(11) UNIQUE,
    rg CHAR(9),
    endereco VARCHAR(120),
    cep CHAR(8),
    uf CHAR(2),
    crm VARCHAR(6),   -- para médicos
    coren VARCHAR(20), -- para enfermeiros
    CONSTRAINT fk_funcionario_cargo FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo)
);

-- Tabela de salas
CREATE TABLE Sala (
    id_sala INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10) NOT NULL,
    id_funcionario INT,
    CONSTRAINT fk_sala_func FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)
);

-- Tabela de remédios
CREATE TABLE Remedio (
    id_remedio INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200)
);

-- Estoque de remédios
CREATE TABLE Estoque (
    id_estoque INT AUTO_INCREMENT PRIMARY KEY,
    id_remedio INT NOT NULL,
    quantidade INT NOT NULL,
    data_entrada DATE,
    data_validade DATE,
    CONSTRAINT fk_estoque_remedio FOREIGN KEY (id_remedio) REFERENCES Remedio(id_remedio)
);

-- Receita médica
CREATE TABLE Receita (
    id_receita INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT NOT NULL,
    id_funcionario INT NOT NULL,
    data_emissao DATE,
    observacoes VARCHAR(200),
    CONSTRAINT fk_receita_paciente FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    CONSTRAINT fk_receita_funcionario FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)
);

-- Ligação de receitas com remédios
CREATE TABLE Receita_Remedio (
    id_receita INT NOT NULL,
    id_remedio INT NOT NULL,
    quantidade VARCHAR(50),
    dosagem VARCHAR(50),
    periodo VARCHAR(50),
    PRIMARY KEY (id_receita, id_remedio),
    CONSTRAINT fk_rr_receita FOREIGN KEY (id_receita) REFERENCES Receita(id_receita),
    CONSTRAINT fk_rr_remedio FOREIGN KEY (id_remedio) REFERENCES Remedio(id_remedio)
);

-- Consultas médicas
CREATE TABLE Consulta (
    id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT NOT NULL,
    id_funcionario INT NOT NULL,
    id_sala INT,
    id_receita INT,
    diagnostico VARCHAR(200),
    data_hora DATETIME,
    temperatura DECIMAL(4,1),
    pressao VARCHAR(7),
    frequencia_cardiaca INT,
    CONSTRAINT fk_consulta_paciente FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    CONSTRAINT fk_consulta_func FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario),
    CONSTRAINT fk_consulta_sala FOREIGN KEY (id_sala) REFERENCES Sala(id_sala),
    CONSTRAINT fk_consulta_receita FOREIGN KEY (id_receita) REFERENCES Receita(id_receita)
);
