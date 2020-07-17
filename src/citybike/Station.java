package citybike;

import java.util.HashMap;

public class Station {
    private int stationID;
    private String location;
    private HashMap <Integer, Bike> bikes = new HashMap<>();
    static int count = 20000;

    public Station(){
        stationID = count;
        count++;
    }

    public int getStationID() {
        return stationID;
    }

    public void addBike(Bike newBike){
        bikes.put(newBike.getBikeID(), newBike);
    }
}
