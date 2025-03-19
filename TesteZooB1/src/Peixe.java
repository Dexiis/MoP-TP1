public class Peixe {
    private int quantidade;

    public Peixe(int quantidade) {
        this.quantidade = quantidade;
    }
    public String toString() {
        return this.quantidade + " de peixe.";
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public boolean equals(Peixe peixe) {
        return (peixe != null) && (peixe.getQuantidade() == getQuantidade());
    }
}
