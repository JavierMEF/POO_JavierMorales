package Herencia2;

public class Principal {

  public static void main(String[] args) {
   Carnivoros c1= new Carnivoros("mamifero", "feed back", "sexual", "pluricelulares", "carnivoro", "terrestre", "hipercarnivoro");
   c1.mostrarDatos();
   Herbivoros h1 = new Herbivoros("mamifero", "feed back", "sexual", "pluricelulares", "herbivoro", "terrestre", 2, "pastores");
   h1.mostrarDatos();
    
           }
}
