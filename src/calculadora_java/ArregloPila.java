/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;
import java.lang.reflect.Array;
/**
 *
 * @author Esneidy
 */
public class ArregloPila <T>{
    T [] pila;
    int alcanze = 10;
    int  top= -1;

    public ArregloPila() {
        pila = (T[]) new Object[alcanze];
    }
    
    public ArregloPila(int alcanzes) {
        this.alcanze = alcanzes;
        pila = (T[]) new Object[alcanze];
    }
    
    public void push(T valor) throws Exception{
        if (top+1 == alcanze){
            throw new Exception("Pila Completa");
        }else {
            pila[++top] = valor;

        }
    }
    
    public T pop() throws Exception{
        if (top == -1){
            throw new Exception("Pila Vacia");
        }else {
            return pila[top--];
        }
    }
}
