package test240719.object3;

public class Cargoplane extends Plane {
	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - (50 * distance / 10));
	}

}
