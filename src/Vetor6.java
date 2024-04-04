public class Vetor6 {

    public static void main(String[] args) {
        int[] vetorComElementos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = Soma(vetorComElementos);
        System.out.println("Soma dos elementos: " + soma);
    }

    public static int Soma(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }
}
