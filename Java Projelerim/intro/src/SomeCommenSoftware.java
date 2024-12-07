
public class SomeCommenSoftware {

	private double length;
	private double width;
    
	public void setLenght(double len) {
		length = len;
	}
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
	
}
public class RectangleDriver1{
	public static void main(String[] args){
	
	Rectangle livingRoom = new Rectangle();
	
	livingRoom.setLenght(10.0);
	livingRoom.setWidth(15.0);
	
	System.out.println(livingRoom.getLenght());
	System.out.println(livingRoom.getLWidth());
	System.out.println(livingRoom.getArea());
	
      }
}	