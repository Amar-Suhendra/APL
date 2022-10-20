import java.util.Scanner;

interface TravelToRailwayStation
{
 public void gotoRailwayStation();
}

class TravelByAuto implements TravelToRailwayStation
{

 public void gotoRailwayStation()
 {
 System.out.println("Karan is Traveling to the Railway Station by an Auto and will be charged 350 Rs");
 }

}

class TravelByBus implements TravelToRailwayStation
{

 public void gotoRailwayStation()
 {
 System.out.println("Karan is Traveling to the Railway Station by a Bus and will be charged 120 Rs");
 }

}

class TravelByTaxi implements TravelToRailwayStation
{

 public void gotoRailwayStation()
 {
 System.out.println("Karan is Traveling to the Railway Station by a Taxi and will be charged 450 Rs");
 }

}

class Travel
{
 private TravelToRailwayStation travelToRailwayStation;

 public void setTravelToRailwayStation(TravelToRailwayStation 
 railwayStation)
 {
 this.travelToRailwayStation = railwayStation;
 }

 public TravelToRailwayStation getTravelToRailwayStation()
 {
 return travelToRailwayStation;
 }

 public void gotoRailwayStation()
 {
 travelToRailwayStation.gotoRailwayStation();
 }

}


public class StrategyDesignPattern {
    private static Scanner scanner;

    public static void main( String[] args )
     {

     System.out.println("Please enter mode of Transportation Type : 'Bus' or 'Taxi' or 'Auto' ");
     scanner = new Scanner(System.in);
     String transportationType = scanner.next();
     System.out.println("Transportation type is : " + transportationType);

     Travel travel = null;
     travel = new Travel();

     if( "Bus".equalsIgnoreCase(transportationType) )
     {
     travel.setTravelToRailwayStation(new TravelByBus());
     }
     else if("Taxi".equalsIgnoreCase(transportationType))
     {
     travel.setTravelToRailwayStation(new TravelByTaxi());
     }
     else if("Auto".equalsIgnoreCase(transportationType))
     {
     travel.setTravelToRailwayStation(new TravelByAuto());
     }
     System.out.println("Mode of Transportation has : "+ 
     travel.getTravelToRailwayStation());
     travel.gotoRailwayStation();

     }
}
