package pilha;

public class TestePilhaDin {

    public static void main(String[] args) {
        PilhaDin pilha = new PilhaDin();
        pilha.push('(');
        pilha.push('(');
        pilha.push('(');
        
        pilha.push('a');
        
        pilha.push(')');
        pilha.push(')');
        pilha.push(')');
        
        ParentesesEColchetes teste = new ParentesesEColchetes(pilha);
        boolean isOrdemCorreta = teste.isOrdemCorreta();
        System.out.println(isOrdemCorreta);
    }
    
}
