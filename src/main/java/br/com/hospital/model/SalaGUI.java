//GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

public class SalaGUI extends JFrame {

    public SalaGUI() {
        setTitle("Cadastro de Salas da Clínica");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // 5 linhas, 2 colunas

        // Labels e campos de texto
        JLabel consultorioLabel = new JLabel("Consultório:");
        JTextField consultorioField = new JTextField();

        JLabel emergenciaLabel = new JLabel("Sala de Emergência:");
        JTextField emergenciaField = new JTextField();

        JLabel suturaLabel = new JLabel("Sala de Sutura:");
        JTextField suturaField = new JTextField();

        JLabel observacaoLabel = new JLabel("Observação:");
        JTextField observacaoField = new JTextField();

        // Botão para simular envio
        JButton enviarButton = new JButton("Enviar");

        // Ação do botão
        enviarButton.addActionListener(e -> {
            String consultorio = consultorioField.getText();
            String emergencia = emergenciaField.getText();
            String sutura = suturaField.getText();
            String observacao = observacaoField.getText();

            JOptionPane.showMessageDialog(this,
                    "Consultório: " + consultorio + "\n" +
                    "Emergência: " + emergencia + "\n" +
                    "Sutura: " + sutura + "\n" +
                    "Observação: " + observacao,
                    "Dados Inseridos",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        // Adiciona os componentes ao painel
        panel.add(consultorioLabel);
        panel.add(consultorioField);

        panel.add(emergenciaLabel);
        panel.add(emergenciaField);

        panel.add(suturaLabel);
        panel.add(suturaField);

        panel.add(observacaoLabel);
        panel.add(observacaoField);

        panel.add(new JLabel()); // Espaço vazio
        panel.add(enviarButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalaGUI janela = new SalaGUI();
            janela.setVisible(true);
        });
    }
}
