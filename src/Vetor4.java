import java.util.ArrayList;

public class Vetor4 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();


        vetor.add(0);
        vetor.add(1);
        vetor.add(2);
        vetor.add(3);
        vetor.add(4);
        vetor.add(5);


        System.out.println("Vetor com tamanho dinâmico após adicionar os elementos:");
        for (int i = 0; i < vetor.size(); i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }
}
