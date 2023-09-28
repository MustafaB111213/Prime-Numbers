
public class PrimeCounter {

	public static void main(String[] args) {

		PrimeCounter primeCounter = new PrimeCounter();
		

		System.out.println(primeCounter.isPrime(17));
		System.out.println(primeCounter.primeNumberFromOneTo(30));
		
	}
	boolean isPrime(int number) {
		boolean isPrime = false;
		if (number>0) {
			if (number!=2) {
				for (int index = 2; index < Math.sqrt(number)+1 ; index++) {
					if (number%index==0) {
						isPrime = false;
						break;
					}
					else {
						isPrime = true;
					}
				}
			}
			else {
				isPrime=true;
			}
		}
		return isPrime;
	}
	
	int primeNumberFromOneTo(int number) {
		int primeCounter = 0;
		
		for (int i = 0; i < number; i++) {
			if (isPrime(i)) {
				primeCounter++;
			}
				
		}
		
		return primeCounter;
	}

}
