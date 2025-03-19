import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número que seja uma potência de 2:");
        int size = input.nextInt();
        while (true) {
            if ((size > 0) && ((size & (size - 1)) == 0)) break; //Função para determinar se o valor é uma potência de 2
            System.out.println("Esse valor não é uma potência de 2:");
            input.nextLine();
            size = input.nextInt();
        }
        int row = size;
        int col = (size * 2) - 1; //Número de '*' mais o número de ' '
        char[][] canvas = new char[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                canvas[i][j] = ' '; //Inicializar o array com todos os elementos em ' '
        drawSierpinski(canvas, 0, col / 2, size);
        printSierpinski(canvas);
    }

    public static void printSierpinski(char[][] canvas) {
        for (char[] line : canvas) System.out.println(new String(line));
    }

    public static void drawSierpinski(char[][] canvas, int x, int y, int size) {
        if (size == 1) {
            canvas[x][y] = '*'; // Ponto base: desenha um único '*'
            return;
        }

        int newSize = size / 2;

        // Desenha os três triângulos menores
        drawSierpinski(canvas, x, y, newSize);                    // Topo
        drawSierpinski(canvas, x + newSize, y - newSize, newSize); // Esquerda
        drawSierpinski(canvas, x + newSize, y + newSize, newSize); // Direita
    }
}