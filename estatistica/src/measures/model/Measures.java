package measures.model;

import java.util.Arrays;

import measures.util.MeasuresUtil;

public class Measures {

	public void printAllMeasures(int[] numbers) {
		System.out.println("Média Aritmética: " + MeasuresUtil.getArithmeticMean(numbers));
		System.out.println("Variância(Amostragem): " + MeasuresUtil.getVariance(numbers));
		System.out.println("Variância(Total): " + MeasuresUtil.getVariance(numbers, true));
		System.out.println("Desvio Padrão(Amostragem): " + MeasuresUtil.getStandardDeviation(numbers));
		System.out.println("Desvio Padrão(Total): " + MeasuresUtil.getStandardDeviation(numbers, true));
		System.out.println("Coeficiente de Variação(Amostragem): " + MeasuresUtil.getVariationCoefficient(numbers));
		System.out.println("Coeficiente de Variação(Total): " + MeasuresUtil.getVariationCoefficient(numbers, true));
		System.out.println("Teste Z(Amostragem): " + Arrays.toString(MeasuresUtil.getTestZ(numbers)));
		System.out.println("Teste Z(Total): " + Arrays.toString(MeasuresUtil.getTestZ(numbers, true)));
	}
}
