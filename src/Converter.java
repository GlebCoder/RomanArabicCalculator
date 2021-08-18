public class Converter {
    public static String romanToArabic(String romanNumber) {
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String arabicNumber = "";
        for(int i=0; i < romanNumbers.length; i++) {
            if(romanNumbers[i].equals(romanNumber)) {
                arabicNumber = arabicNumbers[i];
                break;
            }
        }
        return arabicNumber;
    }


    public static String arabicToRoman(int arabicNumber) throws Exception {
        if(arabicNumber <= 0) {
            throw new Exception("Result can be only positive whole numbers");
        }
        String[] romanUnits = {"I", "II", "III", "VI", "V", "VI", "VII", "VIII", "IX"};
        String[] romanTens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String romanHundred = "C";
        int[] arabicUnits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arabicNumberHundredDigits = arabicNumber / 100;
        int arabicNumberTensDigits = (arabicNumber - arabicNumberHundredDigits * 100) / 10;
        int arabicNumberUnitsDigits = arabicNumber % 10;
        String romanNumberHundred = "";
        String romanNumberTens = "";
        String romanNumberUnits = "";
        String romanNumber = ""; // It will be our result
        if(arabicNumberHundredDigits == 1) {
            romanNumberHundred = romanHundred;
        }
        if(arabicNumberTensDigits != 0){
            for(int i = 0; i < arabicUnits.length; i++) {
                if(arabicUnits[i] == arabicNumberTensDigits) {
                    romanNumberTens = romanTens[i];
                    break;
                }
            }
        }
        if(arabicNumberUnitsDigits != 0) {
            for(int i = 0; i < arabicUnits.length; i++) {
                if(arabicUnits[i] == arabicNumberUnitsDigits) {
                    romanNumberUnits = romanUnits[i];
                    break;
                }
            }
        }
        romanNumber = romanNumberHundred + romanNumberTens + romanNumberUnits;
        return romanNumber;
    }
}
