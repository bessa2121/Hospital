package br.com.hospital.ui;

import br.com.hospital.service.PacienteService;
import br.com.hospital.model.Paciente;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PacienteUI {
    private final PacienteService pacienteService = new PacienteService();
    private final Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n=== Hospital (Console) ===");
            System.out.println("1 - Listar pacientes");
            System.out.println("2 - Inserir paciente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(sc.nextLine());
            try {
                switch (op) {
                    case 1 -> listarPacientes();
                    case 2 -> inserirPaciente();
                    case 0 -> { System.out.println("Saindo..."); return; }
                    default -> System.out.println("Opção inválida");
                }
            } catch (SQLException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }

    private void listarPacientes() throws SQLException {
        List<Paciente> lista = pacienteService.listarTodos();
        System.out.println("--- Pacientes ---");
        for (Paciente p : lista) {
            System.out.println(p.getIdPaciente() + " - " + p.getNome() + " - " + p.getCpf());
        }
    }

    private void inserirPaciente() throws SQLException {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Telefone: ");
        String tel = sc.nextLine();
        java.sql.Date dataNasc = null;
        System.out.print("Data nascimento (YYYY-MM-DD) ou vazio: ");
        String dn = sc.nextLine();
        if (!dn.isBlank()) dataNasc = java.sql.Date.valueOf(dn);
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("RG: ");
        String rg = sc.nextLine();
        System.out.print("Endereco: ");
        String end = sc.nextLine();
        System.out.print("CEP: ");
        String cep = sc.nextLine();
        System.out.print("UF: ");
        String uf = sc.nextLine();

        Paciente p = new Paciente();
        p.setNome(nome); p.setSexo(sexo); p.setTelefone(tel); p.setDataNascimento(dataNasc);
        p.setCpf(cpf); p.setRg(rg); p.setEndereco(end); p.setCep(cep); p.setUf(uf);

        pacienteService.inserir(p);
        System.out.println("Paciente inserido com sucesso!");
    }
}
