public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = 0;
        int sum=0;
        // number = 12 should output 3
        if(number < 0){
            return -1;
        }
        lastDigit = number % 10;

        while(number >= 10){
            number /= 10;

        }
        sum= number + lastDigit;
        System.out.println(sum);
        return sum;

    }
    public static int met (int number){
        int FirstDigit = 0;
        while(number!=0){
            number/=10;
            FirstDigit ++;

        }
        return FirstDigit;
    }
}
