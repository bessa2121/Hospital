# Hospital
Software do Projeto de Hospital - Aula de Banco de Dados e Desenvolvimento de Sistemas com Davi Villar 

package Hospital;

public class Hospital {
    public static void main(String[] args) {
        // Exemplo simples de inicialização
        Cargo cargoMedico = new Cargo(1, "Médico", "Responsável por consultas");
        Funcionario medico = new Funcionario(1, "Dr. João", cargoMedico, "Cardiologia");

        Paciente paciente = new Paciente(1, "Maria Silva", "1990-05-10", "99999-9999", "Rua A, 123");

        Sala sala = new Sala(1, "101", "Consulta");

        Consulta consulta = new Consulta(1, paciente, medico, "2025-09-23", "Dor no peito", sala);

        Remedio remedio = new Remedio(1, "Dipirona", "Analgésico");
        Receita receita = new Receita(1, consulta, remedio, 2);

        Estoque_remedio estoque = new Estoque_remedio(1, remedio, 50, "2026-01-01");

        // Impressões de teste
        System.out.println(paciente);
        System.out.println(consulta);
        System.out.println(receita);
        System.out.println(estoque);
    }
}

package Hospital;

public class Paciente {
    private int idPaciente;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String endereco;

    public Paciente() {}

    public Paciente(int idPaciente, String nome, String dataNascimento, String telefone, String endereco) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public int getIdPaciente() { return idPaciente; }
    public void setIdPaciente(int idPaciente) { this.idPaciente = idPaciente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Paciente [id=" + idPaciente + ", nome=" + nome + "]";
    }
}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalApp {

    // Dados do banco
    private static final String URL = "jdbc:mysql://localhost:3306/Hospital_BD";
    private static final String USER = "root"; // seu usuário
    private static final String PASS = "sua_senha"; // sua senha

    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexão com Hospital_BD realizada com sucesso!");

            // Inserindo paciente
            inserirPaciente(conexao, 1, "João Silva", "Masculino", 30);
            inserirPaciente(conexao, 2, "Maria Souza", "Feminino", 25);

            // Inserindo remédio
            inserirRemedio(conexao, 1, "Paracetamol", "Analgesico", 100);
            inserirRemedio(conexao, 2, "Ibuprofeno", "Anti-inflamatorio", 50);

            // Consultando pacientes
            System.out.println("\n--- Lista de Pacientes ---");
            consultarPacientes(conexao);

            // Consultando remédios
            System.out.println("\n--- Lista de Remédios ---");
            consultarRemedios(conexao);

            // Atualizando paciente
            atualizarPaciente(conexao, 1, "João da Silva", 31);
            System.out.println("\n--- Paciente atualizado ---");
            consultarPacientes(conexao);

            conexao.close();
            System.out.println("\nConexão encerrada.");
        } catch (SQLException e) {
            System.out.println("Erro na conexão ou operação: " + e.getMessage());
        }
    }

    // MÉTODOS

    public static void inserirPaciente(Connection con, int id, String nome, String sexo, int idade) throws SQLException {
        String sql = "INSERT INTO Paciente (id_paciente, nome, sexo, idade) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, nome);
        stmt.setString(3, sexo);
        stmt.setInt(4, idade);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Paciente " + nome + " inserido.");
    }

    public static void inserirRemedio(Connection con, int id, String nome, String tipo, int quantidade) throws SQLException {
        String sql = "INSERT INTO Remedio (id_remedio, nome, tipo, quantidade) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, nome);
        stmt.setString(3, tipo);
        stmt.setInt(4, quantidade);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Remédio " + nome + " inserido.");
    }

    public static void consultarPacientes(Connection con) throws SQLException {
        String sql = "SELECT * FROM Paciente";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id_paciente") +
                               ", Nome: " + rs.getString("nome") +
                               ", Sexo: " + rs.getString("sexo") +
                               ", Idade: " + rs.getInt("idade"));
        }
        rs.close();
        stmt.close();
    }

    public static void consultarRemedios(Connection con) throws SQLException {
        String sql = "SELECT * FROM Remedio";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id_remedio") +
                               ", Nome: " + rs.getString("nome") +
                               ", Tipo: " + rs.getString("tipo") +
                               ", Quantidade: " + rs.getInt("quantidade"));
        }
        rs.close();
        stmt.close();
    }

    public static void atualizarPaciente(Connection con, int id, String novoNome, int novaIdade) throws SQLException {
        String sql = "UPDATE Paciente SET nome = ?, idade = ? WHERE id_paciente = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, novoNome);
        stmt.setInt(2, novaIdade);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Paciente ID " + id + " atualizado.");
    }
}

