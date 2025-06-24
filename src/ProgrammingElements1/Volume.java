package ProgrammingElements1;//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => week1level1.Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class Volume {
    public static void main(String[] args) {
        int radiusOfEarth = 6378;
        double volOfEarthInKm = (4.0/3.0)*Math.PI*Math.pow(radiusOfEarth, 3);
        System.out.println(volOfEarthInKm);
        double volOfEarthInMiles = volOfEarthInKm * 1.6;
        System.out.println(volOfEarthInMiles);
    }
}
