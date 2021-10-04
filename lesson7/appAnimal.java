package lesson7;

public class appAnimal {

	public static void main(String[] args) {
	
		
		Animal [] an=new Animal[4];
		an[0]= new Cat("Leopold");
		an[1]=new Dog("Barsik");
		an[2]=new Cat("Garfild");
		an[3]=new Dog("Rex");
		
		for( Animal a:an) {
			a.voice();
			a.feed();
		}
			
	}

}
