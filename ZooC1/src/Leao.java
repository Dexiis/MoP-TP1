/**
 * Representa um leão com nome, idade e peso.
 */
public class Leao {
    private final String name;
    private int age;
    private int peso;

    /**
     * Construtor da classe Leao.
     *
     * @param name Nome do leão.
     * @param age Idade do leão.
     * @param peso Peso do leão em Kg.
     */
    public Leao(String name, int age, int peso) {
        this.name = name;
        this.age = age;
        this.peso = peso;
    }

    /**
     * Obtém o nome do leão.
     *
     * @return O nome do leão.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade do leão.
     *
     * @return A idade do leão.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o peso do leão.
     *
     * @return O peso do leão em Kg.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Define a idade do leão.
     *
     * @param age A nova idade do leão.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define o peso do leão.
     *
     * @param peso O novo peso do leão em Kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Compara este leão com outro para verificar se são iguais.
     *
     * @param leao O leão a ser comparado.
     * @return true se os leões possuem o mesmo nome, idade e peso; false caso contrário.
     */
    public boolean equals(Leao leao) {
        return (leao != null) && (leao.getName().equals(getName())) &&
                (leao.getAge() == getAge()) && (leao.getPeso() == getPeso());
    }

    /**
     * Retorna uma representação textual do leão.
     *
     * @return Uma string formatada contendo o nome, idade e peso do leão.
     */
    public String toString() {
        return "O leão " + this.name + " de " + this.age + " anos, pesa " + this.peso + "Kg.";
    }
}