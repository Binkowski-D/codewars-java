package codewars.kata6;

public class UniqueNumber {
    public static void main(String[] args) {

        double[] arr = {1, 1, 1, 2, 1, 1};
        double[] array = {0, 0, 0.55, 0, 0 };

        System.out.println(findUniq(arr));
        System.out.println(findUniq(array));

    }

    public static double findUniq(double [] arr) {

        double notUnique = (arr[0] == arr[1]) ? arr[0] : (arr[0] == arr[2] ? arr[0] : arr[1]);

        for(double number : arr){
            if(number != notUnique){
                return number;
            }
        }

        return 0.0;
    }
}

