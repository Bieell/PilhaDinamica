package pilha;

public class NoInt extends No{
    private int dado;
    
    public NoInt(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    @Override
    public void displayNo() {
        System.out.println(dado);
    }    
}
