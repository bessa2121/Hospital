USE Hospital_BD;
-- Cargos
INSERT INTO Cargo (nome) VALUES
('Médico'),
('Enfermeiro'),
('Recepcionista');
-- Funcionários
INSERT INTO Funcionario (id_cargo, nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf, crm, coren)
VALUES
(1, 'Dr. Marcos Vieira', 'Masculino', '11900000001', '1975-04-10', '34567012331', '334455671', 'Rua A1, 101', '01010001', 'SP', '567891', NULL),
(1, 'Dra. Helena Costa', 'Feminino', '11900000002', '1980-06-15', '45678123452', '445566782', 'Rua B1, 102', '02020002', 'SP', '678902', NULL),
(2, 'Enf. Rafael Silva', 'Masculino', '11900000003', '1990-07-20', '56789234563', '556677903', 'Rua C1, 103', '03030003', 'SP', NULL, 'ENF43211'),
(2, 'Enf. Mariana Alves', 'Feminino', '11900000004', '1985-08-25', '67890345674', '667788904', 'Rua D1, 104', '04040004', 'SP', NULL, 'ENF32110'),
(3, 'Carlos Eduardo', 'Masculino', '11900000005', '1992-09-30', '78901456785', '778899015', 'Rua E1, 105', '05050005', 'SP', NULL, NULL),
(3, 'Ana Paula', 'Feminino', '11900000006', '1993-10-05', '89012567896', '889900126', 'Rua F1, 106', '06060006', 'SP', NULL, NULL),
(1, 'Dr. Felipe Nunes', 'Masculino', '11900000007', '1978-11-10', '90123678907', '990011237', 'Rua G1, 107', '07070007', 'SP', '789023', NULL),
(1, 'Dra. Camila Pereira', 'Feminino', '11900000008', '1983-12-15', '01234789018', '001122348', 'Rua H1, 108', '08080008', 'SP', '890134', NULL),
(2, 'Enf. Lucas Santos', 'Masculino', '11900000009', '1988-01-20', '12345890129', '112233459', 'Rua I1, 109', '09090009', 'SP', NULL, 'ENF21099'),
(3, 'Fernanda Rocha', 'Feminino', '11900000010', '1995-02-25', '23456901230', '223344570', 'Rua J1, 110', '10100010', 'SP', NULL, NULL),

(1, 'Dr. André Gomes', 'Masculino', '11900000011', '1979-03-30', '34567012341', '334455672', 'Rua K1, 111', '11110011', 'SP', '567892', NULL),
(1, 'Dra. Sofia Martins', 'Feminino', '11900000012', '1984-04-04', '45678123453', '445566783', 'Rua L1, 112', '12120012', 'SP', '678903', NULL),
(2, 'Enf. Bruno Lopes', 'Masculino', '11900000013', '1991-05-09', '56789234564', '556677904', 'Rua M1, 113', '13130013', 'SP', NULL, 'ENF43212'),
(2, 'Enf. Alice Fernandes', 'Feminino', '11900000014', '1986-06-14', '67890345675', '667788905', 'Rua N1, 114', '14140014', 'SP', NULL, 'ENF32111'),
(3, 'Pedro Henrique', 'Masculino', '11900000015', '1993-07-19', '78901456786', '778899016', 'Rua O1, 115', '15150015', 'SP', NULL, NULL),
(3, 'Juliana Alves', 'Feminino', '11900000016', '1994-08-24', '89012567897', '889900127', 'Rua P1, 116', '16160016', 'SP', NULL, NULL),
(1, 'Dr. Rafael Duarte', 'Masculino', '11900000017', '1976-09-29', '90123678908', '990011238', 'Rua Q1, 117', '17170017', 'SP', '789024', NULL),
(1, 'Dra. Letícia Silva', 'Feminino', '11900000018', '1981-10-04', '01234789019', '001122349', 'Rua R1, 118', '18180018', 'SP', '890135', NULL),
(2, 'Enf. Gustavo Costa', 'Masculino', '11900000019', '1989-11-09', '12345890130', '112233460', 'Rua S1, 119', '19190019', 'SP', NULL, 'ENF21100'),
(3, 'Amanda Ribeiro', 'Feminino', '11900000020', '1996-12-14', '23456901231', '223344571', 'Rua T1, 120', '20200020', 'SP', NULL, NULL),

