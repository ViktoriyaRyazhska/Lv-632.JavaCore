public class MainHW6 {
    public static void main(String[] args) {

        Bird[] birdsList = new Bird[4];
        birdsList[0] = new Eagle("Brown", 1,3000);
        birdsList[1] = new Swallow("Black/White", 1, 1000);
        birdsList[2] = new Penguin("Black/White", 1);
        birdsList[3] = new Chicken("Different", 300);

        for (Bird bird:birdsList){
            System.out.println(bird);
            bird.fly();
        }
    }
}
