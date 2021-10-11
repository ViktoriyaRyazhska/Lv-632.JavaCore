package lesson006f;

public class Appl {

	public static void main(String[] args) {

		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("big feathers", "matte-white", 180, "Falconiformes");
		birds[1] = new Swallow("small feathers", "white with gray spots", 34, "Hirundinidaes");
		birds[2] = new Penguin("thick feathers", "white", 25, "Sphenisciformes");
		birds[3] = new Chicken("ordinary feathers", "white", 6, "Galliformes");
		
        for (Bird bird : birds) {
            bird.fly();
        }
	}

}
