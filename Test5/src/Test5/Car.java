package Test5;

public class Car {
	private int modelNo;
	Machine machine;

	public Car(int modelNo, Machine machine) {
		super();
		this.modelNo = modelNo;
		this.machine = machine;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", machine=" + machine + "]";
	}

}
