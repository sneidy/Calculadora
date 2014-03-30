/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

/**
 *
 * @author Esneidy
 */
public class Nodo <T>{
    private T dato;
    private Nodo <T> liga;

    public T getValor() {
        return dato;
    }

    public void setValor(T valor) {
        this.dato = valor;
    }
    

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo <T> liga) {
        this.liga = liga;
    }
    Nodo(T valor){
        this.dato=valor;
        this.liga=null;
    }
}
