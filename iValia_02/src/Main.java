import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Tela t = new Tela();

        t.setContentPane(t.painel);
        t.setTitle("Mateus <3 Ryan");
        t.setSize(800, 350);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setLocationRelativeTo(null);
        t.toFront();

    }
}