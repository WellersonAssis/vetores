public class Vetor7 {

    public static void main(String[] args) {

        int[] vetorComElementos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int media = CalMedia(vetorComElementos);
        System.out.println("Média dos elementos: " + media);
    }

    public static int CalMedia(int[] vetor) {
        int soma = 0;
        for(int indice = 0; indice<vetor.length; indice++){
            soma += (vetor[indice]);
        }
        return soma/vetor.length;
    }
}
