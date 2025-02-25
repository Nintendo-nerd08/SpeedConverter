public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.5));
        System.out.println(toMilesPerHour(25.45));
        System.out.println(toMilesPerHour(75.115));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }else{
            double mph = kilometersPerHour / 1.609;
            return Math.round(mph);
        }




    }
}
