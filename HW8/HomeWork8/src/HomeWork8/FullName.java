package HomeWork8;

public class FullName {
		private String firstName;	//Develop a FullName class with the firstName and lastName fields of type String
		
		private String lastName;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public FullName () {} 
		
		public FullName (String firstName,String lastName) {
			this.firstName=firstName;
			this.lastName=lastName;
		} 
		
		@Override
		public String toString() {
			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
}