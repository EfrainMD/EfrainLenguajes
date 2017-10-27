/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    public ArrayList <Pregunta> /*Generico a pregunta*/ generar(){
        //Primero generamos cada opcion de la primer pregunta
        Opcion op11=new Opcion ("Moscu", false);
        Opcion op11=new Opcion ("Kiev", false);
        Opcion op11=new Opcion ("Helsinki", true);
        Opcion op11=new Opcion ("Turin", false);
        
        Pregunta p1=new Pregunta("Capital de Finlandia", opciones1);
        preguntas.add(p1);
        //Fin de la primer pregunta
        return preguntas;
    }
        
    
    
}
