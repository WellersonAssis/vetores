public class Vetor10 {

    public static void main(String[] args) {
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        System.out.println("Ordem Inversa de vetores");
        OrdemInversaVetores(vetorComElementos);
    }

    public static void OrdemInversaVetores(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
