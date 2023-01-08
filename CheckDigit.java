public class CheckDigit{

    public static void main(String[]args){
        long in =Long.parseLong(args[0]);
        int count=1;
        int sum1 = 0;
        int sum2 = 0;

        while(in>0)
        {
            if(count%2!=0)
            {
                sum1 += in%10;
            }
            else
            sum2 += in%10;
            in/=10;
            count++;

        }
        sum1 = sum1%10;
        sum2 = sum2%10;
        sum2 = sum2 * 3;
        sum2= sum2%10;
        int digit = sum1 + sum2;
        digit = digit%10;
        System.out.println(digit);
    }
}
