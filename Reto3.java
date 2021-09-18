
package reto3;


public class Reto3 {


    public static void main(String[] args) {
       Alimento banana = new Alimento(80);
       Alimento raices = new Alimento(90);
       Alimento platano = new Alimento(59);
       Gorila gorila = new Gorila (150, 1.5); 
       
       Alimento[] alimentos = new Alimento[3];
       alimentos[0] = banana;
       alimentos[1] = raices;
       alimentos[2] = platano;
       gorila.getAlimsIngeridos(alimentos);
       
        System.out.println(gorila.getPeso());
        System.out.println(gorila.getPesoAlims());
        System.out.println(Math.round(gorila.getIMC()));
       
       //Animal animal1 = new Animal(120,1.6,alimentos);
        //System.out.println("IMC:"+animal1.getIMC());
        //System.out.println("Altura:"+animal1.getAltura());
        //System.out.println("Pesp:"+animal1.getPeso());
        //System.out.println("Gramos de zanahoria: "+animal1.getAlimsIngeridos()[1].getGramos());
        
    }
    
}
