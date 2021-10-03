public class Swallow extends FlyingBird {

    public Swallow( String feathers, int layEggs, int altitude) {
        super(layEggs, feathers);
        setFlightAltitude(altitude);
    }
}
