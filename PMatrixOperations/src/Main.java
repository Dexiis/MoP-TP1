import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho que deseja para uma matriz quadrada?");
        int length = input.nextInt();
        int[][] matriz = new int[length][length];
        for (int row = 0; row < length; row++)
            for (int collum = 0; collum < length; collum++) { //percorre a lista toda para que esta possa ser preenchida
                System.out.println("Linha " + (row + 1) + ", coluna " + (collum + 1) + ": ");
                matriz[row][collum] = input.nextInt();
            }
        System.out.println();
        System.out.println("1 - Calcular e exibir a transposta da matriz.");
        System.out.println("2 - Calcular e exibir a soma de todos os elementos da matriz.");
        System.out.println("3 - Verificar e indicar se a matriz é simétrica.");
        System.out.println("4 - Sair do Programa.");

        while (true) {
            System.out.println();
            System.out.println("Escolha as operações que quiser:");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A matriz transposta é a seguinte:");
                    for (int i = 0; i < length; i++) {
                        System.out.println(Arrays.toString(matrizTransposta(matriz, length)[i]));
                    }
                    break;
                case 2:
                    System.out.println("A soma de todos os elementos da matriz é " + matrizSoma(matriz, length) + ".");
                    break;
                case 3:
                    if (matrizSimetrica(matriz, matrizTransposta(matriz, length), length))
                        System.out.println("A matriz é simétrica.");
                    else System.out.println("A matriz não é simétrica.");
                    break;
                case 4:
                    System.exit(0); //sai do programa
                default:
                    System.out.println("Valor Inválido.");
                    break;
            }
        }
    }

    private static int[][] matrizTransposta(int[][] matriz, int length) {
        int[][] matrizTransposta = new int[length][length];
        for (int row = 0; row < length; row++)
            for (int collum = 0; collum < length; collum++) {
                matrizTransposta[row][collum] = matriz[collum][row]; //percorre a lista toda transpodo-a noutro array
            }
        return matrizTransposta;
    }

    private static int matrizSoma(int[][] matriz, int length) {
        int soma = 0;
        for (int row = 0; row < length; row++)
            for (int collum = 0; collum < length; collum++) {
                soma += matriz[row][collum]; //percorre a lista toda somando todos os elementos à variável "soma"
            }
        return soma;
    }

    private static boolean matrizSimetrica(int[][] matriz, int[][] matrizTransponsta, int length) {
        for (int row = 0; row < length; row++)
            for (int collum = 0; collum < length; collum++) {
                if (matrizTransponsta[row][collum] != matriz[row][collum])
                    return false; //confirma se tem algum elemento numa certa posição em ambos os arrays que seja diferente
            }
        return true;
    }

}
