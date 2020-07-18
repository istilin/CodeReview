package citybike;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Initialises bikes
        Bike bike1 = new Bike("yellow", "CanBeRented");
        Bike bike2 = new Bike("blue", "CanBeRented");
        Bike bike3 = new Bike("purple", "CanBeRented");
        Bike bike4 = new Bike("red", "CanBeRented");
        Bike bike5 = new Bike("green", "CanBeRented");
        Bike bike6 = new Bike("orange", "CanBeRented");
        Bike bike7 = new Bike("black", "CanBeRented");
        Bike bike8 = new Bike("white", "InService");
        Bike bike9 = new Bike("white", "Discarded");

        // Adds bikes to Hashmap
        HashMap<Integer, Bike> bikes = new HashMap<>();
        bikes.put(bike1.getBikeID(), bike1);
        bikes.put(bike2.getBikeID(), bike2);
        bikes.put(bike3.getBikeID(), bike3);
        bikes.put(bike4.getBikeID(), bike4);
        bikes.put(bike5.getBikeID(), bike5);
        bikes.put(bike6.getBikeID(), bike6);
        bikes.put(bike7.getBikeID(), bike7);
        bikes.put(bike8.getBikeID(), bike8);
        bikes.put(bike9.getBikeID(), bike9);

        // Initialised stations
        Station station1 = new Station("Wien Hbf");
        Station station2 = new Station("Wien Meidling");
        Station station3 = new Station("Wien Karlsplatz");

        // Adds stations to hashmap
        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(station1.getStationID(), station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);

        // Adds bikes to stations
        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);
        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);

        // Initialises users
        User user1 = new User("Irati", "Larreina");
        User user2 = new User("Max", "Power");
        User user3 = new User("John", "Doe");
        User user4 = new User("Mary", "Christmas");

        // Users pick bikes
        user1.pickBike(bike1, station1);
        user2.pickBike(bike3, station1);
        user3.pickBike(bike4, station2);
        user4.pickBike(bike7, station2);

        // Users drop bikes
        user1.dropBike(station3);
        user2.dropBike(station3);
        user3.dropBike(station2);
        user4.dropBike(station1);

    }
}
