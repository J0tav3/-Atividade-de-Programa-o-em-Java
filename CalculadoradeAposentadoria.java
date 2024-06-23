import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        boolean podeAposentar = (sexo == 'M' && (idade >= 65 || anosContribuicao >= 35)) ||
                                (sexo == 'F' && (idade >= 60 || anosContribuicao >= 30));

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            int anosParaAposentarIdade = (sexo == 'M') ? 65 - idade : 60 - idade;
            int anosParaAposentarContribuicao = (sexo == 'M') ? 35 - anosContribuicao : 30 - anosContribuicao;

            System.out.printf("Faltam %d anos para se aposentar por idade.\n", Math.max(0, anosParaAposentarIdade));
            System.out.printf("Faltam %d anos para se aposentar por tempo de contribuição.\n", Math.max(0, anosParaAposentarContribuicao));
        }

        scanner.close();
    }
}
