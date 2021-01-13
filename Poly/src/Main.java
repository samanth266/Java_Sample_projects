class Movie{
        private String name;
        public Movie(String name){
            this.name = name;
        }
        public String plot(){
            return "No plot here";
        }

        public String getName() {
            return name;
        }
    }
    class JohnWick extends Movie{
        public JohnWick(){
            super("John Wick");
        }
        @Override
        public String plot(){
            return "Guns and turtle necks";
        }
    }
     class Superman extends Movie{
        public Superman(){
            super("Superman");
        }
        @Override
        public String plot(){
            return "Dont eat Kryptonite";
        }
    }
     class Robot extends Movie{
        public Robot(){
            super("Robot");
        }
        @Override
        public String plot(){
            return "Dont love Sana -chitti";
        }
    }
    class IronMan extends Movie{
        public IronMan(){
            super("IronMan");
        }
        @Override
        public String plot(){
            return "Create Suit with Arc reactor";
        }
    }
class JojoRabit extends Movie{
    public JojoRabit(){
        super("JojoRabit");
    }
    @Override
    public String plot(){
        return "Fuck hitler ";
    }
}
public class Main {
    public static void main (String[] args) {
        for(int i =1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
                    "Plot: " +movie.plot() +"\n");
        }
    }
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4);
        System.out.println("random number generated was: " +randomNumber);
        switch(randomNumber){
            case 0:
                return new JohnWick();
            case 1:
                return new Superman();
            case 2:
                return new Robot();
            case 3:
                return new IronMan();

        }
        return null;

    }
}
