/**
 * Classe que representa um guia do jardim zoológico.
 * Cada guia tem um nome, idade, identificação única e anos de experiência.
 */
public class Guia {
    private final String name;
    private int age;
    private final int ID;
    private int experience;

    /**
     * Construtor da classe Guia.
     *
     * @param name Nome do guia.
     * @param age Idade do guia.
     * @param ID Identificação única do guia.
     * @param experience Anos de experiência do guia.
     */
    public Guia(String name, int age, int ID, int experience) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.experience = experience;
    }

    /**
     * Obtém o nome do guia.
     *
     * @return Nome do guia.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade do guia.
     *
     * @return Idade do guia.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o ID do guia.
     *
     * @return Identificação única do guia.
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Obtém a experiência do guia.
     *
     * @return Anos de experiência do guia.
     */
    public int getExperience() {
        return this.experience;
    }

    /**
     * Define a idade do guia.
     *
     * @param age Nova idade do guia.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define a experiência do guia.
     *
     * @param experience Novo valor de anos de experiência.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Compara dois guias verificando se têm os mesmos atributos.
     *
     * @param guia Outro guia a comparar.
     * @return true se forem iguais, false caso contrário.
     */
    public boolean equals(Guia guia) {
        return (guia != null) && (guia.getName().equals(getName())) && (guia.getAge() == getAge()) && (guia.experience == getExperience()) && (guia.getID() == getID());
    }

    /**
     * Retorna uma representação textual do guia.
     *
     * @return String contendo informações do guia.
     */
    public String toString() {
        return "O Guia " + this.name + " de " + this.age + " anos possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.ID;
    }
}