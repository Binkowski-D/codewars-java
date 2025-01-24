package codewars.kata7;

public class Sum
  {

      public static void main(String[] args) {


          System.out.println(getSum(1, 0));
          System.out.println(getSum(1,2));
          System.out.println(getSum(0, 1));
          System.out.println(getSum(1, 1));
          System.out.println(getSum(-1, 0));
          System.out.println(getSum(-1, 2));
      }




     public static int getSum(int a, int b)
     {
         int min = Math.min(a, b);
         int max = Math.max(a, b);

         return (max - min + 1) * (min + max) / 2;
     }
  }

