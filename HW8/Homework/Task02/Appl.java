package lesson008g;

public class Appl {
	  public static void main(String[] args) {
			Wrapper<Integer> iObj = new Wrapper<>(31);
			Wrapper<String> sObj = new Wrapper<>("Stop the World, I Want to Get Off");
			Wrapper<Boolean> bObj = new Wrapper<>(true);

			System.out.println(iObj.getValue());
			System.out.println(sObj.getValue());
			System.out.println(bObj.getValue());
	  }

}