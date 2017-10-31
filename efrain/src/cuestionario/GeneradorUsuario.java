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
public class GeneradorUsuario {
    public static void main (String[] args){
        
        //Vamos a generar 5 usuarios
    Usuario u1=new Usuario();
    u1.setEdad(23);
    u1.setEmail("usuario1@gmail.com");
    u1.setNombre("Efrain");
    
    Usuario u2=new Usuario();
    u2.setEdad(22);
    u2.setEmail("usuario2@gmail.com");
    u2.setNombre("Javier");
    
    Usuario u3=new Usuario();
    u3.setEdad(23);
    u3.setEmail("usuario3@gmail.com");
    u3.setNombre("Laura");
    
    Usuario u4=new Usuario();
    u4.setEdad(23);
    u4.setEmail("usuario3@gmail.com");
    u4.setNombre("Anel");
    
    Usuario u5=new Usuario();
    u5.setEdad(23);
    u5.setEmail("usuario3@gmail.com");
    u5.setNombre("Alan");
    
    //Generamos un arreglo mutable
    ArrayList<Usuario> usuarios=new ArrayList<Usuarios>();
    usuario.add(u1);
    usuario.add(u2);
    usuario.add(u3);
    usuario.add(u4);
    usuario.add(u5);
    
    //Vamos a iterarlo para ver los nombres
    for (Usuario u: usuarios) {
        System.out.println("Nombre "+u.getNombre()+" email "+u.getEmail());
    }
    }
    
}
