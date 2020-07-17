package citybike;

import java.util.HashMap;

public class Station {
    private int stationID;
    private String location;
    private HashMap <Integer, Bike> bikes = new HashMap<>();
    static int count = 20000;

    public Station(String location){
        stationID = count;
        count++;
    }

    public int getStationID() {
        return stationID;
    }

    public void addBike(Bike newBike){
        if (bikes.size()<5){
        bikes.put(newBike.getBikeID(), newBike);
        }
        else{
            System.out.print("Station is full, you can't drop your bike here. Please find another station.");
        }
    }

    public void removeBike(Bike oldBike){
        bikes.remove(oldBike.getBikeID(), oldBike);
    }

    public HashMap <Integer, Bike> showBikes(){
        return bikes;
    }
}
