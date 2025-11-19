// Classe que representa um carro dentro do sistema da locadora
public class Carro {

    // Modelo do carro (ex: "Onix", "Gol", "Civic" , "Nivus" , "Polo")
    private String modelo;

    // Placa do carro (ex: "ABC-1234")
    private String placa;

    // Indica se o carro está disponível para aluguel (true = disponível)
    private boolean disponivel;

    /**
     * Construtor da classe Carro.
     * Ao criar um novo carro, ele automaticamente inicia como disponível.
     */
    public Carro(String modelo, String placa) {
        this.modelo = modelo;   // Define o modelo do carro
        this.placa = placa;     // Define a placa
        this.disponivel = true; // Todo carro começa disponível
    }

    // Retorna o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Retorna a placa do carro
    public String getPlaca() {
        return placa;
    }

    // Retorna true se o carro estiver disponível para aluguel
    public boolean isDisponivel() {
        return disponivel;
    }

    // Permite alterar a disponibilidade do carro (ex: ao alugar ou devolver)
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Retorna uma representação textual do carro.
     * Exemplo: "Onix - Placa: ABC-1234 - Disponível"
     */
    @Override
    public String toString() {
        return modelo + " - Placa: " + placa + " - " + 
               (disponivel ? "Disponível" : "Agendado");
    }
}
