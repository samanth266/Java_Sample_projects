import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Array1 = " +Arrays.toString(array1));
        reverse(array1);
        System.out.println("Reversed array1 is: " +Arrays.toString(array1));

        System.out.println("Array2 = " +Arrays.toString(array2));
        reverse(array2);
        System.out.println("Reversed array2 is: " +Arrays.toString(array2));
    }

    private static void reverse (int[] array){

        int maxLength = array.length-1;
        int halfLenght = array.length/2;
        for(int i =0; i<halfLenght;i++){
            int temp= array[i];
            array[i]=array[maxLength-i];
            array[maxLength-i]=temp;
        }
    }
}
//        System.out.println("Enter count:");
//        int count = scanner.nextInt();
//        scanner.nextLine();

//        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(returnedArray);

//        System.out.println("min = " + returnedMin);
//        int[] ar1 = readIntegers(5);
//        int min = findMin(ar1);
//        int hg = 7;
//        int cg = hg/2;
//        System.out.println("cg half is: " +cg);
//        System.out.println("min: " + min);
//    }
//
//    private static int[] readIntegers(int capacity) {
//        int[] array = new int[capacity];
//        for (int i = 0; i<array.length; i++) {
//            System.out.println("Enter a number: ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            array[i] = number;
//        }
//        return array;
//    }
//    private static int findMin(int[] array){
//        int min = Integer.MAX_VALUE;
//        for(int i =0;i<array.length;i++){
//            int value = array[i];
//            if(value<min){
//                min = value;
//            }
//        }
//        return min;
//    }
//}

//public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//
//
//
//    public static void main(String[] args) {
//        int[] myArray = getIntegers(5);
//        int[] sorted = sortArray(myArray);
//        printArray(sorted);
//
//    }
//    public static int[] getIntegers(int capacity){
//        int [] array = new int[capacity];
//        System.out.println(" Enter " +capacity+ " values:\r" );
//        for(int i =0; i<array.length;i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//    public static void printArray(int[] array){
//        int[] SamArray = new int [12];
//        System.out.println(SamArray.length);
//        for(int i=0;i<array.length;i++){
//            System.out.println(" Element " + i + " value: " + array[i]);
//        }
//
//    }
//    public static int[] sortArray(int [] array){
//        int[] sortedArray= Arrays.copyOf(array,array.length);
//        boolean flag=true;
//        int temp;
//        while(flag){
//
//            for(int i=0;i<array.length-1;i++){
//                if(sortedArray[i]<sortedArray[i+1]){
//                    temp=sortedArray[i];
//                    sortedArray[i]=sortedArray[i+1];
//                    sortedArray[i+1]=temp;
//                    flag=true;
//
//                }
//            }
//        }
//        return sortedArray;
//    }
//}






