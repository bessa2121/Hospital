USE Hospital_BD;
-- 1. Listar todos os pacientes
SELECT id_paciente, nome, sexo, data_nascimento, telefone
FROM Paciente;
-- 2. Listar todos os médicos (funcionários com CRM)
SELECT id_funcionario, nome, crm
FROM Funcionario
WHERE crm IS NOT NULL;
-- 3. Consultas realizadas com nome do paciente e do médico
SELECT c.id_consulta, p.nome AS paciente, f.nome AS medico, c.diagnostico, c.data_hora
FROM Consulta c
JOIN Paciente p ON c.id_paciente = p.id_paciente
JOIN Funcionario f ON c.id_funcionario = f.id_funcionario;
-- 4. Quantidade de consultas por médico
SELECT f.nome AS medico, COUNT(*) AS total_consultas
FROM Consulta c
JOIN Funcionario f ON c.id_funcionario = f.id_funcionario
GROUP BY f.nome;
-- 5. Pacientes atendidos pelo Dr. João Silva
SELECT DISTINCT p.nome AS paciente
FROM Consulta c
JOIN Paciente p ON c.id_paciente = p.id_paciente
JOIN Funcionario f ON c.id_funcionario = f.id_funcionario
WHERE f.nome = 'Dr. João Silva';
-- 6. Receita de um paciente específico
SELECT r.id_receita, p.nome AS paciente, f.nome AS medico, rr.dosagem, rr.periodo, re.nome AS remedio
FROM Receita r
JOIN Paciente p ON r.id_paciente = p.id_paciente
JOIN Funcionario f ON r.id_funcionario = f.id_funcionario
JOIN Receita_Remedio rr ON r.id_receita = rr.id_receita
JOIN Remedio re ON rr.id_remedio = re.id_remedio
WHERE p.nome = 'Carlos Mendes';
-- 7. Remédios em estoque e quantidade disponível
SELECT re.nome, e.quantidade, e.data_validade
FROM Estoque e
JOIN Remedio re ON e.id_remedio = re.id_remedio;
-- 8. Remédios próximos do vencimento (menos de 90 dias para vencer)
SELECT re.nome, e.quantidade, e.data_validade
FROM Estoque e
JOIN Remedio re ON e.id_remedio = re.id_remedio
WHERE e.data_validade <= DATE_ADD(CURDATE(), INTERVAL 90 DAY);
-- 9. Média de idade dos pacientes
SELECT ROUND(AVG(TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE())), 1) AS media_idade
FROM Paciente;
-- 10. Consultas onde paciente estava com febre (temperatura > 37.5)
SELECT c.id_consulta, p.nome AS paciente, c.temperatura, c.diagnostico
FROM Consulta c
JOIN Paciente p ON c.id_paciente = p.id_paciente
WHERE c.temperatura > 37.5;
