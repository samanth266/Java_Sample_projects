public class DiagonalStar {
    public static void printSquareStar (int number){
        char star = '*';
        int rowNumber;
        int colNumber;
        if(number<5){
            System.out.println("Invalid value");
        }
        else{
            for(rowNumber=1;rowNumber<=number;rowNumber++){
                for(colNumber=1;colNumber<=number;colNumber++){
                    if(rowNumber==1 || rowNumber == number || colNumber==1 || colNumber==number || rowNumber == colNumber || colNumber == ((number - rowNumber) + 1)){
                        System.out.print(star);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
