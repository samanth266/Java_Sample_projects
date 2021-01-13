public class AreaCalculator {
    public static double area(double radius){
        double PI =Math.PI;
        if(radius<0){
            return -1.0;
        }
        else{
            double A= PI * radius * radius;
            return A;
        }

    }

    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;
        }

        else{
            double rectArea = (x*y);
            return rectArea;
        }

    }

}