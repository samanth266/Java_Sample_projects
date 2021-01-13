public class MegabytesConverter {

//    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
//        if (KiloBytes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//
//
//            int megabytes = KiloBytes / 1024;
//            int remainingKilobytes = KiloBytes % 1024;
//
//            String result = KiloBytes + " KB " + " = " + megabytes + " MB " + remainingKilobytes + " KB ";
//            System.out.println(result);
//
//
//        }
//    }

        public static boolean shouldWakeUp(boolean barking, int hourOfDay){

            if(hourOfDay < 0 || hourOfDay>23){
                return false;
            }
            else (hourOfDay < 8 || hourOfDay>12) {
                return true;
            }
        return false;
        }

    }
