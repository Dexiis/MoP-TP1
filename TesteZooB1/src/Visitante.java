public class Visitante {
    private String name;
    private int age;
    private String ticketNumber;

    public Visitante(String name, int age, String ticketNumber) {
        this.name = name;
        this.age = age;
        this.ticketNumber = "V" + ticketNumber;
    }

    public String toString() {
        return "O(A) visitante " + this.name + " de " + this.age + " anos de idade que possuí o bilhete número " + this.ticketNumber + " está hoje a visitar o Zoológico.";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTicketNumber() {
        return this.ticketNumber;
    }
    public boolean equals(Visitante visitante) {
        return (visitante != null) && (visitante.getName() == getName()) && (visitante.getAge() == getAge()) && (visitante.getTicketNumber() == getTicketNumber());
    }
}
