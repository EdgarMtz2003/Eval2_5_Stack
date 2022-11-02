/*
 * "
 * "
 */
package eval2_5_stack;

/**
 * @author 
 */
public class MyStack {

    private Nodo inicio;
    private Nodo fin;
    private Nodo previo;
    private int cont;

    //Por default, la lista está vacía
    public MyStack() {
        this.inicio = null; //No hay nodos en la lista
        this.fin = null;
        this.previo = null;
        cont = 0;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACÍA");
        } else {
            Nodo temp = inicio;
            //¿Cómo muevo a temp?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getsiguiente();
            }
            System.out.println("");
        }
    }

    public int tamaLista() {
        return this.cont;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //Verificar si hay nodo sen la lista
        if (inicio == null) { //No hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nods en la lista
            //Hay que movernos por la lista Usando un nodo temporal hasta el último nodo de la lista
            
            fin.setsiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public void puch(int valor){
        agregar(valor);
    }
    
    public Integer peek(){
        
        if(listaVacia()){
            return null;
        }else{
            return fin.getValor();
        }
    }
    
     public Integer pop() throws Exception{
        //verificar si la lista esta vacia
        //si no esta vacia, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            int valor = fin.getValor();
            //borrar la cima de la pila 
            borrarEn(tamaLista() - 1);
            return inicio.getValor();
        }
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        this.cont = 0;
    }

    public int obtenValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;
        //¿Qué debemos validar?
        //Insertar en una posición no válida
        if (pos < 0) { //Posiciónes negativas
            throw new Exception("No puede inserarse un nodo en una posición negativa");
        } else if (pos >= cantNodos) { //Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " No es una posición válida en la lista");
        } else {
            Nodo temp = inicio;
            int cont = 0;

            while (cont < pos) {
                temp = temp.getsiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }
    
    public void insertarEn (int valor, int pos) throws Exception{

         int cantNodos=tamaLista();
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         }else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos+" no es una posicion valida de la lista");
         }else{
             Nodo nuevoNodo = new Nodo(valor);
             if(pos == 0){ // insertar al inicio de la lista
                 nuevoNodo.setsiguiente(inicio);
                 inicio.setPrevio(nuevoNodo);
                 inicio = nuevoNodo;
             }else{
                   Nodo temp=inicio;
                   int cont =0;                   
                   while(cont < pos){
                       temp=temp.getsiguiente();
                       cont++;
              
                   }
                   //Y ahora??
                   nuevoNodo.setsiguiente(temp);
                   nuevoNodo.setPrevio(temp.getPrevio());
                   temp.getPrevio().setsiguiente(nuevoNodo);
                   temp.setPrevio(nuevoNodo);
                   

             }
             this.cont++;
             
         }
     }
    
    public void borrarEn(int pos) throws Exception{
            int cantNodos = tamaLista();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede borrarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            //Borrar primer nodo
            //Borrar el intermedio
            //Borrar el final
            if(pos == 0){ //Insertar al inicio de la lista
                inicio = inicio.getsiguiente();
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont <= pos){
                     temp = temp.getsiguiente();
                     cont++;
                }
                Nodo objSig = temp.getsiguiente();
                temp.setsiguiente(objSig.getsiguiente());
                //Hacer reconexión
                if (pos == (cantNodos - 1)) {//Reconectar fin
                        fin = temp;
               }
            }
        }
        this.cont--;
    }   
     
}

