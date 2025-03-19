/**
 * Classe que representa uma quantidade de carne disponível no jardim zoológico.
 */
public class Carne {
    private int quantidade;

    /**
     * Construtor da classe Carne.
     *
     * @param quantidade Quantidade inicial de carne em quilogramas.
     */
    public Carne(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém a quantidade de carne disponível.
     *
     * @return Quantidade de carne em quilogramas.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade de carne disponível.
     *
     * @param quantidade Nova quantidade de carne em quilogramas.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Compara duas instâncias de Carne verificando se possuem a mesma quantidade.
     *
     * @param carne Outra instância de Carne a comparar.
     * @return true se tiverem a mesma quantidade, false caso contrário.
     */
    public boolean equals(Carne carne) {
        return (carne != null) && (carne.getQuantidade() == getQuantidade());
    }

    /**
     * Retorna uma representação textual da quantidade de carne.
     *
     * @return String contendo a quantidade de carne disponível.
     */
    public String toString() {
        return "Existe " + this.quantidade + "Kg de carne.";
    }
}
