import java.util.Arrays;
import java.util.List;

public class NumberValidation {
    public static String getFirstNumber(char[] userMessageArray, int operatorIndex){
        // Make a subarray for the the first number
        int begin = 0;
        int end = operatorIndex - 1;
        char[] firstNumberSubarray = new char[operatorIndex];
        for(int i=begin; i < end + 1; i++) {
            firstNumberSubarray[i] = userMessageArray[i];
        }
        // Convert firstNumberSubarray into a string
        StringBuilder firstNumberStringBuilder = new StringBuilder("");
        firstNumberStringBuilder.append(firstNumberSubarray);
        String firstNumber = firstNumberStringBuilder.toString().replaceAll("//s", "");
        return firstNumber.trim();
    }
    public static String getSecondNumber(char[] userMessageArray, int operatorIndex){
        // Make a subarray for the the second number
        int begin = operatorIndex + 1;
        int end = userMessageArray.length - 1;
        char[] secondNumberSubarray = new char[userMessageArray.length - operatorIndex - 1];
        for(int i=0; i < end - begin + 1; i++) {
            secondNumberSubarray[i] = userMessageArray[i + begin];
        }
        // Convert firstNumberSubarray into a string
        StringBuilder secondNumberStringBuilder = new StringBuilder("");
        secondNumberStringBuilder.append(secondNumberSubarray);
        String secondNumber = secondNumberStringBuilder.toString();
        return secondNumber.trim();
    }
    public static boolean isValidArabicNumber(String number){
        String[] arabicValidNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        boolean result = false;
        List arabicValidNumbersList = Arrays.asList(arabicValidNumbers);
        if(arabicValidNumbersList.contains(number)) {
            result = true;
        }
        return result;
    }
    public static boolean isValidRomanNumber(String number){
        String[] romanValidNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean result = false;
        List romanValidNumbersList = Arrays.asList(romanValidNumbers);
        if(romanValidNumbersList.contains(number)) {
            result = true;
        }
        return result;
    }
    public static String numbersType(char[] userMessageArray, int operatorIndex) throws Exception {
        String firstNumber = getFirstNumber(userMessageArray, operatorIndex);
        String secondNumber = getSecondNumber(userMessageArray, operatorIndex);
        String res = "arabic";
        if(isValidRomanNumber(firstNumber) && isValidRomanNumber(secondNumber)) {
            res = "roman";
        } else if(isValidArabicNumber(firstNumber) && isValidArabicNumber(secondNumber)) {
            res = "arabic";
        } else {
            throw new Exception("You have entered an invalid expression. Numbers can be in a range from 1 to 10 and they have to be of one type, arabic or Roman.");
        }
       return res;
    }
}
