
package reto3;


public class Gorila extends Animal {
       
    public Gorila(double peso, double altura) {
        
        this.peso = peso;
        this.altura = altura;
    }
  
    public void getAlimsIngeridos(Alimento[] alimentos) {
        this.alimsIngeridos = alimentos;
    }
        
    public double getPesoAlims() {
        double suma=0.0;
        for (int i = 0; i < this.alimsIngeridos.length; i++) {
            suma+=this.alimsIngeridos[i].getGramos();
        }
        return suma;
   
    }
     
    public double getIMC(){
        double IMC;
        IMC = (double)(peso/(altura*altura));
        return IMC ;
    }
    
    
}
