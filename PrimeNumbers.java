
public class PrimeNumbers {

	public static void main(String[] args) {
		primeNumbers(2369);
	}

	public static void primeNumbers(int a) {
		int c = 0;
		if(a % 2 == 0 && a != 2) {
			c = a / 2;
			System.out.println(a + "/2 =" + c);
			System.out.println(a + " is not a prime number.");
		}else if(a % 3 == 0 && a != 3) {
			c = a / 3;
			System.out.println(a + "/3 =" + c);
			System.out.println(a + " is not a prime number.");
		}else if(a % 5 == 0 && a != 5) {
			c = a / 5;
			System.out.println(a + "/5 =" + c);
			System.out.println(a + " is not a prime number.");
		}else if(a % 7 == 0 && a != 7) {
			c = a / 7;
			System.out.println(a + "/7 =" + c);
			System.out.println(a + " is not a prime number.");
		}
		else if(a % 11 == 0 && a != 11) {
			c = a / 11;
			System.out.println(a + "/11 =" + c);
			System.out.println(a + " is not a prime number.");
		}else {
			System.out.println(a + " is a prime number.");
		}
	}
}
