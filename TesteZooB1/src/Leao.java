public class Leao {
    private String name;
    private int age;
    private String peso;

    public Leao(String name, int age, String peso) {
        this.name = name;
        this.age = age;
        this.peso = peso + "Kg";
    }

    public String toString() {
        return "O leão " + this.name + " de " + this.age + " anos de idade pesa " + this.peso + ".";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPeso() {
        return this.peso;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPeso(int peso) {
        this.peso = peso + "Kg";
    }
    public boolean equals(Leao leao) {
        return (leao != null) && (leao.getName() == getName()) && (leao.getAge() == getAge())  && (leao.getPeso() == getPeso());
    }
}