import java.util.Scanner; // Importa a classe Scanner para leitura de dados do teclado

// Classe principal que executa o sistema da locadora
public class Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Objeto para capturar entradas do usuário
        Locadora locadora = new Locadora();       // Instância da classe responsável pela lógica da locadora
        int opcao;                                // Variável para armazenar a opção do menu

        // Estrutura de repetição para manter o menu funcionando até o usuário escolher sair
        do {
            // Exibe o menu
            System.out.println("\n===============================");
            System.out.println("  LOCADORA DE VEÍCULOS JAVA ");
            System.out.println("===============================");
            System.out.println("1 - Listar carros disponíveis");
            System.out.println("2 - Agendar carro");
            System.out.println("3 - Listar agendamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            // Captura a escolha do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {

                // Caso 1: lista os carros que ainda não estão agendados
                case 1:
                    locadora.listarCarros();
                    break;

                // Caso 2: realiza o processo de agendamento de um carro
                case 2:
                    locadora.listarCarros(); // Mostra carros disponíveis

                    System.out.print("Escolha o número do carro: ");
                    int indice = scanner.nextInt() - 1; // Subtrai 1 para ajustar ao índice da lista
                    scanner.nextLine();

                    // Captura informações do cliente
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Data do agendamento (dd/mm/aaaa): ");
                    String data = scanner.nextLine();

                    System.out.print("Hora do agendamento: ");
                    String hora = scanner.nextLine();

                    // Envia as informações para a classe Locadora processar o agendamento
                    locadora.agendarCarro(indice, nome, data, hora);
                    break;

                // Caso 3: exibe todos os agendamentos existentes
                case 3:
                    locadora.listarAgendamentos();
                    break;

                // Caso 0: encerra o programa
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                // Qualquer outra opção é inválida
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // O menu continua até o usuário digitar 0

        scanner.close(); // Fecha o scanner para liberar memória
    }
}
