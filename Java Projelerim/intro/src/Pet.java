
public class Pet {

	private String name;
	private int age;
	private String location;
	
	public void setName(String name1){
		name = name1;
	}
	public void setAge(int age1) {
		age = age1;
	}
	public void setLocation(String location1) {
		location = location1;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getLocation() {
		return location;
	}
	public String getCompleteInfo() {
		return "Name : " + name + "\n"+ "Age: " + age + "\n" + "Location:"+ location;
	}

}
