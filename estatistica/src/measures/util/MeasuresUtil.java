package measures.util;

import java.util.Arrays;

public final class MeasuresUtil {

	//Média
	public static double getArithmeticMean(int[] numbers) {

		return (double) Arrays.stream(numbers).sum() / numbers.length;
	}

	//Variância
	public static double getVariance(int[] numbers) {

		double mean = MeasuresUtil.getArithmeticMean(numbers);

		return Arrays.stream(numbers).mapToDouble((x) -> Math.pow(mean - x, 2)).sum() / (numbers.length - 1);
	}

	public static double getVariance(int[] numbers, boolean total) {

		double mean = MeasuresUtil.getArithmeticMean(numbers);

		return total ? Arrays.stream(numbers).mapToDouble((x) -> Math.pow(mean - x, 2)).sum() / numbers.length : MeasuresUtil.getVariance(numbers);
	}

	//Desvio Padrão
	public static double getStandardDeviation(int[] numbers) {

		double var = MeasuresUtil.getVariance(numbers);

		return Math.sqrt(var);
	}

	public static double getStandardDeviation(int[] numbers, boolean total) {

		double varT = MeasuresUtil.getVariance(numbers, true);
		double sd = MeasuresUtil.getStandardDeviation(numbers);

		return total ? Math.sqrt(varT) : sd;
	}

	//Coeficiente de Variação
	public static double getVariationCoefficient(int[] numbers) {

		double sd = MeasuresUtil.getStandardDeviation(numbers);
		double mean = MeasuresUtil.getArithmeticMean(numbers);

		return sd / mean;
	}

	public static double getVariationCoefficient(int[] numbers, boolean total) {

		double sdT = MeasuresUtil.getStandardDeviation(numbers, true);
		double mean = MeasuresUtil.getArithmeticMean(numbers);

		return total ? sdT / mean : MeasuresUtil.getVariationCoefficient(numbers);
	}

	public static double[] getTestZ(int[] numbers) {

		double mean = MeasuresUtil.getArithmeticMean(numbers);
		double sd = MeasuresUtil.getStandardDeviation(numbers);

		return Arrays.stream(numbers).mapToDouble((x) -> (x - mean) / sd).toArray();
	}

	public static double[] getTestZ(int[] numbers, boolean total) {

		double mean = MeasuresUtil.getArithmeticMean(numbers);
		double sdT = MeasuresUtil.getStandardDeviation(numbers, true);

		return total ? Arrays.stream(numbers).mapToDouble((x) -> (x - mean) / sdT).toArray() : MeasuresUtil.getTestZ(numbers);
	}
}
