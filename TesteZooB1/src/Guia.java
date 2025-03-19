public class Guia {
    private String name;
    private int age;
    private String identificationNumber;
    private int experience;

    public Guia(String name, int age, String identificationNumber, int experience) {
        this.name = name;
        this.age = age;
        this.identificationNumber = "G" + identificationNumber;
        this.experience = experience;
    }

    public String toString() {
        return "O Guia " + this.name + " de " + this.age + " anos de idade possuí " + this.experience + " anos de experiencia. Número de identificação: " + this.identificationNumber;
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

    public boolean equals(Guia guia) {
        return (guia != null) && (guia.getName() == getName()) && (guia.getAge() == getAge()) && (guia.experience == getExperience()) && (guia.getIdentificationNumber() == getIdentificationNumber());
    }
}
