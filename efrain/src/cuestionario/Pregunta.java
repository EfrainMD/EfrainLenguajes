/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author T-102
 */
 public class Pregunta {
     
     private String titulo;
     public Pregunta(String titulo, ArraysList<Opcion>opciones){
         this.titulo=titulo;
         this.opciones=opciones;
     }
    
    
    
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
