public class Eagle extends FlyingBird {

    public Eagle( String feathers, int layEggs, int altitude) {
        super(layEggs, feathers);
        setFlightAltitude(altitude);
    }
}