# Guia de Trabalho com Branches Git - Projeto Hospital

Este guia explica como cada grupo deve trabalhar com branches Git para evitar conflitos e garantir que a branch `main` só seja alterada no dia do merge final.

---

## 1. Clonar o repositório

Faça o clone do repositório na sua máquina local (apenas uma vez):

```bash
git clone https://github.com/usuario/repositorio-hospital.git
cd repositorio-hospital
2. Criar ou mudar para a branch do seu grupo
Se a branch do seu grupo ainda não existe:
bash
Copiar código
git checkout -b grupoX-nome-do-grupo
git push -u origin grupoX-nome-do-grupo
Se a branch do seu grupo já existe:
bash
Copiar código
git checkout grupoX-nome-do-grupo
git pull origin grupoX-nome-do-grupo
3. Trabalhar na sua branch
Edite apenas os arquivos que seu grupo foi designado para modificar.

Depois de editar:

bash
Copiar código
git add .
git commit -m "Descrição clara das alterações feitas"
4. Subir as alterações apenas para sua branch
bash
Copiar código
git push origin grupoX-nome-do-grupo
Importante: Isso envia suas alterações apenas para a branch do seu grupo. A branch main não será alterada.

5. Atualizar sua branch com as últimas mudanças da main
Periodicamente, para evitar conflitos futuros, atualize sua branch com as mudanças da main:

bash
Copiar código
git checkout main
git pull origin main

git checkout grupoX-nome-do-grupo
git merge main

git push origin grupoX-nome-do-grupo
Nota: Isso não altera a branch main, apenas traz as atualizações dela para a sua branch.

6. O que evitar até o dia do merge final
Não fazer merge da sua branch na main.

Não abrir Pull Requests para a main.

Não trabalhar diretamente na branch main.

7. Verificar em qual branch você está
Use este comando para garantir que está trabalhando na branch correta:

bash
Copiar código
git branch
A branch ativa aparecerá com um *.
Sempre trabalhe em sua branch de grupo, nunca na main.

Resumo dos comandos principais
bash
Copiar código
# Clonar repositório (1 vez)
git clone https://github.com/usuario/repositorio-hospital.git
cd repositorio-hospital

# Criar branch do grupo (se não existir)
git checkout -b grupoX-nome-do-grupo
git push -u origin grupoX-nome-do-grupo

# Entrar na branch do grupo (se já existir)
git checkout grupoX-nome-do-grupo
git pull origin grupoX-nome-do-grupo

# Trabalhar, commitar e enviar para a branch do grupo
git add .
git commit -m "Descrição das alterações"
git push origin grupoX-nome-do-grupo

# Atualizar branch do grupo com as mudanças da main (regularmente)
git checkout main
git pull origin main
git checkout grupoX-nome-do-grupo
git merge main
git push origin grupoX-nome-do-grupo
Divisão dos arquivos por grupo (sugestão)
Grupo	Arquivos atribuídos
Grupo 1	Remedio.java, Receita.java
Grupo 2	Consulta.java, Paciente.java
Grupo 3	Funcionario.java, Cargo.java
Grupo 4	Especialidade_medico.java, Especialidade_enfermeiro.java
Grupo 5	Estoque_remedio.java, Sala.java








