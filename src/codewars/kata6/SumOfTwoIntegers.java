package codewars.kata6;

public class SumOfTwoIntegers {
    public static void main(String[] args) {

       System.out.println(add(5,19));
       System.out.println(add(-27,18));
       System.out.println(add(-14,-16));
       System.out.println("------------------------");
       System.out.println(addLoop(5,19));
       System.out.println(addLoop(-27,18));
       System.out.println(addLoop(-14,-16));


    }

    public static int add(int x, int y)
    {
        while(y != 0){
            int sumWithoutCarry = x ^ y;
            int carry = (x & y) << 1;

            x = sumWithoutCarry;
            y = carry;
        }
        return x;
    }

    public static int addLoop(int x, int y){

        while(y != 0){
            if(y > 0){
                y--;
                x++;
            }else{
                x--;
                y++;
            }
        }
        return x;
    }
}

//5,19
// -14,-16

