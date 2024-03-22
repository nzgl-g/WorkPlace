package Composition;

public class Engine {
	private String EngineName;
	private double EngineCapacity;
	private int HorsePower;
	public String getEngineName() {
		return EngineName;
	}
	public void setEngineName(String engineName) {
		this.EngineName = engineName;
	}
	public double getEngineCapacity() {
		return EngineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.EngineCapacity = engineCapacity;
	}
	public int getHorsePower() {
		return HorsePower;
	}
	public void setHorsePower(int horsePower) {
		HorsePower = horsePower;
	}
	public Engine(String engineName, double engineCapacity, int horsePower) {
		super();
		EngineName = engineName;
		EngineCapacity = engineCapacity;
		HorsePower = horsePower;
	}
	public Engine(String engineName, double engineCapacity) {
		super();
		EngineName = engineName;
		EngineCapacity = engineCapacity;
	}
	public Engine(String engineName) {
		super();
		EngineName = engineName;
	}
	public Engine() {
		super();
	}


}
