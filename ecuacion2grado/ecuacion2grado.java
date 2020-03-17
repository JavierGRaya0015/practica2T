/*
 * Autor del Programa: Javier Gonzalez Raya
 * Curso: 1 DAW Profesor: Javi Castillo
 * Fecha Inicio: 13/03/2020 Fecha Fin: ??/??/????
 * Nota : 0-10/10 Derecho de Autor: Activado
 * Asignatura: Entornos de Desarrollos
 */
package ecuacion2grado;
import java.util.Scanner;
public class ecuacion2grado {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double aux1;
    private double aux2;
    private double aux3;
    public ecuacion2grado() {
        
        this.a=1;
        this.b=-5;
        this.c=6;
        this.aux1=0;
        this.aux2=0;
        this.aux3=0;
        this.x1=1;
        this.x2=1;
    }
    public void getcoeficienteA(){
        //Scanner teclado = new Scanner(System.in);
        double coeficienteA=0;
        this.a=coeficienteA=1;
        /*System.out.print("Escribe el coeficiente de a: ");
        coeficienteA = teclado.nextDouble();*/
    }
    public void getcoeficienteB(){
      //  Scanner teclado = new Scanner(System.in);
        double coeficienteB;
        this.b=coeficienteB=-5;
       // System.out.print("Escribe el coeficiente de b: ");
       // coeficienteB = teclado.nextDouble();
    }
    public void getcoeficienteC(){
       // Scanner teclado = new Scanner(System.in);
        double coeficienteC;
        this.c=coeficienteC=6;
       // System.out.print("Escribe el coeficiente de c: ");
       // coeficienteC = teclado.nextDouble();
    }
    public void getDiscriminante(){
        double aux3;
        System.out.print("Este es el Discriminantes: ");
        System.out.println(this.aux3=2*this.a);
    }
    public void x1calculoRaices(){
        this.aux1=-this.b+(int)Math.sqrt(this.b*this.b-4*this.a*this.c);
        if(aux1>0){
            System.out.print("Este es el Calculo Raices X1: ");
            System.out.println((this.aux1=-this.b+(int)Math.sqrt(this.b*this.b-4*this.a*this.c)));
        }else{
            System.out.println("Esta ecuacion tiene una raiz negativa por lo que no hay solucion real");
            System.exit(1); 
        }
    }
    public void x2calculoRaices(){
        System.out.print("Este es el Calculo Raices X2: ");
        System.out.println((this.aux2=-this.b-(int)Math.sqrt(this.b*this.b-4*this.a*this.c)));
    }
    public void x1calculaSolucion(){
        System.out.print("Solucion X1: ");
        System.out.println((this.x1=-this.b+(int)Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a));
    }
    public void x2calculaSolucion(){
        System.out.print("Solucion X2: ");
        System.out.println((this.x2=-this.b-(int)Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a));
    }
}