package codewars.kata5;

public class SimpleNumberSequence {
    public static void main(String[] args) {

        System.out.println(missing("123567")); // Should return 4
        System.out.println(missing("899091939495")); // Should return 92
        System.out.println(missing("9899101102")); // Should return 100
        System.out.println(missing("599600601602")); // Should return -1
        System.out.println(missing("8990919395")); // Should return -1
    }

    public static int missing(String s){
        for(int i = 1; i <= Math.min(6, s.length() / 2); i++){
            if(s.startsWith("0")){
                return -1;
            }
            int firstNumber = Integer.parseInt(s.substring(0, i));
            Integer missingNumber = null;
            boolean multipleMissing = false;

            int currentNumber = firstNumber;
            int currentIndex = i;

            while(currentIndex < s.length() && !multipleMissing){
                String nextNumber = Integer.toString(currentNumber + 1);
                String nextNumberPlusOne = Integer.toString(currentNumber + 2);

                if(s.startsWith(nextNumber, currentIndex)){
                    currentIndex+= nextNumber.length();
                    currentNumber++;
                }else if(s.startsWith(nextNumberPlusOne, currentIndex)) {
                    if(missingNumber == null) {
                        missingNumber = currentNumber + 1;
                        currentIndex += nextNumberPlusOne.length();
                        currentNumber += 2;
                    }else{
                        multipleMissing = true;
                    }
                }else{
                    multipleMissing = true;
                }
            }

            if(!multipleMissing && missingNumber != null){
                return missingNumber;
            }
        }

        return -1;
    }
}