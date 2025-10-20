    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
import javax.swing.*;
import java.awt.*;

public class EstoqueGUI extends JFrame {

    public EstoqueGUI() {
        setTitle("Cadastro de Estoque");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 linhas, 2 colunas

        // Labels e campos de texto
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JTextField quantidadeField = new JTextField();

        JLabel validadeLabel = new JLabel("Validade:");
        JTextField validadeField = new JTextField();

        JLabel dataEntradaLabel = new JLabel("Data de Entrada:");
        JTextField dataEntradaField = new JTextField();

        // Botão "Salvar"
        JButton salvarButton = new JButton("Salvar");

        salvarButton.addActionListener(e -> {
            String quantidade = quantidadeField.getText();
            String validade = validadeField.getText();
            String dataEntrada = dataEntradaField.getText();

            JOptionPane.showMessageDialog(this,
                    "Quantidade: " + quantidade + "\n" +
                    "Validade: " + validade + "\n" +
                    "Data de Entrada: " + dataEntrada,
                    "Dados do Estoque",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        // Adiciona os componentes ao painel
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);

        panel.add(validadeLabel);
        panel.add(validadeField);

        panel.add(dataEntradaLabel);
        panel.add(dataEntradaField);

        panel.add(new JLabel()); // Espaço vazio
        panel.add(salvarButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EstoqueGUI janela = new EstoqueGUI();
            janela.setVisible(true);
        });
    }
}

