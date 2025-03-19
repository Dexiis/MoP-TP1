/**
 * Classe que representa uma quantidade de palha disponível no jardim zoológico.
 */
public class Palha {
    private int quantidade;

    /**
     * Construtor da classe Palha.
     *
     * @param quantidade Quantidade inicial de palha em quilogramas.
     */
    public Palha(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém a quantidade de palha disponível.
     *
     * @return Quantidade de palha em quilogramas.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade de palha disponível.
     *
     * @param quantidade Nova quantidade de palha em quilogramas.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Compara duas instâncias de Palha verificando se possuem a mesma quantidade.
     *
     * @param palha Outra instância de Palha a comparar.
     * @return true se tiverem a mesma quantidade, false caso contrário.
     */
    public boolean equals(Palha palha) {
        return (palha != null) && (palha.getQuantidade() == getQuantidade());
    }

    /**
     * Retorna uma representação textual da quantidade de palha.
     *
     * @return String contendo a quantidade de palha disponível.
     */
    public String toString() {
        return "Existe " + this.quantidade + "Kg de palha.";
    }
}
