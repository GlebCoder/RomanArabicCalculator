import java.util.Scanner;

public class MyCalculatorSolution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an expression you want to calculate:");
        String userMessage = scanner.nextLine();
        char[] userMessageArray = userMessage.toUpperCase().toCharArray();
        String typeOfOperation = OperationType.operationType(userMessageArray);
        int operatorIndex = OperationType.findOperatorIndex(userMessageArray, typeOfOperation);
        String numbersType = NumberValidation.numbersType(userMessageArray, operatorIndex);
        String firstNumber = NumberValidation.getFirstNumber(userMessageArray, operatorIndex);
        String secondNumber = NumberValidation.getSecondNumber(userMessageArray, operatorIndex);
        if (numbersType.equals("arabic")) {
            System.out.println(BasicCalculator.basicCalculator(firstNumber, secondNumber, typeOfOperation));
        } else {
            String firstNumberArabic = Converter.romanToArabic(firstNumber);
            String secondNumberArabic = Converter.romanToArabic(secondNumber);
            int resultArabic = BasicCalculator.basicCalculator(firstNumberArabic, secondNumberArabic, typeOfOperation);
            System.out.println(Converter.arabicToRoman(resultArabic));
        }
    }
}
