package task11;

public class Rectangle {
//	Fields
		    int a;
		    int b;
		    int area =0;
			
		 	public int getA() {
				return a;
			}
		
			public void setA(int a) {
				this.a = a;
			}
				
			public int getB() {
				return b;
			}
				
			public void setB(int b) {
				this.b = b;
			}
				
			
// construction		
			public Rectangle() {};
			
			public Rectangle(int a, int b) {
				this.a = a;
				this.b = b;
			}
			
		public void squareRectangle() throws MyException {
			if (a<0 | b<0) {
//					create and call exception
					throw new MyException ("Your number negative");
				}
						
				System.out.println("Your squareRectangle = " + area);
			}


			@Override
			public String toString() {
				return "Rectangle [a=" + a + ", b=" + b + ", area=" + a*b + "]";
			}
}