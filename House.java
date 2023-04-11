// Brian, Burak, Sam 
// Period 2
public class House {
		private String familyName;
		private int kids;
		private String address;
		private String petNames;
		
		public House(String famName, int numberOfKids, String homeAddress, String myPetNames) {
			familyName = famName;
			kids = numberOfKids;
			address = homeAddress;
			petNames = myPetNames;
		}
		
		@Override
		public String toString( ) {
			return "FAMILY: " + familyName + " # of kids " + kids + " ADDRESS: " + address + 
					" DOG/CAT: " + petNames; 
		}
		
		public static void main (String [] args) {
			House one = new House("Shah", 3, "402 Oak Street", "Fluffy, Rex"); 
			House two = new House("Cao", 4, "404 Oak Street", "none"); 
			House three = new House("Bitner", 2, "398 Oak Street", "none"); 
			System.out.println(one);
			System.out.println(two);
			System.out.println(three);
		}
		
}
