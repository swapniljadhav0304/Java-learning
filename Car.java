public class Car extends Vehical {

    //Car has an Engine

    Engine engine;




    // Car is a Vehicle
    public Car(int modelyear,String companyName,Engine engine)
    {
        super (modelyear, companyName);
        this.engine=engine;
    }
public void StartCar(){
    System.out.println("Car Starts");
}

    @Override
    public int calculatePrice() {
        return super.calculatePrice()+2000;
    }
}
