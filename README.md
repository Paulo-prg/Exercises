# Exercises
import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {

    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colecao = new ArrayList<String>();

        // Lê as strings até encontrar a palavra "fim"
        System.out.println("Digite as strings a serem armazenadas:");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("fim")) {
                break;
            }
            colecao.add(entrada);
        }

        // Lê as strings até encontrar a palavra "fim" e verifica se já foram lidas anteriormente
        System.out.println("Digite as strings a serem verificadas:");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("fim")) {
                break;
            }
            if (colecao.contains(entrada)) {
                System.out.println("A string \"" + entrada + "\" já foi lida anteriormente.");
            } else {
                System.out.println("A string \"" + entrada + "\" não foi lida anteriormente.");
            }
        }
    }
}
