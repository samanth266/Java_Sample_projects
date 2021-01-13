public class NumberToWords {
    public static int getDigitCount(int number) {
        int count = 1;
        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int num) {
        int rev = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNum = reverse(number);
            int digCount = getDigitCount(number);
            while (digCount != 0) {

                int dig = reversedNum % 10;
                switch (dig) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
            }
            reversedNum /= 10;
            digCount--;


        }
    }
}
