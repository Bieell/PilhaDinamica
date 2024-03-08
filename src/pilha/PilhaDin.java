package pilha;

import java.io.CharConversionException;

public class PilhaDin {
    private No topo;
    
    public PilhaDin() {
        topo = null;
    }
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    public void push(int dado) {
        NoInt no = new NoInt(dado);
        no.setNext(topo);
        topo = no;
    }
    
    public void push(char dado) {
        NoChar no = new NoChar(dado);
        no.setNext(topo);
        topo = no;
    }
    
    public No pop() throws NullPointerException {
        No temp = topo;
        topo = topo.getNext();
        return temp;
    }
    
    public String getTypeOfNo(No no) {
        return no instanceof NoChar ? "char" : "int";
    }
    
    public int getIntPopValue(No no) throws NumberFormatException{
        NoInt noInt = (NoInt) no;
        return noInt.getDado();
    }
    
    public char getCharPopValue(No no) throws CharConversionException {
        NoChar noChar = (NoChar) no;
        return noChar.getDado();
    }
    
    public void display() {
        if(isEmpty()) {
            System.out.println("Pilha Vazia.");
            return;
        }
        No atual = topo;
        while(atual != null) {
            atual.displayNo();
            atual = atual.getNext();
        }
    }

    public No getTopo() {
        return topo;
    }
    
    public int getTopoIntValue() {
        NoInt noInt = (NoInt) topo;
        return noInt.getDado();
    }
    
    public int getTopoCharValue() {
        NoChar noChar = (NoChar) topo;
        return noChar.getDado();
    }
}
