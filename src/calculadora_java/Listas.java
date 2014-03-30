/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

/**
 *
 * @author Esneidy
 */
public class Listas <T>{
    private Nodo <T> inicio;

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    public String PreparandoLista(){
        String result="";
        if(getInicio()==null){
            return "Vacio";
        }
        else{
            Nodo <T> i=inicio;
            do{
                result+=i.getValor().toString()+"= >";
                i=i.getLiga();
            }while(i!=null);
        }
        return result +"nul";
       
    }
    public String toString(){
        String result=" { ";
        if(getInicio()==null){
            return "Vacio";
        }
        else{
            Nodo <T>i=inicio;
            do{
                result+=i.getValor().toString()+",";
                i=i.getLiga();
            }while(i!=null);
        }
        return result.substring(0, result.length() - 1) + "}";
    }
    
    public void InsertarAlInicio(T valor){
        Nodo<T> nodo=new Nodo<>(valor);
        nodo.setLiga(inicio);
        inicio=nodo;
    }
    public void InsertaAlFinal(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);
        Nodo<T> i = inicio;
        if (inicio == null) {
            inicio = nodo;
        } 
        else {
            do{
                i=i.getLiga();
            }while(i.getLiga()!=null);
            i.setLiga(nodo);
        }
    }
    public void insertaAntesDato(T dato, T datoInicial) {
        if (inicio == null) {
           System.out.println("La lista está vacía");
        }
        Nodo<T> nodoActual = inicio;
        Nodo<T> nodoAnterior = null;
        boolean bandera = false;
        do{
            if (nodoActual.getLiga() != null) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getLiga();
            } 
            else {
                bandera = true;
            }
        }while (!nodoActual.getValor().equals(datoInicial) && !bandera);
        if (!bandera) {
            Nodo<T> nodo = new Nodo<>(dato);
            if (nodoActual == inicio) { 
                nodo.setLiga(inicio);
                inicio = nodo;
            } 
            else {
                nodoAnterior.setLiga(nodo);
                nodo.setLiga(nodoActual);
            }

        } 
       
    }

    
    public void InsertaDespuesDeValor(T valor, T valorInicio) {
        if (inicio == null) {
              System.out.println("La lista está vacía");
        
        }
        Nodo<T> nodoActual = inicio;
        boolean bandera = false;
        do{
            if (nodoActual.getLiga() != null) {
                nodoActual = nodoActual.getLiga();
            } 
            else {
                bandera = true;
            }
        }while (!nodoActual.getValor().equals(valorInicio) && !bandera);
        if (!bandera) {
            Nodo<T> nodo = new Nodo<>(valor);
            nodo.setLiga(nodoActual.getLiga());
            nodoActual.setLiga(nodo);
        } 
       
    }

 
    public void BorrarPrimerDato() {
        if (inicio != null) {
            inicio = inicio.getLiga();
        }
    }


    public T ObtenerPrimerDato()  {
        T dato =null;
        if (inicio != null) {
            dato = inicio.getValor();
            inicio = inicio.getLiga();
        }
        else {
            System.out.println("Lista Vacía");
        }
        return dato;
    }
    
    public T ObtenerPrimerDatoSinEliminar()  {
        T dato =null;
        if (inicio != null) {
            dato = inicio.getValor();
            
        }
        else {
           System.out.println("Lista Vacía");
        }
        return dato;
    }
    public void BorrarUltimoDato() {
        Nodo<T> i = inicio;
        Nodo<T> nodoAnterior = null;
        if (inicio.getLiga() == null) {
            inicio = null;
        } 
        else {
            do{
                nodoAnterior = i;
                i = i.getLiga();
            }while (i.getLiga() != null);
            nodoAnterior.setLiga(null);
        }
    }
    public T ObtenerUltimoDato() {
        Nodo<T> i= inicio;
        Nodo<T> nodoAnterior = null;
        T result = null;
        if (inicio.getLiga() == null) {
            result = inicio.getValor();
            inicio = null;
        } 
        else {
            do{
                nodoAnterior = i;
                i = i.getLiga();
            }while (i.getLiga() != null);
            result = i.getValor();
            nodoAnterior.setLiga(null);           
        }
        return result;
    }
    public T obtenUltimoElementoSinEliminar() {
        Nodo<T> i= inicio;
        Nodo<T> nodoAnterior = null;
        T result = null;
        if (inicio.getLiga() == null) {
            result = inicio.getValor();
        } 
        else {
            do{
                nodoAnterior = i;
                i = i.getLiga();
            }while (i.getLiga() != null);
            result = i.getValor();
        }
        return result;
    }
     public void limpiar() {
        inicio = null;
    }
    
    
    public Listas<T> invertir(){
        Listas<T> result = new Listas<>();
        Nodo<T> i= inicio;
        while (i != null){
            result.InsertarAlInicio(i.getValor());
            i = i.getLiga();
        }
        return result;
    }
}
