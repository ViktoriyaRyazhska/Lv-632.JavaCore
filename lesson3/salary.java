package lesson2;

public class salary {
	
	public static void main (String[] args) {
		
		person p = new person();
		p.setName("Ivan");
		p.setRate(440);
		p.setHour(5);
		p.changeRate(350);
		p.getSalary();
		p.getBonuses();
		System.out.println();
       
        
		person p2 = new person();
		p2.setName("Viktor");
		p2.setRate(350);
		p2.setHour(8);
		p2.changeRate(350);
		p2.getSalary();
		p2.getBonuses();
		System.out.println();
		
		person p3 = new person();
		p3.setName("Oleg");
		p3.setRate(380);
		p3.setHour(9);
		p3.changeRate(350);
		p3.getSalary();
		p3.getBonuses();
		System.out.println("Total salary is "+person.getTotalSum());
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}


