public class Carne {
    private int quantidade;

    public Carne(int quantidade) {
        this.quantidade = quantidade;
    }
    public String toString() {
        return this.quantidade + "Kg de carne.";
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public boolean equals(Carne carne) {
        return (carne != null) && (carne.getQuantidade() == getQuantidade());
    }
}
