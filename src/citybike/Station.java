package citybike;

import java.util.HashMap;

public class Station {
    private int stationID;
    private String location;

    // Data structure for storing bikes that are currently in the station
    private HashMap <Integer, Bike> bikes = new HashMap<>();

    // For the initial ID number
    static int count = 20000;

    public Station(String location){

        // Assigns stationID
        stationID = count;
        count++;
    }

    // Returns stationID
    public int getStationID() {
        return stationID;
    }

    // Adds bike to data
    public void addBike(Bike newBike){

        // Only adds bikes when they can be rented
        if (newBike.getState().equals("CanBeRented")) {

            // Only adds bikes when there are free spots (5 spots in total)
            if (bikes.size() < 5) {

                // Adds the bike
                bikes.put(newBike.getBikeID(), newBike);
            } else {

                // When station is full prints a message
                System.out.println("Station is full, you can't add more bikes here.");
            }
        }

        // When the bike is in state CanNotBeRented we can't add it manually to the station (only a user can)
        else if (newBike.getState().equals("CanNotBeRented")) {

            System.out.println("This bike can not be rented. It cannot be added to any station.");
        }

        // When the bike is in state InService, it's being repaired and can not be added to a station
        else if (newBike.getState().equals("InService")) {

            // Prints a message to let us know about the state
            System.out.println("This bike is being repaired. It cannot be added to any station.");
        }

        // When a bike is in state Discarded, it is broken and cannot be added to the station
        else if (newBike.getState().equals("Discarded")) {

            // Prints a message to let us know about the state
            System.out.println("This bike is too broken to bee repaired. It cannot be added to any station.");
        }

        // We wrote a wrong state
        else{

            // Prints a message letting us know we introduced the wrong state
            System.out.println("I'm sorry but this status is unknown, please try another one.");
        }
    }

    // Removes the bike from the data
    public void removeBike(Bike oldBike){

        // Removes bike
        bikes.remove(oldBike.getBikeID(), oldBike);
    }

    // Returns our data bikes from this station
    public HashMap <Integer, Bike> getBikes(){
        return bikes;
    }

    // Returns location of the station
    public String getLocation() {
        return location;
    }
}
