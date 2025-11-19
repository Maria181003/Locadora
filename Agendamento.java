// Classe que representa um agendamento de aluguel de veículo
public class Agendamento {

    // Nome do cliente que fará o agendamento
    private String nomeCliente;

    // Data do agendamento (ex: "15/11/2025")
    private String data;

    // Hora do agendamento (ex: "14:30")
    private String hora;

    // Objeto Carro associado ao agendamento
    private Carro carro;

    /**
     * Construtor da classe Agendamento.
     * Recebe o nome do cliente, data, hora e o carro reservado.
     */
    public Agendamento(String nomeCliente, String data, String hora, Carro carro) {
        this.nomeCliente = nomeCliente; // Atribui o nome do cliente
        this.data = data;               // Atribui a data
        this.hora = hora;               // Atribui a hora
        this.carro = carro;             // Atribui o carro associado
    }

    // Retorna o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Retorna a data do agendamento
    public String getData() {
        return data;
    }

    // Retorna a hora do agendamento
    public String getHora() {
        return hora;
    }

    // Retorna o carro reservado
    public Carro getCarro() {
        return carro;
    }

    /**
     * Retorna uma representação textual do agendamento.
     * Exemplo de saída:
     * "Cliente: João | Carro: Onix (ABC-1234) | Data: 10/11/2025 | Hora: 15:00"
     */
    @Override
    public String toString() {
        return "Cliente: " + nomeCliente +
               " | Carro: " + carro.getModelo() + " (" + carro.getPlaca() + ")" +
               " | Data: " + data +
               " | Hora: " + hora;
    }
}
