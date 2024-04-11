import javax.swing.*;

public class Main {
    public static void main(String[] args) {

     int numero,maior = -1;

        for (int i = 0; i < 3; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "Numero: "));
            if (numero >= 0 && numero <= 100){
                if( numero > maior);
                maior = numero;

            }else{
                i--;
            };
        }

        JOptionPane.showMessageDialog(null,maior);
    }
}