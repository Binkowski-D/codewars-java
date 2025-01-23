package codewars.kata6;


public class FindOutlier {

  public static void main(String[] args) {

    int [] firstArray = {2, 4, 0, 100, 4, 11, 2602, 36};
    int [] secondArray = {160, 3, 1719, 19, 11, 13, -21};

    System.out.println(find(firstArray));
    System.out.println(find(secondArray));

  }

  static int find(int[] integers) {
    boolean majorityEvens = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2) <= 1;

    for(int tmp : integers){
      if((tmp % 2 == 0) != majorityEvens){
        return tmp;
      }
    }

    throw new IllegalStateException("No outlier found, input array is invalid");
  }
}
