public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y) {

        int gdc = 0;

        if (x < 10 || y < 10){
            return -1;
        }



        for(int i =1; i<=x; i++ ){
            if(x%i == 0 && y%i==0){
                gdc=i;
            }
        }
        return gdc;
    }
}