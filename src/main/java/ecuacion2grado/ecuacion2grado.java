/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion2grado;
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
        this.a=0;
        this.b=0;
        this.c=0;
        this.aux1=0;
        this.aux2=0;
        this.aux3=0;
        this.x1=0;
        this.x2=0;
    }
    public double getcoeficienteA(double coeficienteA){
        return this.a=coeficienteA;
    }
    public double getcoeficienteB(double coeficienteB){
        return this.b=coeficienteB;
    }
    public double getcoeficienteC(double coeficienteC){
        return this.c=coeficienteC;
    }
    public double getDiscriminante(){
         return aux3=2*a;
    }
    public double x1calculoRaices(){
        return aux1=-b+(int)Math.sqrt(b*b-4*a*c);
    }
    public double x2calculoRaices(){
        return aux2=-b-(int)Math.sqrt(b*b-4*a*c);
    }
    public double x1calculaSolucion(){
        return x1=aux1/aux3;
    }
    public double x2calculaSolucion(){
        return x2=aux2/aux3;
    }
}
