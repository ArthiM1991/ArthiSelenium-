public class IsPrime {

	public static void main(String[] args) {
		int number = 11;
		boolean flag = true;

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}
