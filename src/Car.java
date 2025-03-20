public class Car {
    
    
    int NoOfTyres;
    int  NoOfWheel;
    float FuelLevelInLiter;
    String Colour;
    float MaxSpeed;
    float MinSpeed;
    float CurrentFuelInLite ;
    int NoOfSeats;
    
    
    public int getNoOfTyres(){
        return NoOfTyres;
    }
    
    public  void setNoOfTyres(int NoOfTyres){
        this.NoOfTyres=NoOfTyres;
    }
    
    public int getNoOfWheel(){
        return NoOfWheel;
    }
    
    public  void  setNoOfWheel(int NoOfWheel){
        this.NoOfWheel=NoOfWheel;
    }
    
    public  float getFuelLevelInLiter(){
        return FuelLevelInLiter;
    }
    
    public void  setFuelLevelInLiter(float fuel){
        this.FuelLevelInLiter+=fuel;
    }
    
    public int getNoOfSeats() {
        return NoOfSeats;
    }
    
    public void setNoOfSeats(int seats){
        NoOfSeats=seats;
    }
    
    public String getColour(){
        return Colour;
    }
    
    public  void setColour(String Colour){
        this.Colour=Colour;
    }
    
    public  void setMaxSpeed(float maxSpeed){
        this.MaxSpeed=maxSpeed;
    }
    public float getMaxSpeed() {
        return MaxSpeed;
    }
    
    public  void  setMinSpeed(float minSpeed){
        this.MinSpeed=minSpeed;
    }
    
    
    public float getCurrentFuelInLite() {
        return CurrentFuelInLite;
    }
    
    public void setCurrentFuelInLite(float fuel){
        this.CurrentFuelInLite+=fuel;
    }
    
    
}