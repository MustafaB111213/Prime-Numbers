
public class PrimeCounter {

	public static void main(String[] args) {

		PrimeCounter primeCounter = new PrimeCounter();
		

		System.out.println(primeCounter.isPrime(13));
		System.out.println(primeCounter.primeNumberFromOneTo(30));
		
	}
	boolean isPrime(int n) {
		boolean isPrime = false;
		if (n>0) {
			if (n!=2) {
				for (int i = 2; i < Math.sqrt(n)+1 ; i++) {
					if (n%i==0) {
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
	
	int primeNumberFromOneTo(int n) {
		int primeCounter = 0;
		
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				primeCounter++;
			}
				
		}
		
		return primeCounter;
	}

}
