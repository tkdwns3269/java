package test240719.object3;

public class PlaneTest {
	public static void main(String[] args) {
		Plane[] plane = new Plane[2];

		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40", 1000);

		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------");
		for (Plane p : plane) {
			System.out.println(p.getPlaneName() + "\t " + p.getFuelSize());
		}
		
		int distance = 100;
		System.out.println("100 운항");
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------");
		for (Plane p : plane) {
			p.flight(distance);
			System.out.println(p.getPlaneName() + "\t " + p.getFuelSize());
		}
		
		int fuel = 200;
		System.out.println("200 주유");
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------");
		for (Plane p : plane) {
			p.refuel(fuel);
			System.out.println(p.getPlaneName() + "\t " + p.getFuelSize());
		}
	}
}
