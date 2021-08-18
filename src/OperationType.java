import java.util.ArrayList;

public class OperationType {

    public static String operationType(char[] userMessageArray) throws Exception {
        ArrayList<String> listOfOperationsInUserMessage = new ArrayList<String>();
        for(int i=0; i < userMessageArray.length; i++) {
            if(userMessageArray[i] == '+' || userMessageArray[i] == '-' || userMessageArray[i] == '/' || userMessageArray[i] == '*') {
                String element = String.valueOf(userMessageArray[i]);
                listOfOperationsInUserMessage.add(element);
            }

        }
        if(listOfOperationsInUserMessage.size() != 1) {
            throw new Exception("You have to enter one and only one operator! Operators can be '+', '-', '/' or '*'.");
        }
    return listOfOperationsInUserMessage.get(0);
    }
    public static int findOperatorIndex(char[] userMessageArray, String typeOfOperation) throws Exception {
        int foundIndex = 0;
        char value = typeOfOperation.charAt(0);
        for(int i = 0; i < userMessageArray.length; i++) {
            if(userMessageArray[i] == value) {
                foundIndex =  i;
            }
        }
        if(foundIndex == 0 || foundIndex == userMessageArray.length - 1) {
            throw new Exception("An operator has to be placed between two arabic or Roman numbers");
        }
        return foundIndex;
    }
}
