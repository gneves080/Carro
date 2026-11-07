
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CadastroCarros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        // Criando vetor com capacidade para 50 carros
        Carro[] carros = new Carro[50];

        int quantidade;

        // Solicitando a quantidade de carros
        do {
            System.out.print("Quantos carros deseja cadastrar (1 a 50)? ");
            quantidade = scanner.nextInt();

            if (quantidade < 1 || quantidade > 50) {
                System.out.println("Quantidade inválida! Digite um valor entre 1 e 50.");
            }

        } while (quantidade < 1 || quantidade > 50);

        scanner.nextLine();

        // Cadastrando os carros
        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nCadastro do carro " + (i + 1));

            System.out.print("Digite o modelo do carro: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do carro: R$ ");
            double preco = scanner.nextDouble();

            scanner.nextLine();

            // Criando objeto e armazenando no vetor
            carros[i] = new Carro(nome, preco);
        }

        // Calculando a soma dos preços
        double somaPrecos = 0;

        System.out.println("\n===== CARROS CADASTRADOS =====");

        for (int i = 0; i < quantidade; i++) {

            System.out.println(carros[i]);

            somaPrecos += carros[i].getPreco();
        }

        // Formatando valores em moeda brasileira
        NumberFormat formatoMoeda =
                NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        // Exibindo resumo
        System.out.println("\n===== RESUMO DO CADASTRO =====");

        System.out.println("Quantidade de carros: " + quantidade);

        System.out.println("Soma dos preços: " +
                formatoMoeda.format(somaPrecos));

        scanner.close();
    }
}
