public class BasicCalculator {
    public static int basicCalculator(String firstValue, String secondValue, String operation){
       int res = 0;
        switch (operation) {
            case "+":
                res = Integer.parseInt(firstValue) + Integer.parseInt(secondValue);
                break;
            case "-":
                res = Integer.parseInt(firstValue) - Integer.parseInt(secondValue);
                break;
            case "*":
                res = Integer.parseInt(firstValue) * Integer.parseInt(secondValue);
                break;
            case "/":
                res = Integer.parseInt(firstValue) / Integer.parseInt(secondValue);
                break;

        }
        return res;
    }
}
