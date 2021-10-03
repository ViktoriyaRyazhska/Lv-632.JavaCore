public class FlyingBird extends Bird {
     private int flightAltitude;    //altitude flight display in meters

    public FlyingBird(int layEggs, String feathers) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

     void setFlightAltitude(int altitude){      //use setter for example
         this.flightAltitude=altitude;
     }

    @Override
    public void fly() {
        System.out.println("This bird can fly\n");
    }

    @Override
    public String toString() {
        return "Color of feathers: "+ feathers +" | Lay Eggs "+ layEggs +" times per year | Flight altitude is "+flightAltitude+" meters" ;
    }
}

