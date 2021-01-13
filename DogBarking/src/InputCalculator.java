import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0 ;
        int count = 1 ;

        while (true)
        {


            boolean isAnint = scanner.hasNextInt() ;


            if (isAnint)
            {
                int number = scanner.nextInt() ;

                sum = sum + number ;
                count ++ ;

            }
            else
            {
                avg = Math.round((double)sum / (count-1)) ;
                System.out.println("SUM = " +sum + " AVG = " +avg);
                break;
            }
            scanner.nextLine() ;


        }

        scanner.close();
    }
}
