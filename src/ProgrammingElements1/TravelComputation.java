package ProgrammingElements1;

class TravelComputation {
    public static void main(String[] args) {
         String name = "Eric";
         String fromCity = "Chennai" , viaCity = "Vellore" , toCity = "Bangalore";
         double distanceFromToVia = 156.6;
         int timeFromToVia = 4*60+4;
         double distanceFromViaToFinalCity=  211.8;
         int timeViaToFinalCity = 4*60+25;
         double totalDistance = distanceFromToVia + distanceFromViaToFinalCity;
         int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The total distance travelled by " + name + "from" + fromCity + "to" + toCity +"via" + viaCity + "is" + totalDistance + "km and" + "the toal time taken is" +totalTime+ "minutes");
    }
}