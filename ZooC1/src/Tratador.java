/**
 * Classe que representa um tratador de animais num jardim zoológico.
 * Cada tratador tem um nome, idade, identificação única e anos de experiência.
 */

import java.util.ArrayList;

public class Tratador {
    private final String name;
    private int age;
    private final int ID;
    private int experience;
    private ArrayList<Object> animais = new ArrayList<>();

    /**
     * Construtor da classe Tratador.
     *
     * @param name       Nome do tratador.
     * @param age        Idade do tratador.
     * @param ID         Identificação única do tratador.
     * @param experience Anos de experiência do tratador.
     */
    public Tratador(String name, int age, int ID, int experience) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.experience = experience;
    }

    /**
     * Verifica se um animal específico está associado ao tratador.
     *
     * @param name      Nome do animal.
     * @param procedure Código do tipo de animal (1: Leão, 2: Elefante, 3: Girafa, 4: Pinguim).
     * @return true se o animal estiver associado ao tratador, false caso contrário.
     */
    public boolean checkAnimalInTratador(String name, int procedure) {
        if (procedure == 1)
            for (Object y : animais) if (y instanceof Leao && ((Leao) y).getName().equals(name)) return true;
        if (procedure == 2)
            for (Object y : animais) if (y instanceof Elefante && ((Elefante) y).getName().equals(name)) return true;
        if (procedure == 3)
            for (Object y : animais) if (y instanceof Girafa && ((Girafa) y).getName().equals(name)) return true;
        if (procedure == 4)
            for (Object y : animais) if (y instanceof Pinguim && ((Pinguim) y).getName().equals(name)) return true;
        return false;
    }

    /**
     * Adiciona um animal à lista de animais sob responsabilidade do tratador.
     *
     * @param animal Objeto do animal a ser adicionado.
     */
    public void setAnimais(Object animal) {
        animais.add(animal);
    }

    /**
     * Remove um animal da lista de animais sob responsabilidade do tratador.
     *
     * @param animal Objeto do animal a ser removido.
     */
    public void removeAnimais(Object animal) {
        animais.remove(animal);
    }

    /**
     * Obtém a idade do tratador.
     *
     * @return Idade do tratador.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Obtém o ID do tratador.
     *
     * @return Identificação única do tratador.
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Obtém o nome do tratador.
     *
     * @return Nome do tratador.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtém a experiência do tratador.
     *
     * @return Anos de experiência do tratador.
     */
    public int getExperience() {
        return this.experience;
    }

    /**
     * Define a idade do tratador.
     *
     * @param age Nova idade do tratador.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define a experiência do tratador.
     *
     * @param experience Novo valor de anos de experiência.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Exibe no terminal os animais associados ao tratador.
     */
    public void AnimaisAssociadosToString() {
        for (Object y : animais)
            if (y instanceof Leao)
                System.out.println("     O leão " + ((Leao) y).getName() + " pertence a " + getName() + ".");
        for (Object y : animais)
            if (y instanceof Elefante)
                System.out.println("     O elefante " + ((Elefante) y).getName() + " pertence a " + getName() + ".");
        for (Object y : animais)
            if (y instanceof Girafa)
                System.out.println("     A girafa " + ((Girafa) y).getName() + " pertence a " + getName() + ".");
        for (Object y : animais)
            if (y instanceof Pinguim)
                System.out.println("     O pinguim " + ((Pinguim) y).getName() + " pertence a " + getName() + ".");
    }

    /**
     * Compara dois tratadores verificando se têm os mesmos atributos.
     *
     * @param tratador Outro tratador a comparar.
     * @return true se forem iguais, false caso contrário.
     */
    public boolean equals(Tratador tratador) {
        return (tratador != null) && (tratador.getName().equals(getName())) && (tratador.getAge() == getAge()) && (tratador.experience == getExperience()) && (tratador.getID() == getID());
    }

    /**
     * Retorna uma representação textual do tratador.
     *
     * @return String contendo informações do tratador.
     */
    public String toString() {
        return "O tratador " + this.name + " de " + this.age + " anos possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.ID;
    }
}
