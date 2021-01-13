import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("Initial pages amount: " +printer.getPagesPrinted());
        int NpagesPrinted = printer.Printpages(3);
        System.out.println("Paper printed: "+NpagesPrinted+ " ,Total paper printed are: " +printer.getPagesPrinted());
        NpagesPrinted = printer.Printpages(4);
        System.out.println("Paper printed: "+NpagesPrinted+ " ,Total paper printed are: " +printer.getPagesPrinted());
//        printer.addToner(40);
//        System.out.println("tonerLevel: " +tonerlevel);
    }
}



//
//        int sum = 0;
//        int counter = 0;
//        long avg = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter a number: ");
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                sum += number;
//                counter++;
//            } else {
//                avg = Math.round((double) sum / (counter));
//                System.out.println("SUM = " + sum + " AVG = " + avg);
//                break;
//            }
//            scanner.nextLine();
//
//        }
//        scanner.close();
//    }
//}

//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        System.out.println("min: " +min);
//        int max = Integer.MIN_VALUE;
//        System.out.println("max: " +max);
//        while (true) {
//            System.out.println("Enter number: ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                if (number <= min) {
//                    min = number;
//                }
//                System.out.println("current min value: " +min);
//
//                if (number > max) {
//                    max = number;
//                }
//                System.out.println("current max value: " +max);
//            }
//                else {
//                    break;
//                }
//                scanner.nextLine();
//            }
//            System.out.println("min = " + min + ", max = " + max);
//        scanner.close();
//    }
//}


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt){
//            int yearOfbirth = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2020 - yearOfbirth;
//            if(age>=0 && age<=100){
//                System.out.println("your name is " + name + ", and you are " +age+ " years old.");
//            }else {
//                System.out.println("Invalid year of birth");
//
//            }
//        }
//        else{
//            System.out.println("Unable to parse YOB ");
//        }
//        DiagonalStar.printSquareStar(8);

//        System.out.println(NumberPalindrome.isPalindrome(707));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
//        boolean res=LastDigitChecker.hasSameLastDigit(41,22,71);
//        System.out.println(res);

//        FirstLastDigitSum.sumFirstAndLastDigit(10);
//        int a =223;
//        if(a>=10) {
//            a /= 10;
//        }
//        System.out.println(a);

//        NumberPalindrome.isPalindrome(1123);
//        int number =0;
//        while(number<15){
//            number++;
//            if(number <5){
//                System.out.println("skipping number at: " + number);
//                continue;
//            }
//            System.out.println(number);
//
//            if(number>=10){
//                System.out.println("breakint at " + number);
//                break;
//            }
//        }

//       int result = SumOddRange.sumOdd(13,13);
//        System.out.println(result);
//        boolean isBarking =BarkingDog.shouldWakeUp(true,22);
//        System.out.println(isBarking);

//        LeapYear.isLeapYear(1924);
//
//       boolean areSame = DecimalComparator.areEqualByThreeDecimalPlaces(3.176,3.175);
//        System.out.println(areSame);
//        double Area =AreaCalculator.area(5.0);
//        System.out.println(Area);
//
//        boolean meow = PlayingCat.isCatPlaying(false,10);
//        System.out.println(meow);
//        int count = 0;
//        int sum = 0;
//
//        for(int i=1;i<=1000;i++){
//            if((i%3==0) && (i%5==0)) {
//                count++;
//                sum += i;
//                System.out.println(" found number " + i);
//            }
//
//                if(count ==5){
//                    break;
//                }
//            }
//        System.out.println(" sum = " + sum);








