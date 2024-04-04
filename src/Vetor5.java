import java.util.ArrayList;
import java.util.Random;

public class Vetor5 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();


        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numeroAleatorio = random.nextInt(1000);
            vetor.add(numeroAleatorio);
        }

        System.out.println("Vetor com 1000 números aleatórios:");
        for (int i = 0; i < vetor.size(); i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }


}
