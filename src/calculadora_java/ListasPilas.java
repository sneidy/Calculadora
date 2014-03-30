/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

/**
 *
 * @author Esneidy
 */
public class ListasPilas <T>{
    private Listas<T> lista = new Listas<T>();
   
   public void push(T valor){
       lista.InsertarAlInicio(valor);       
   }
   
   public T pop() {
       return lista.ObtenerPrimerDato();
   }
   
    public T peek() {
        return lista.ObtenerPrimerDatoSinEliminar();
   }
    
    public boolean vacia(){
        return lista.getInicio()==null;
    }
    

}
