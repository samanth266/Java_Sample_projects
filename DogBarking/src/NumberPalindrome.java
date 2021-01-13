public class NumberPalindrome {
        public static boolean isPalindrome(int number){
            number = 1234;
            int reverse = 0;
            int lastDigit = 0;
            //original number
            while(number>0){
                lastDigit = number % 10;
                reverse = reverse *10 + lastDigit;
                number = number / 10;

            }
            if(number == reverse){
                return true;
            }
        return false;

        }
}
