/**
 * Classe que representa uma quantidade de peixe disponível no jardim zoológico.
 */
public class Peixe {
    private int quantidade;

    /**
     * Construtor da classe Peixe.
     *
     * @param quantidade Quantidade inicial de peixe em quilogramas.
     */
    public Peixe(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém a quantidade de peixe disponível.
     *
     * @return Quantidade de peixe em quilogramas.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade de peixe disponível.
     *
     * @param quantidade Nova quantidade de peixe em quilogramas.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Compara duas instâncias de Peixe verificando se possuem a mesma quantidade.
     *
     * @param peixe Outra instância de Peixe a comparar.
     * @return true se tiverem a mesma quantidade, false caso contrário.
     */
    public boolean equals(Peixe peixe) {
        return (peixe != null) && (peixe.getQuantidade() == getQuantidade());
    }

    /**
     * Retorna uma representação textual da quantidade de peixe.
     *
     * @return String contendo a quantidade de peixe disponível.
     */
    public String toString() {
        return "Existe " + this.quantidade + "Kg de peixe.";
    }
}
