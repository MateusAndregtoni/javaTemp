import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Tela extends JFrame {

    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public JPanel tela;
    private JTextField estabelecimento;
    private JTextField itens;
    private JTextField nota;
    private JTextField comentario;
    private JButton guardarButton;
    private JButton buscarEButton;
    private JButton buscarIButton;
    private JButton mostrarTudoButton;
    private JTextArea textArea;
    private JButton fakeButton;




}

public Tela() {
    guardarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String estabelecimento = estabelecimentoInput.getText();
            String itens = itens.getText();
            int nota =Integer.parseInt(nota.getText());
            String comentario = comentario.getText();

            Avaliacao a = new Avaliacao(estabelecimento, itens, nota, comentario);
            avaliacoes.add(a);

            textArea.setText("");
            for(Avaliacao x : avaliacoes){
                textArea.append("====================\n\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
            }

            estabelecimentoInput.setText("");
            itens.setText("");
            nota.setText("");
            comentario.setText("");
        }
    });

    buscarEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String estabelecimento = estabelecimentoInput.getText();

            for(Avaliacao x : avaliacoes){
                if(Objects.equals(x.getEstabelecimento(), estabelecimento)) {

                    textArea.setText("");
                    textArea.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n\n====================");
                }
            }
        }
    });
    buscarIButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String itens = itens.getText();

            for(Avaliacao x : avaliacoes){
                if(Objects.equals(x.getItens(), itens)) {

                    textArea.setText("");
                    textArea.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n\n====================");
                }
            }
        }
    });

    mostrarTudoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            textArea.setText("");
            for(Avaliacao x : avaliacoes){
                textArea.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
            }
        }
    });

    fakeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                String estabelecimento = "Estabelecimento " + (i + 1);
                String item = "Item " + (i + 1);
                int nota = random.nextInt(10) + 1; // Quantidade aleatória entre 1 e 10
                String comentario = "Comentario Maneiro :)";

                Avaliacao avaliacao = new Avaliacao(estabelecimento, item, nota, comentario);
                avaliacoes.add(avaliacao);

                textArea.setText("");
                for(Avaliacao x : avaliacoes){
                    textArea.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
                }
            }

        }
    });
}
}