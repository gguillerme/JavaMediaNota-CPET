import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as informações ao usuário
        System.out.println("Por favor, insira as seguintes informações:");
        
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o nome do curso:");
        String nomeCurso = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (formato dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o estado onde mora:");
        String estado = scanner.nextLine();

        System.out.println("Digite a média do exercício de fixação - Conceito de Orientação a Objeto:");
        double mediaOOP = scanner.nextDouble();

        System.out.println("Digite a média do exercício de fixação - Orientação a Objetos Parte 1:");
        double mediaOOParte1 = scanner.nextDouble();

        System.out.println("Digite a média do exercício de fixação - Construções Básicas:");
        double mediaConstrucoesBasicas = scanner.nextDouble();

        // Calcular a média entre as notas
        double media = (mediaOOP + mediaOOParte1 + mediaConstrucoesBasicas) / 3;

        // Imprimir todas as informações e a média
        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Estado: " + estado);
        System.out.println("Média das notas: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
