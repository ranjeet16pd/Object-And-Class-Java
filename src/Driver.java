public class Driver {
    
    public  static int minAgeForDriving=17;
    
 public static void  main(String [] args){
     
     
     Car thar= new Car();
     
     System.out.println(Car.getLyfOfCar());
     
     System.out.println(minAgeForDriving);
     
     System.out.println(thar.CurrentFuelInLite);


     thar.StartCar();
     thar.RefuelTheCar(5);
     thar.MoveCar();
     
     
 }
}
