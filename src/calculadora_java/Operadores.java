/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_java;

/**
 *
 * @author Esneidy
 */
public class Operadores {
    public Operadores(){
    String operador="";
    int prioridad=0;
    if(operador=="("){
        prioridad=0;
    }else
        if(operador==")"){
            prioridad=0;
        }else
            if(operador=="^"){
                prioridad=-1;
            }else
                if(operador=="*"){
                    prioridad=-2;
                }else
                    if(operador=="/"){
                        prioridad=-2;
                    }else
                        if(operador=="+"){
                            prioridad=-3;
                        }else
                            if(operador=="-"){
                                prioridad=-3;
                            }
    
        
    }

}
