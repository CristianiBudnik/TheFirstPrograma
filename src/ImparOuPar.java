import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Escolha um numero: ");
        numero = leitor.nextInt();


        if (numero % 2 == 0){
            System.out.println(numero + " e par");
        } else {
            System.out.println(numero + " e impar");
        }
    }
}
