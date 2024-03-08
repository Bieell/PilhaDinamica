package pilha;

public class ParentesesEColchetes {
    private PilhaDin pilha;
    
    public ParentesesEColchetes(PilhaDin pilha) {
        this.pilha = pilha;
    }
    
    public boolean isOrdemCorreta() {
        boolean isValid = true;
        PilhaDin pilhaCache = new PilhaDin();
        int counter = 0;
        while(!pilha.isEmpty() && isValid) {
            No no = pilha.pop();
            if(!pilha.getTypeOfNo(no).equals("char")) {
                isValid = false;
                break;
            }
            NoChar noChar = (NoChar) no;
            char value = noChar.getDado();
            isValid = isStartAndEndValid(pilha, pilhaCache, value);
            if(!isValid) break;
            
            switch (value) {
                case '(':
                    isValid = pilhaCache.getTopoCharValue() == value;
                    if(isValid) pilhaCache.pop();
                    break;
                case '[':
                    isValid = pilhaCache.getTopoCharValue() == value;
                    if(isValid) pilhaCache.pop();
                    break;
                case ')':
                    pilhaCache.push('(');
                    break;
                case ']':
                    pilhaCache.push('[');
                    break;
                default:
                    break;
            }
        }
        return isValid;
    }
    
    private boolean isStartAndEndValid(PilhaDin pilha, PilhaDin pilhaCache, char value) {
        return !(pilha.isEmpty() && (value == ')' || value == ']')) && !(pilhaCache.isEmpty() && (value == '(' || value == '['));
    }
}
