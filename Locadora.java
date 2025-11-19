import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas

// Classe responsável por gerenciar carros e agendamentos da locadora
public class Locadora {

    // Lista que armazena todos os carros cadastrados
    private ArrayList<Carro> carros;

    // Lista que armazena todos os agendamentos realizados
    private ArrayList<Agendamento> agendamentos;

    /**
     * Construtor da classe Locadora.
     * Inicializa as listas e adiciona um conjunto padrão de carros.
     */
    public Locadora() {
        carros = new ArrayList<>();        // Cria lista de carros
        agendamentos = new ArrayList<>();  // Cria lista de agendamentos
        adicionarCarrosPadrao();           // Insere carros iniciais
    }

    /**
     * Adiciona um conjunto de carros padrão ao sistema.
     * Essa função facilita testes e demonstração do sistema.
     */
    private void adicionarCarrosPadrao() {
        carros.add(new Carro("Gol", "ABC-1234"));
        carros.add(new Carro("Onix", "XYZ-9876"));
        carros.add(new Carro("Civic", "JKL-5678"));
        carros.add(new Carro("Nivus", "MNO-4321"));
        carros.add(new Carro("Polo", "PJF-0124"));
    }

    // Retorna a lista completa de carros cadastrados
    public ArrayList<Carro> getCarros() {
        return carros;
    }

    // Retorna a lista de todos os agendamentos
    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    /**
     * Exibe no console todos os carros cadastrados.
     * A lista mostra o índice + o texto retornado pelo toString() do carro.
     */
    public void listarCarros() {
        System.out.println("\n=== CARROS DISPONÍVEIS ===");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println((i + 1) + ". " + carros.get(i));
        }
    }

    /**
     * Realiza o agendamento de um carro.
     * 
     * @param indice posição do carro na lista (base 0)
     * @param nomeCliente nome do cliente que fará o agendamento
     * @param data data do agendamento
     * @param hora hora do agendamento
     * @return true se o agendamento for bem-sucedido, false se não for possível
     */
    public boolean agendarCarro(int indice, String nomeCliente, String data, String hora) {

        // Verifica se o índice do carro é válido
        if (indice < 0 || indice >= carros.size()) {
            System.out.println("Carro inválido!");
            return false;
        }

        // Obtém o carro escolhido pelo usuário
        Carro carro = carros.get(indice);

        // Impede agendar um carro que já está ocupado
        if (!carro.isDisponivel()) {
            System.out.println("Este carro já está agendado!");
            return false;
        }

        // Marca o carro como indisponível
        carro.setDisponivel(false);

        // Cria o objeto do agendamento
        Agendamento agendamento = new Agendamento(nomeCliente, data, hora, carro);

        // Adiciona o agendamento na lista
        agendamentos.add(agendamento);

        System.out.println("✅ Agendamento realizado com sucesso!");
        return true;
    }

    /**
     * Exibe todos os agendamentos presentes na lista.
     * Caso não exista nenhum, mensagem informativa é mostrada.
     */
    public void listarAgendamentos() {
        System.out.println("\n=== AGENDAMENTOS ===");

        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento encontrado.");
        } else {
            for (Agendamento a : agendamentos) {
                System.out.println(a); // Usa o método toString() de Agendamento
            }
        }
    }
}
