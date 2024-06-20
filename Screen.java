import javax.swing.*;

public class Screen extends JFrame{
    public Screen() {
        setVisible(true);
        setSize(800, 500);
        setTitle("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botao = new JButton("Clique Aqui!");
        botao.setBounds(275, 150, 200, 50);

        JLabel texto = new JLabel("Bom-Dia!");
        texto.setBounds(400, 150, 200, 50);
        texto.setVisible(true);

        add(texto);
        add(botao);
    }
}
