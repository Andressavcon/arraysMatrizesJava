public class Main {
    public static void main(String[] args) {

        // ARRAYS E MATRIZES

        // ARRAYS
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        // IMPRIMIR ARRAY
        System.out.println("Elementos do array 'vetor': ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.println("Elemento na posição " + j + ": " + vetor[j]);
        }

        // SOMATÓRIO ARRAY
        int soma = 0;
        for (int j = 0; j < vetor.length; j++) {
            soma += vetor[j];
        }
        System.out.println("Soma do array 'vetor': " + soma);

        // VALOR MÁXIMO
        int max = vetor[0];
        for (int value : vetor) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Valor máximo no array: " + max);

        // REVERTENDO ARRAY
        int start = 0;
        int end = vetor.length - 1;
        while (start < end) {
            int temp = vetor[start];
            vetor[start] = vetor[end];
            vetor[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array 'vetor' invertido: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.println("Elemento na posição " + j + ": " + vetor[j]);
        }

        // ADICIONAR VALOR EM UM ARRAY
        int[] newArray = new int[vetor.length + 1];
        for (int j = 0; j < vetor.length; j++) {
            newArray[j] = vetor[j];
        }
        newArray[vetor.length] = 1;

        // REMOVER VALOR EM UM ARRAY
        int countRemocao = 0;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] != 10) {
                countRemocao++;
            }
        }
        int[] newArrayRemocao = new int[countRemocao];
        int index = 0;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] != 10) {
                newArrayRemocao[index] = vetor[j];
                index++;
            }
        }
        System.out.println("Array após remoção: ");
        for (int j = 0; j < newArrayRemocao.length; j++) {
            System.out.println("Elemento na posição " + j + ": " + newArrayRemocao[j]);
        }

        // PESQUISANDO VALOR EM ARRAY
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == 20) {
                System.out.println("Elemento 20 encontrado na posição: " + j);
            }
        }

        // MATRIZES
        int[][] matrix = {
                {10, 20, 35},
                {30, 50, 60},
                {70, 80, 90}
        };

        // ROTAÇÃO MATRIZ 90 GRAUS
        int n = matrix.length;
        int[][] rotacionada = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                rotacionada[k][n - 1 - j] = matrix[j][k];
            }
        }
        System.out.println("Matriz rotacionada 90 graus:");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(rotacionada[j][k] + " ");
            }
            System.out.println();
        }

        // SOMA DAS DIAGONAIS
        int sumPrincipal = 0;
        int sumSecundaria = 0;
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[j].length; k++) {
                if (j == k) {
                    sumPrincipal += matrix[j][k];
                }
                if ((j + k) == matrix.length - 1) {
                    sumSecundaria += matrix[j][k];
                }
            }
        }

        System.out.println("Soma principal: " + sumPrincipal);
        System.out.println("Soma secundária: " + sumSecundaria);


        // PESQUISAR VALOR MATRIZ
        int valorParaEncontrar = 60;
        boolean encontrado = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == valorParaEncontrar) {
                    System.out.println("Valor " + valorParaEncontrar + " encontrado na posição: (" + i + ", " + j + ")");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }
        if (!encontrado) {
            System.out.println("Valor " + valorParaEncontrar + " não encontrado na matriz.");
        }

    }
}