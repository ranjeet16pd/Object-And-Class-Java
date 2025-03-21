public class Driver {
 public static void  main(String [] args){
     
     
     Car thar= new Car();
     
     System.out.println(thar.CurrentFuelInLite);
     
     
     thar.StartCar();
     thar.RefuelTheCar(5);
     thar.MoveCar();
     
     
 }
}
