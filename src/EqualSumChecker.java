public class EqualSumChecker {
    public static void main(String[] args) {

        boolean solution = hasEqualSum(2,-1,1);
        System.out.println(solution);
    }


    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber + secondNumber == thirdNumber){
            return true;
        }
        return false;
    }


}
