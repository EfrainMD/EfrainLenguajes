/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author T-107
 */
public class EcuacionCuadratica {
    float a;
    float b;
    float c;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    float discriminante(){
        
        float disc=(float)(Math.pow(b, 2)-4*a*c);
        return disc;
    }
    
    public String raiz1(){
        String raiz1="";
        if(discriminante()<0)raiz1="imaginaria";
        else{
             float r1=   (float) ((-b+ Math.sqrt(discriminante()))/2*a);
             raiz1="x1:"+r1;
            }
       return raiz1;
    }
    
     public String raiz2(){
     String raiz2="";
        if(discriminante()<0)raiz2="imaginaria";
        else{
             float r2=   (float) ((-b- Math.sqrt(discriminante()))/2*a);
             raiz2="x1:"+r2;
            }
       return raiz2;   
    }
}
