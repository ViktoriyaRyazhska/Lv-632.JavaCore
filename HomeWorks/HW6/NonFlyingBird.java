public class NonFlyingBird extends Bird {

    public NonFlyingBird (int layEggs, String feathers){
        this.layEggs=layEggs;
        this.feathers=feathers;
    }

    @Override
    public void fly() {
        System.out.println("This bird can't fly\n");
    }

    @Override
    public String toString() {
        return "Color of feathers: "+ feathers +" | Lay Eggs "+ layEggs +" times per year";
    }
}
