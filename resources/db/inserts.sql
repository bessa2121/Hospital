USE Hospital_BD;
-- Cargos
INSERT INTO Cargo (nome) VALUES
('Médico'),
('Enfermeiro'),
('Recepcionista');
-- Funcionários
INSERT INTO Funcionario (id_cargo, nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf, crm, coren)
VALUES
(1, 'Dr. João Silva', 'Masculino', '11999998888', '1980-05-12', '12345678901', '123456789', 'Rua A, 100', '01001000', 'SP', '123456', NULL),
(1, 'Dra. Maria Souza', 'Feminino', '11988887777', '1985-09-20', '98765432100', '987654321', 'Rua B, 200', '02002000', 'SP', '654321', NULL),
(2, 'Enf. Pedro Santos', 'Masculino', '11977776666', '1990-01-15', '32165498700', '112233445', 'Rua C, 300', '03003000', 'SP', NULL, 'ENF12345'),
(3, 'Ana Oliveira', 'Feminino', '11966665555', '1995-11-10', '74185296300', '223344556', 'Rua D, 400', '04004000', 'SP', NULL, NULL);
-- Pacientes
INSERT INTO Paciente (nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf)
VALUES
('Carlos Mendes', 'Masculino', '11955554444', '2000-03-05', '11122233344', '998877665', 'Rua E, 500', '05005000', 'SP'),
('Fernanda Lima', 'Feminino', '11944443333', '1992-07-18', '22233344455', '887766554', 'Rua F, 600', '06006000', 'SP'),
('José Almeida', 'Masculino', '11933332222', '1975-12-22', '33344455566', '776655443', 'Rua G, 700', '07007000', 'SP');
-- Salas
INSERT INTO Sala (numero, id_funcionario) VALUES
('101', 1),
('102', 2);
-- Remédios
INSERT INTO Remedio (nome, descricao) VALUES
('Paracetamol', 'Analgésico e antitérmico'),
('Amoxicilina', 'Antibiótico'),
('Dipirona', 'Analgésico e antitérmico'),
('Ibuprofeno', 'Anti-inflamatório e analgésico utilizado para dor e febre'),
('Losartana', 'Anti-hipertensivo usado para controle da pressão arterial'),
('Omeprazol', 'Reduz a acidez do estômago e trata refluxo gastroesofágico'),
('Metformina', 'Antidiabético oral que auxilia no controle da glicemia'),
('Simvastatina', 'Reduz os níveis de colesterol e triglicerídeos no sangue'),
('Azitromicina', 'Antibiótico indicado para infecções bacterianas'),
('Diclofenaco', 'Anti-inflamatório e analgésico para dores musculares e articulares'),
('Lorazepam', 'Ansiolítico utilizado para tratar ansiedade e insônia'),
('Cetirizina', 'Antialérgico indicado para rinite e urticária'),
('Hidroclorotiazida', 'Diurético usado para tratar hipertensão e retenção de líquidos'),
('Prednisona', 'Corticosteroide usado para tratar inflamações e alergias'),
('Salbutamol', 'Broncodilatador usado para crises de asma e doenças respiratórias');
-- Estoque
INSERT INTO Estoque (id_remedio, quantidade, data_entrada, data_validade) VALUES
(1, 100, '2025-01-01', '2026-01-01'),
(2, 50, '2025-02-01', '2025-12-31'),
(3, 200, '2025-03-01', '2026-03-01');
-- Receita (Dr. João prescrevendo para Carlos)
INSERT INTO Receita (id_paciente, id_funcionario, data_emissao, observacoes)
VALUES
(1, 1, '2025-09-01', 'Paciente com febre e dor de cabeça');
-- Receita -> Remédios
INSERT INTO Receita_Remedio (id_receita, id_remedio, quantidade, dosagem, periodo)
VALUES
(1, 1, '10 comprimidos', '500mg', '8/8h por 5 dias');
-- Consulta
INSERT INTO Consulta (id_paciente, id_funcionario, id_sala, id_receita, diagnostico, data_hora, temperatura, pressao, frequencia_cardiaca)
VALUES
(1, 1, 1, 1, 'Infecção viral', '2025-09-01 10:00:00', 38.5, '120/80', 90),
(2, 2, 2, NULL, 'Check-up de rotina', '2025-09-02 15:00:00', 36.8, '110/70', 75);
