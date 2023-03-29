package AbstractClass;

abstract class Bank 
{
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	@Override
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

