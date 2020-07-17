package citybike;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        Bike bike3 = new Bike();
        Bike bike4 = new Bike();
        Bike bike5 = new Bike();
        Bike bike6 = new Bike();
        Bike bike7 = new Bike();
        Bike bike8 = new Bike();

        HashMap<Integer, Bike> bikes = new HashMap<>();
        bikes.put(bike1.getBikeID(), bike1);
        bikes.put(bike2.getBikeID(), bike2);
        bikes.put(bike3.getBikeID(), bike3);
        bikes.put(bike4.getBikeID(), bike4);
        bikes.put(bike5.getBikeID(), bike5);
        bikes.put(bike6.getBikeID(), bike6);
        bikes.put(bike7.getBikeID(), bike7);
        bikes.put(bike8.getBikeID(), bike8);

        Station station1 = new Station();
        Station station2 = new Station();
        Station station3 = new Station();

        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(station1.getStationID(), station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);

        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);
        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
    }

}
