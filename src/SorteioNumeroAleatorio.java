import java.util.Random;
import java.util.Scanner;

public class SorteioNumeroAleatorio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int contadorTentativas = 0;
        int numeroDigitado = 0;

        while (contadorTentativas < 5){
            System.out.println("Digite um numero de 0 e 100: ");
            numeroDigitado = leitura.nextInt();
            contadorTentativas++;

            if(numeroDigitado == numeroAleatorio){
                System.out.println("Parabens, voce acertou o numero em " +contadorTentativas);
                break; //interrompe o loope while
            } else if (numeroDigitado < numeroAleatorio){
                System.out.println("O numero digitado e menor");
            } else{
                System.out.println("O numero digitado e maior");
            }
        }
        if (contadorTentativas == 5 && numeroDigitado != numeroAleatorio){
            System.out.println("Nao foi desta vez, voce nao acertou o numero aleatorio");
        }
    }
}