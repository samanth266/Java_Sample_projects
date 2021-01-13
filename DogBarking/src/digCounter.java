public class digCounter {
    public static int DigitCount(int number){
        if (number < 0)
            return -1;
        if (number < 10){
            return 1;
        }
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
