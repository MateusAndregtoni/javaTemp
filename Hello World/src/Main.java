//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner numero = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int informacao = Integer.parseInt(numero.nextLine());
//
//        for (int i = 1; i <= 10; i++) {
//            int result = i * informacao;
//            System.out.printf("\n %d * %d = %d",i,informacao,result);
//
//        }
//    }
//}



import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"OI");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Receba!"));
        JOptionPane.showConfirmDialog(null,"As vera?");



        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreve:");
        String info = teclado.nextLine();
        System.out.println("Escreve Numero1:");
        Float numero1 = teclado.nextFloat();
        System.out.println("Escreve Numero2:");
        Float numero2 = teclado.nextFloat();
        System.out.println("Escreve Numero3:");
        Float numero3 = teclado.nextFloat();
        System.out.println("Escreve Numero4:");
        Float numero4 = teclado.nextFloat();
        float media = (numero1 + numero2 + numero3 + numero4) / 4;
        if (media >= 7) {
            System.out.printf(" %s sua media foi %.1f e voce passou!",info,media);

        } else {
            System.out.printf(" %s sua media foi %.1f e voce não passou!",info,media);
        };

    }
}
