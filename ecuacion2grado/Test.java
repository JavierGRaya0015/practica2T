/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion2grado;

/**
 *
 * @author javie
 */
public class Test {
     public static void main(String args[]) {
        /*Consumo c1, c2;
        //c1.kms=5;

        c2=new Consumo(255,35,130,1.2);
        c1=c2;
        c1.setKms(375);
        c2.setPgas(1.0);*/
        /*Complejo c1=new Complejo(1,2);
        Complejo c2=new Complejo(3,4);*/
       /* VectorTridimensional c1=new VectorTridimensional(1,2);
        VectorTridimensional c2=new VectorTridimensional(3,4);
        //Complejo c3=c1.suma(c2);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());*/
        /*Automoviles a=new Automoviles(1.5,1.75,2.42,2.6);*/
        ecuacion2grado b1=new ecuacion2grado();
        ecuacion2grado b2=new ecuacion2grado();
        ecuacion2grado b3=new ecuacion2grado();
        ecuacion2grado b4=new ecuacion2grado();
        ecuacion2grado b5=new ecuacion2grado();
        ecuacion2grado b6=new ecuacion2grado();
        ecuacion2grado x1=new ecuacion2grado();
        ecuacion2grado x2=new ecuacion2grado();
        
        b1.getcoeficienteA();
        b2.getcoeficienteB();
        b3.getcoeficienteC();
        b4.getDiscriminante();
        b5.x1calculoRaices();
        b6.x2calculoRaices();
        x1.x1calculaSolucion();
        x2.x2calculaSolucion();
    }
}
