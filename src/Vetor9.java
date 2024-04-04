public class Vetor9 {

    public static void main(String[] args) {
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int menor = MenorElemento(vetorComElementos);
        System.out.println("Menor elemento: " + menor);
    }

    public static int MenorElemento(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }
}
