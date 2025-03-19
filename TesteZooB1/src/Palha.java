public class Palha {
    private int quantidade;

    public Palha(int quantidade) {
        this.quantidade = quantidade;
    }
    public String toString() {
        return this.quantidade + "Kg de palha.";
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public boolean equals(Palha palha) {
        return (palha != null) && (palha.getQuantidade() == getQuantidade());
    }
}
