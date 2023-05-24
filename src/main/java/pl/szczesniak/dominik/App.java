package pl.szczesniak.dominik;

public class App {


	public static int ArrayChallenge(int[] arr) {
		int result = 0;
		for (int variable : arr) {
			result += variable;
		}

		for (int i = 0; i < 1000; i++) {
			if (fibonacci(result + i)) {
				return i;
			}
		}

		return arr[0];
	}

	public static boolean fibonacci(int number) {
		int previousNumber = 0;
		int currentNumber = 1;
		while (currentNumber < number) {
			int index = currentNumber;
			currentNumber = previousNumber + currentNumber;
			previousNumber = index;
		}
		return currentNumber == number;
	}


	public static void main(String[] args) {
	}

}
