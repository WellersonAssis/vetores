import java.util.ArrayList;
import java.util.Random;

public class Vetor5 {

    public static void main(String[] args) {
        // Criando um ArrayList para simular um vetor com tamanho dinâmico
        ArrayList<Integer> vetor = new ArrayList<>();

        // Gerando 1000 números aleatórios e adicionando ao vetor
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numeroAleatorio = random.nextInt(1000); // Gera números aleatórios de 0 a 999
            vetor.add(numeroAleatorio);
        }

        // Exibindo o vetor
        System.out.println("Vetor com 1000 números aleatórios:");
        for (int i = 0; i < vetor.size(); i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }


}
