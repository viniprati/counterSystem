import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número inicial: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o número final: ");
            int fim = scanner.nextInt();

            System.out.print("Digite o intervalo: ");
            int intervalo = scanner.nextInt();

            if (intervalo == 0) {
                throw new IllegalArgumentException("O intervalo não pode ser zero.");
            }

            contar(inicio, fim, intervalo);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int inicio, int fim, int intervalo) {
        if (inicio < fim && intervalo > 0) {
            System.out.println("Contagem crescente:");
            for (int i = inicio; i <= fim; i += intervalo) {
                System.out.println(i);
            }
        } else if (inicio > fim && intervalo < 0) {
            System.out.println("Contagem decrescente:");
            for (int i = inicio; i >= fim; i += intervalo) {
                System.out.println(i);
            }
        } else {
            System.out.println("A contagem não pode ser realizada com os valores fornecidos.");
        }
    }
}
