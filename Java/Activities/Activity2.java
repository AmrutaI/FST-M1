package Activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] ar) {
        int inp[] ={10,77,10,54,-11,10};
        System.out.println("The Input array is ::"+ Arrays.toString(inp));

        int searchN=10;
        int fixedSum=30;

        boolean result = checkValue(inp,searchN,fixedSum);
        System.out.println("Result check value:"+result);
    }
    public static boolean checkValue(int[] narr,int searchNum,int fixedsum)
    {
        int tmp = 0;
        for(int n : narr) {
            if (n == searchNum) {
                tmp +=searchNum;
            }
            if(tmp > fixedsum)
                break;
        }
        return tmp == fixedsum;
    }
}
