package pilha;

public class NoChar extends No{
    private char dado;
    
    public NoChar(char dado) {
        this.dado = dado;
    }

    public char getDado() {
        return dado;
    }

    public void setDado(char dado) {
        this.dado = dado;
    }
    
    @Override
    public void displayNo() {
        System.out.println(dado);
    }   
}
