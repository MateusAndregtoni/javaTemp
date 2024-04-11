//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//     int numero,maior = -1;
//
//        for (int i = 0; i < 3; i++) {
//            numero = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "Numero: "));
//            if (numero >= 0 && numero <= 100){
//                if( numero > maior);
//                maior = numero;
//
//            }else{
//                i--;
//            };
//        }
//
//        JOptionPane.showMessageDialog(null,maior);
//    }
//}


//import javax.swing.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
//
////        for (int i = 0; i < numeros.length; i++) {
////            System.out.println("Array: " + numeros[i]);
////        };
//        int pesq = Integer.parseInt(JOptionPane.showInputDialog("Numero de array: "));
//        int posicaoFake = Arrays.binarySearch(numeros,pesq);
//
//        JOptionPane.showMessageDialog(null , "olha: " + (posicaoFake + 1));
//    };
//};


        import javax.swing.*;
        import java.util.ArrayList;
        import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double maior;

        for (int i = 0; i < 5; i++) {

            ArrayList<Integer> salarios = new ArrayList<Integer>();
            int salario = Integer.parseInt(JOptionPane.showInputDialog("Valor Salario:"));
            salarios.add(salario);
        }



    };
};