(1, 'Dr. Vinicius Santos', 'Masculino', '11900000021', '1977-01-19', '34567012342', '334455673', 'Rua U1, 121', '21210021', 'SP', '567893', NULL),
(1, 'Dra. Mariana Pereira', 'Feminino', '11900000022', '1982-02-23', '45678123454', '445566784', 'Rua V1, 122', '22220022', 'SP', '678904', NULL),
(2, 'Enf. Leonardo Souza', 'Masculino', '11900000023', '1993-03-30', '56789234565', '556677905', 'Rua W1, 123', '23230023', 'SP', NULL, 'ENF43213'),
(2, 'Enf. Juliana Silva', 'Feminino', '11900000024', '1987-04-04', '67890345676', '667788906', 'Rua X1, 124', '24240024', 'SP', NULL, 'ENF32112'),
(3, 'Felipe Augusto', 'Masculino', '11900000025', '1994-05-09', '78901456787', '778899017', 'Rua Y1, 125', '25250025', 'SP', NULL, NULL),
(3, 'Isabela Torres', 'Feminino', '11900000026', '1995-06-14', '89012567898', '889900128', 'Rua Z1, 126', '26260026', 'SP', NULL, NULL),
(1, 'Dr. Carlos Lima', 'Masculino', '11900000027', '1978-07-19', '90123678909', '990011239', 'Rua AA1, 127', '27270027', 'SP', '789025', NULL),
(1, 'Dra. Bianca Rodrigues', 'Feminino', '11900000028', '1983-08-23', '01234789020', '001122350', 'Rua BB1, 128', '28280028', 'SP', '890136', NULL),
(2, 'Enf. Eduardo Fernandes', 'Masculino', '11900000029', '1989-09-28', '12345890131', '112233461', 'Rua CC1, 129', '29290029', 'SP', NULL, 'ENF21101'),
(3, 'Camila Ribeiro', 'Feminino', '11900000030', '1996-10-03', '23456901232', '223344572', 'Rua DD1, 130', '30300030', 'SP', NULL, NULL),

(1, 'Dr. Gustavo Almeida', 'Masculino', '11900000031', '1979-11-07', '34567012343', '334455674', 'Rua EE1, 131', '31310031', 'SP', '567894', NULL),
(1, 'Dra. Larissa Dias', 'Feminino', '11900000032', '1984-12-12', '45678123455', '445566785', 'Rua FF1, 132', '32320032', 'SP', '678905', NULL),
(2, 'Enf. Ricardo Moraes', 'Masculino', '11900000033', '1990-01-16', '56789234566', '556677906', 'Rua GG1, 133', '33330033', 'SP', NULL, 'ENF43214'),
(2, 'Enf. Aline Barros', 'Feminino', '11900000034', '1985-02-20', '67890345677', '667788907', 'Rua HH1, 134', '34340034', 'SP', NULL, 'ENF32113'),
(3, 'Bruno Henrique', 'Masculino', '11900000035', '1993-03-27', '78901456788', '778899018', 'Rua II1, 135', '35350035', 'SP', NULL, NULL),
(3, 'Juliana Fernandes', 'Feminino', '11900000036', '1994-04-01', '89012567899', '889900129', 'Rua JJ1, 136', '36360036', 'SP', NULL, NULL),
(1, 'Dr. Leonardo Martins', 'Masculino', '11900000037', '1976-05-06', '90123678910', '990011240', 'Rua KK1, 137', '37370037', 'SP', '789026', NULL),
(1, 'Dra. Patrícia Castro', 'Feminino', '11900000038', '1981-06-11', '01234789021', '001122351', 'Rua LL1, 138', '38380038', 'SP', '890137', NULL),
(2, 'Enf. Felipe Barbosa', 'Masculino', '11900000039', '1987-07-16', '12345890132', '112233462', 'Rua MM1, 139', '39390039', 'SP', NULL, 'ENF21102'),
(3, 'Amanda Lima', 'Feminino', '11900000040', '1995-08-21', '23456901233', '223344573', 'Rua NN1, 140', '40400040', 'SP', NULL, NULL),

(1, 'Dr. Eduardo Ferreira', 'Masculino', '11900000041', '1978-09-26', '34567012344', '334455675', 'Rua OO1, 141', '41410041', 'SP', '567895', NULL),
(1, 'Dra. Vanessa Moreira', 'Feminino', '11900000042', '1983-10-31', '45678123456', '445566786', 'Rua PP1, 142', '42420042', 'SP', '678906', NULL),
(2, 'Enf. Thiago Costa', 'Masculino', '11900000043', '1989-11-05', '56789234567', '556677907', 'Rua QQ1, 143', '43430043', 'SP', NULL, 'ENF43215'),
(2, 'Enf. Carla Mendes', 'Feminino', '11900000044', '1984-12-10', '67890345678', '667788908', 'Rua RR1, 144', '44440044', 'SP', NULL, 'ENF32114'),
(3, 'Felipe Santos', 'Masculino', '11900000045', '1994-01-14', '78901456789', '778899019', 'Rua SS1, 145', '45450045', 'SP', NULL, NULL),
(3, 'Isabela Souza', 'Feminino', '11900000046', '1995-02-18', '89012567900', '889900130', 'Rua TT1, 146', '46460046', 'SP', NULL, NULL),
(1, 'Dr. Rodrigo Fernandes', 'Masculino', '11900000047', '1977-03-25', '90123678911', '990011241', 'Rua UU1, 147', '47470047', 'SP', '789027', NULL),
(1, 'Dra. Gabriela Rocha', 'Feminino', '11900000048', '1982-04-29', '01234789022', '001122352', 'Rua VV1, 148', '48480048', 'SP', '890138', NULL),
(2, 'Enf. Marcelo Dias', 'Masculino', '11900000049', '1988-05-04', '12345890133', '112233463', 'Rua WW1, 149', '49490049', 'SP', NULL, 'ENF21103'),
(3, 'Fernanda Lima', 'Feminino', '11900000050', '1996-06-08', '23456901234', '223344574', 'Rua XX1, 150', '50500050', 'SP', NULL, NULL);
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
('Dipirona', 'Analgésico e antitérmico');
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
