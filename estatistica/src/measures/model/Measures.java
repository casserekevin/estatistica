package measures.model;

import java.util.Arrays;

import measures.util.MeasuresUtil;

public class Measures {

	public void printAllMeasures(int[] numbers) {
		System.out.println("M�dia Aritm�tica: " + MeasuresUtil.getArithmeticMean(numbers));
		System.out.println("Vari�ncia(Amostragem): " + MeasuresUtil.getVariance(numbers));
		System.out.println("Vari�ncia(Total): " + MeasuresUtil.getVariance(numbers, true));
		System.out.println("Desvio Padr�o(Amostragem): " + MeasuresUtil.getStandardDeviation(numbers));
		System.out.println("Desvio Padr�o(Total): " + MeasuresUtil.getStandardDeviation(numbers, true));
		System.out.println("Coeficiente de Varia��o(Amostragem): " + MeasuresUtil.getVariationCoefficient(numbers));
		System.out.println("Coeficiente de Varia��o(Total): " + MeasuresUtil.getVariationCoefficient(numbers, true));
		System.out.println("Teste Z(Amostragem): " + Arrays.toString(MeasuresUtil.getTestZ(numbers)));
		System.out.println("Teste Z(Total): " + Arrays.toString(MeasuresUtil.getTestZ(numbers, true)));
	}
}
