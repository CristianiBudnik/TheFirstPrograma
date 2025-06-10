import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;
        double lado, raio;
        double areaQuadrada, areaCirculo;

        System.out.println("Escolha a opcao desejada: ");
        System.out.println("1 - Calcular a area do quadrado ");
        System.out.println("2 - Calcular a area do circulo ");
        opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor do lado do quadrado: ");
                lado = leitor.nextDouble();
                areaQuadrada = lado * 2;
                System.out.println("A area do quadrado e " + areaQuadrada);
            } else if (opcao == 2) {
                System.out.println("Digite o valor do raio do circulo: ");
                raio = leitor.nextDouble();
                areaCirculo = Math.PI * (raio * 2);
                System.out.println("A area do circulo e " + areaCirculo);
            }else {
                System.out.println("Opcao invalida!");
            }
            leitor.close();
        }
    }
