/**
 * Classe que representa um administrador do jardim zoológico.
 * Cada administrador tem um nome, idade, identificação única e anos de experiência.
 */
public class Administrador {
    private final String name;
    private int age;
    private final int ID;
    private int experience;

    /**
     * Construtor da classe Administrador.
     *
     * @param name       Nome do administrador.
     * @param age        Idade do administrador.
     * @param ID         Identificação única do administrador.
     * @param experience Anos de experiência do administrador.
     */
    public Administrador(String name, int age, int ID, int experience) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.experience = experience;
    }

    /**
     * Obtém o nome do administrador.
     *
     * @return Nome do administrador.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtém a idade do administrador.
     *
     * @return Idade do administrador.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o ID do administrador.
     *
     * @return Identificação única do administrador.
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Obtém a experiência do administrador.
     *
     * @return Anos de experiência do administrador.
     */
    public int getExperience() {
        return this.experience;
    }

    /**
     * Define a idade do administrador.
     *
     * @param age Nova idade do administrador.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define a experiência do administrador.
     *
     * @param experience Novo valor de anos de experiência.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Compara dois administradores verificando se têm os mesmos atributos.
     *
     * @param administrador Outro administrador a comparar.
     * @return true se forem iguais, false caso contrário.
     */
    public boolean equals(Administrador administrador) {
        return (administrador != null) && (administrador.getName().equals(getName())) && (administrador.getAge() == getAge()) && (administrador.experience == getExperience()) && (administrador.getID() == getID());
    }

    /**
     * Retorna uma representação textual do administrador.
     *
     * @return String contendo informações do administrador.
     */
    public String toString() {
        return "O administrador " + this.name + " de " + this.age + " anos possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.ID;
    }
}
