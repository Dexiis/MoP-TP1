public class Girafa {
    private String name;
    private int age;
    private String peso;

    public Girafa(String name, int age, String peso) {
        this.name = name;
        this.age = age;
        this.peso = peso + "Kg";
    }

    public String toString() {
        return "A girafa " + this.name + " de " + this.age + " anos de idade pesa " + this.peso + ".";
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

    public boolean equals(Girafa girafa) {
        return (girafa != null) && (girafa.getName() == getName()) && (girafa.getAge() == getAge()) && (girafa.getPeso() == getPeso());
    }
}
