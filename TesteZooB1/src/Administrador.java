public class Administrador {
    private String name;
    private int age;
    private String identificationNumber;
    private int experience;

    public Administrador(String name, int age, String identificationNumber, int experience) {
        this.name = name;
        this.age = age;
        this.identificationNumber = "A" + identificationNumber;
        this.experience = experience;
    }

    public String toString() {
        return "O administrador " + this.name + " de " + this.age + " anos de idade possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.identificationNumber;
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

    public boolean equals(Administrador administrador) {
        return (administrador != null) && (administrador.getName() == getName()) && (administrador.getAge() == getAge()) && (administrador.experience == getExperience()) && (administrador.getIdentificationNumber() == getIdentificationNumber());
    }
}
