import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + resultado);
        }
    }
