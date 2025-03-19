public class Tratador {
    private String name;
    private int age;
    private String identificationNumber;
    private int experience;

    public Tratador(String name, int age, String identificationNumber, int experience) {
        this.name = name;
        this.age = age;
        this.identificationNumber = "T" + identificationNumber;
        this.experience = experience;
    }

    public String toString() {
        return "O tratador " + this.name + " de " + this.age + " anos de idade possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.identificationNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean equals(Tratador tratador) {
        return (tratador != null) && (tratador.getName() == getName()) && (tratador.getAge() == getAge()) && (tratador.experience == getExperience()) && (tratador.getIdentificationNumber() == getIdentificationNumber());
    }
}
