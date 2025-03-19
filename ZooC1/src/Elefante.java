/**
 * Representa um elefante com nome, idade e peso.
 */
public class Elefante {
    private final String name;
    private int age;
    private int peso;

    /**
     * Construtor da classe Elefante.
     *
     * @param name Nome do elefante.
     * @param age Idade do elefante.
     * @param peso Peso do elefante em Kg.
     */
    public Elefante(String name, int age, int peso) {
        this.name = name;
        this.age = age;
        this.peso = peso;
    }

    /**
     * Obtém o nome do elefante.
     *
     * @return O nome do elefante.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade do elefante.
     *
     * @return A idade do elefante.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o peso do elefante.
     *
     * @return O peso do elefante em Kg.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Define a idade do elefante.
     *
     * @param age A nova idade do elefante.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define o peso do elefante.
     *
     * @param peso O novo peso do elefante em Kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Compara este elefante com outro para verificar se são iguais.
     *
     * @param elefante O elefante a ser comparado.
     * @return true se os elefantes possuem o mesmo nome, idade e peso; false caso contrário.
     */
    public boolean equals(Elefante elefante) {
        return (elefante != null) && (elefante.getName().equals(getName())) &&
                (elefante.getAge() == getAge()) && (elefante.getPeso() == getPeso());
    }

    /**
     * Retorna uma representação textual do elefante.
     *
     * @return Uma string formatada contendo o nome, idade e peso do elefante.
     */
    public String toString() {
        return "O elefante " + this.name + " de " + this.age + " anos, pesa " + this.peso + "Kg.";
    }
}