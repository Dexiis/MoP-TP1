/**
 * Representa uma girafa com nome, idade e peso.
 */
public class Girafa {
    private final String name;
    private int age;
    private int peso;

    /**
     * Construtor da classe Girafa.
     *
     * @param name Nome da girafa.
     * @param age Idade da girafa.
     * @param peso Peso da girafa em Kg.
     */
    public Girafa(String name, int age, int peso) {
        this.name = name;
        this.age = age;
        this.peso = peso;
    }

    /**
     * Obtém o nome da girafa.
     *
     * @return O nome da girafa.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade da girafa.
     *
     * @return A idade da girafa.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o peso da girafa.
     *
     * @return O peso da girafa em Kg.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Define a idade da girafa.
     *
     * @param age A nova idade da girafa.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define o peso da girafa.
     *
     * @param peso O novo peso da girafa em Kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Compara esta girafa com outra para verificar se são iguais.
     *
     * @param girafa A girafa a ser comparada.
     * @return true se as girafas possuem o mesmo nome, idade e peso; false caso contrário.
     */
    public boolean equals(Girafa girafa) {
        return (girafa != null) && (girafa.getName().equals(getName())) &&
                (girafa.getAge() == getAge()) && (girafa.getPeso() == getPeso());
    }

    /**
     * Retorna uma representação textual da girafa.
     *
     * @return Uma string formatada contendo o nome, idade e peso da girafa.
     */
    public String toString() {
        return "A girafa " + this.name + " de " + this.age + " anos, pesa " + this.peso + "Kg.";
    }
}