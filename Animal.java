
package reto3;


public class Animal {
    //atributos
    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos[] = new Alimento[3];
    
    //constructor

    //public Animal(double peso, double altura){
      //  this.peso = peso;
        //this.altura = altura;
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimentos() {
        return alimsIngeridos;
    }

    public void setAlimentos(Alimento[] alimentos) {
        this.alimsIngeridos = alimentos;
    }

    
    public double getIMC(){
        double IMC;
        IMC = (double)(peso/(altura*altura));
        return IMC ;
    }

   
    
}
