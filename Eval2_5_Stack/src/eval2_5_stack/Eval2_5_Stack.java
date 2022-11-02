/*
add -> push -> agrego un elemento en la cima
peek -> lee el elemento en la cima
pop -> lee i borra el elemento de la cima
 */
package eval2_5_stack;

/**
 *
 * @author moviles
 */
public class Eval2_5_Stack {


    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        myStack.puch(10);
        myStack.puch(20);
        myStack.puch(30);
        myStack.puch(40);
        myStack.puch(50);
        myStack.imprimir();
        System.out.println("Cima de la pila: "+myStack.peek());
        myStack.imprimir();
        try{
        System.out.println("Primer valor en llegar es: "+myStack.pop());
        myStack.imprimir();
        }catch(Exception ex){
                            
        }
        myStack.imprimir();
    }

    
    
}
