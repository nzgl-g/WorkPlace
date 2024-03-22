package Composition;

public class Main {
	//composition is the relation between two objects called (HAS-A)
	public static void main (String[] args) {
		Engine engine1=new Engine("germany",7.8,700);
		Car car1 = new Car(engine1);
		car1.setCarEngine(engine1);//this is a Composition
		//engine1.setEngineName("germany");
		//engine1.setEngineCapacity(1.8);
		//engine1.setHorsePower(700);
		System.out.println(car1.getCarEngine().getEngineName()+car1.getCarEngine().getEngineCapacity());

	}
}
