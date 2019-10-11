package measures;

import java.util.List;

import measures.model.Measures;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		//execution
		Measures measures = new Measures();
		measures.printAllMeasures(numbers);

	}

	public static void calculateRangeWithList(List<Integer> numbers) {

		int highestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;

		for (Integer number : numbers) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
			if (number > highestNumber) {
				highestNumber = number;
			}
		}

		System.out.println("Maior Número: " + highestNumber);
		System.out.println("Menor Número: " + smallestNumber);

		System.out.println("Alcance: " + (highestNumber - smallestNumber));
	}

	public static void calculateRangeWithArray(Integer[] numbers) {
		int highestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;

		for (Integer number : numbers) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
			if (number > highestNumber) {
				highestNumber = number;
			}

		}

		System.out.println("Maior Número: " + highestNumber);
		System.out.println("Menor Número: " + smallestNumber);

		System.out.println("Alcance: " + (highestNumber - smallestNumber));
	}

}
