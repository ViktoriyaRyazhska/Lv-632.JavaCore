package lesson3;


public class HW4_app {
	public static void main(String[] args) {

	dogs d1 = new dogs("Sam",9,breed.husky);
	dogs d2 = new dogs("Sam",7,breed.jack_russell);
	dogs d3 = new dogs("Sam",12,breed.poodle);
	
	if (d1.getName()==d2.getName()||d1.getName()==d3.getName()) {
		d1.changeName("Tom");}
	if (d2.getName()==d3.getName())
		d2.changeName("Lord");
	
	System.out.println(d1.toString());
	System.out.println(d2.toString());
	System.out.println(d3.toString());
	
	if(d1.getAge()>d2.getAge()&&d1.getAge()>d3.getAge())
		System.out.println(d1.getName()+ " "+d1.getBreed()+" is the older dog");
	else if(d2.getAge()>d1.getAge()&&d2.getAge()>d3.getAge())
	System.out.println(d2.getName()+ " "+d2.getBreed()+" is the older dog");
	else if(d3.getAge()>d1.getAge()&&d3.getAge()>d2.getAge())
		System.out.println(d3.getName()+ " "+d3.getBreed()+" is the older dog");
	}

	
//	switch (d1.getName()) {
//	case "Sam":
//	d1.changeBreed(breed.jack_russell);
//	break;
//	case "Tom":
//		d1.changeBreed(breed.poodle);
//		break;
//	case "Lord":
//		d1.changeBreed(breed.husky);
//		break;
//		default:
//		System.out.println("rename your 1st dog");	
//	}
//	
//	switch (d2.getName()) {
//	case "Sam":
//	d2.changeBreed(breed.jack_russell);
//	break;
//	case "Tom":
//		d2.changeBreed(breed.poodle);
//		break;
//	case "Lord":
//		d2.changeBreed(breed.husky);
//		break;
//		default:
//		System.out.println("rename your 2st dog");
//	}
//	
//	switch (d3.getName()) {
//	case "Sam":
//	d3.changeBreed(breed.jack_russell);
//	break;
//	case "Tom":
//		d3.changeBreed(breed.poodle);
//		break;
//	case "Lord":
//		d3.changeBreed(breed.husky);
//		break;
//		default:
//		System.out.println("rename your 3st dog");	
//	}
	


	
	
	
}
