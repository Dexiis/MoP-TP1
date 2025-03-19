/**
 * Representa um pinguim com nome, idade e peso.
 */
public class Pinguim {
    private final String name;
    private int age;
    private int peso;

    /**
     * Construtor da classe Pinguim.
     *
     * @param name Nome do pinguim.
     * @param age Idade do pinguim.
     * @param peso Peso do pinguim em Kg.
     */
    public Pinguim(String name, int age, int peso) {
        this.name = name;
        this.age = age;
        this.peso = peso;
    }

    /**
     * Obtém o nome do pinguim.
     *
     * @return O nome do pinguim.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade do pinguim.
     *
     * @return A idade do pinguim.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o peso do pinguim.
     *
     * @return O peso do pinguim em Kg.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Define a idade do pinguim.
     *
     * @param age A nova idade do pinguim.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define o peso do pinguim.
     *
     * @param peso O novo peso do pinguim em Kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Compara este pinguim com outro para verificar se são iguais.
     *
     * @param pinguim O pinguim a ser comparado.
     * @return true se os pinguins possuem o mesmo nome, idade e peso; false caso contrário.
     */
    public boolean equals(Pinguim pinguim) {
        return (pinguim != null) && (pinguim.getName().equals(getName())) &&
                (pinguim.getAge() == getAge()) && (pinguim.getPeso() == getPeso());
    }

    /**
     * Retorna uma representação textual do pinguim.
     *
     * @return Uma string formatada contendo o nome, idade e peso do pinguim.
     */
    public String toString() {
        return "O pinguim " + this.name + " de " + this.age + " anos, pesa " + this.peso + "Kg.";
    }
}
