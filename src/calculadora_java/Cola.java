/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

/**
 *
 * @author Esneidy
 */
public class Cola <T>{
   private Listas<T> lista = new Listas<T>();
    
   public Listas<T> getLista() {
        return lista;
    }

    public void setLista(Listas<T> lista) {
        this.lista = lista;
    }
    
   public void push(T valor){
       lista.InsertarAlInicio(valor);       
   }
   
   
   public T pop() {
        return lista.ObtenerUltimoDato();
   }
   public T peek() {
       return lista.ObtenerPrimerDatoSinEliminar();
 
   }
   public boolean vacio(){
        return lista.getInicio()==null;
    }
    public String toString(){
        String result = "";
            Nodo<T> i = lista.invertir().getInicio();
            while (i != null) {
                result +=i.getValor().toString();
                i = i.getLiga();
        }
            return result;
    }

   
    
}
