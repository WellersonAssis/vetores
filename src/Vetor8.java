public class Vetor8 {

    public static void main(String[] args) {
        int[] vetorComElementos = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int maior = VetorComMaiorElemento(vetorComElementos);
        System.out.println("Maior elemento: " + maior);
    }

    public static int VetorComMaiorElemento(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

}
