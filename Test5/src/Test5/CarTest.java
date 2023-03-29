package Test5;

public class CarTest {
	public static void main(String args[]) {
		Engine eng[] = new Engine[2];

		eng[0] = new Engine("Diesel Type", 368613.8f);
		eng[1] = new Engine("LPG Type", 458813.8f);

		Machine mch[] = new Machine[2];

		mch[0] = new Machine("Ignition", eng[0]);
		mch[1] = new Machine("Electric", eng[1]);

		Car cr[] = new Car[3];

		cr[0] = new Car(783, mch[0]);
		cr[1] = new Car(867, mch[1]);

		System.out.println(cr[0]);
		System.out.println(cr[1]);

	}
}
