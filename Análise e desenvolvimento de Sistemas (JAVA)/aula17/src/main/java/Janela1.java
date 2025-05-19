import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela1 extends JFrame{

    private JTextField campoNome;

    private JLabel respostaLabel;

    public Janela1() {
        setTitle("Janela principal");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Digite seu nome: ");
        campoNome = new JTextField(20);
        JButton botaoAbrir = new JButton("Abrir a janela secundaria: ");
        respostaLabel = new JLabel("");
        botaoAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                if (!nome.isEmpty()) {
                    JanelaSecundaria janelaSecundaria = new JanelaSecundaria(Janela1.this, nome);
                    janelaSecundaria.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Digite seu nome primeiro!");
                }
            }
        });

        add(label);
        add(campoNome);
        add(botaoAbrir);
        add(respostaLabel);
        setVisible(true);
    }
        //Método que sera chamado pela janela secundaria para mostrar a resposta
        public void exibirResposta(String mensagem){
            respostaLabel.setText("Resposta " + mensagem);
        }

        public static void main (String[] args){
            new Janela1();
        }
}

//Janela secundária
class JanelaSecundaria extends JFrame {
    public JanelaSecundaria(Janela1 janelaPrincipal, String nomeRecebido){
        setTitle("Janela Secundaria");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Olá! " + nomeRecebido);
        JButton botaoResponder = new JButton("Responder para principal");
        botaoResponder.addActionListener(new ActionListener() {

        @Override
                public void actionPerformed(ActionEvent e) {
            janelaPrincipal.exibirResposta("Olá" + nomeRecebido + "! resposta recebida");
        }
        });

        add(label);
        add(botaoResponder);
}

}

