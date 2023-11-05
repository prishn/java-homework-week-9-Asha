package javaprogrammeweek9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10.Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_TubeLine {
    public static void main(String[] args) {
        // creating object for method londonStationZone1List
        Programme_10_TubeLine obj = new Programme_10_TubeLine();
        obj.londonStationZone1List();//calling the londonStationZoneList method to main method
    }

    // Creating method for london station name and UG line name
    public void londonStationZone1List() {

        HashMap<String, String> zone1UGLineList = new HashMap<String, String>();
        zone1UGLineList.put("Baker Street", "Bakerloo Line, Circle Line, Hammersmith & City Line, Jubilee Line, " +
                "Metropolitan Line, Central Line");
        zone1UGLineList.put("London Bridge", "Jubilee Line, Northern Line");
        zone1UGLineList.put("Bank", "Central Line, Circle Line, District Line, Northern Line, DLR, Waterloo and City Line");
        zone1UGLineList.put("Westminster", "Jubilee Line, District Line, Circle Line");
        zone1UGLineList.put("South Kensington", "Piccadilly Line, District Line, Circle Line");
        zone1UGLineList.put("Edgware Road", "District Line, Hammersmith & City Line, Circle Line, Bakerloo Line");
        zone1UGLineList.put("Paddington", "Bakerloo Line, Hammersmith & City Line, Circle Line, Bakerloo Line");
        zone1UGLineList.put("St Pancras & King's Cross", "Circle Line, Piccadilly Line, Hammersmith & City Line, " +
                "Northern Line, Metropolitan Line, Victoria Line");
        zone1UGLineList.put("Oxford Circus", "Bakerloo Line, Central Line, Victoria Line");
        zone1UGLineList.put("Waterloo", "Bakerloo Line, Northern Line, Waterloo Line & City");
        zone1UGLineList.put("Embankment", "Bakerloo Line, Circle Line, District Line, Northern Line");

        // Scanner declaration for reading the input from the console
        Scanner scanner = new Scanner(System.in);
        // ask user to enter the station name
        System.out.println("Please enter the tube station's name of Zone 1 : ");
        // storing the value in string which enter by user
        String userStationName = scanner.nextLine();
        // if else statement
        if (zone1UGLineList.containsKey(userStationName)) {
            String tubeLinesName = zone1UGLineList.get(userStationName);// get method
            System.out.println("The following lines pass through " + userStationName + " Station: " + tubeLinesName);
        } else {
            System.out.println(userStationName + " is not a Zone 1 station or not in provided list.");
        }
        scanner.close();
    }
}

