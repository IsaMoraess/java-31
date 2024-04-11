import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis
        String nomeCarro;
        int velocidadeMaxima;
        float tempoAceleracao;
        double precoCarro;

        // Leitura dos dados pelo teclado
        System.out.println("Informe o nome do carro: ");
        nomeCarro = input.nextLine();

        System.out.println("Informe a velocidade máxima do carro: ");
        velocidadeMaxima = input.nextInt();

        System.out.println("Informe o tempo de aceleração de 0 a 100 do carro: ");
        tempoAceleracao = input.nextFloat();

        System.out.println("Informe o preço do carro: ");
        precoCarro = input.nextDouble();

        // Exibição das informações
        System.out.println("Informações do Carro:");
        System.out.println("Nome: " + nomeCarro);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Tempo de Aceleração (0-100 km/h): " + tempoAceleracao + " segundos");
        System.out.println("Preço: R$" + precoCarro);
    }
}

