import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int informacao = Integer.parseInt(numero.nextLine());

        for (int i = 1; i <= 10; i++) {
            int result = i * informacao;
            System.out.printf("\n %d * %d = %d",i,informacao,result);

        }
    }
}
