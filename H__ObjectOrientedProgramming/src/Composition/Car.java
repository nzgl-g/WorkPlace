package Composition;

public class Car {
	private String CarModel;
	private int CarSpeed;
	private Engine CarEngine;//this is a composition
	private boolean HatchBack;
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public int getCarSpeed() {
		return CarSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		CarSpeed = carSpeed;
	}
	public Engine getCarEngine() {
		return CarEngine;
	}
	public void setCarEngine(Engine carEngine) {
		CarEngine = carEngine;
	}
	public boolean isHatchBack() {
		return HatchBack;
	}
	public void setHatchBack(boolean hatchBack) {
		HatchBack = hatchBack;
	}
	public Car(Engine carEngine) {
		super();
		CarEngine = carEngine;
	}


}
