


public class BaklaAbdullahLab1 {

	public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 20000.0, 100.0);

        // Car'ın hızını arttıralım
        myCar.accelerate();
        System.out.println("New velocity: " + myCar.getVelocity());

        // Car'ın hızını azaltalım
        myCar.brake();
        System.out.println("New velocity: " + myCar.getVelocity());
    }

		
		
		public class Car {
		    private String name;
		    private String model;
		    private double price;
		    private double velocity;

		    // Constructor
		    public Car(String name, String model, double price, double velocity) {
		        this.name = name;
		        this.model = model;
		        this.price = price;
		        this.velocity = velocity;
		    }

		    // Getter ve Setter metodları
		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public String getModel() {
		        return model;
		    }

		    public void setModel(String model) {
		        this.model = model;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public void setPrice(double price) {
		        this.price = price;
		    }

		    public double getVelocity() {
		        return velocity;
		    }

		    public void accelerate() {
		        velocity += 20;  // Örneğin, her hızlanmada 20 km/saat artırıyoruz
		    }

		    public void brake() {
		        velocity -= 20;  // Örneğin, her frenlemede 20 km/saat azaltıyoruz
		    }
		}
	
	}
	

