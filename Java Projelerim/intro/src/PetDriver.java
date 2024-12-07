
public class PetDriver {
	public static void main(String[] args) {
	
	Pet petWriter = new Pet();
	
	petWriter.setName("Latte");
	petWriter.setAge(3);
	petWriter.setLocation("Antalya");

	
	System.out.println(petWriter.getCompleteInfo());
	}
}