package citybike;

public class User {
    private int userID;
    private String name;
    private String surname;
    private Bike currentlyRentedBike;
    static int count = 5000;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
        userID = count;
        count++;
    }

    public void pickBike(Bike currentlyRentedBike, Station station) {
        this.currentlyRentedBike = currentlyRentedBike;
        station.removeBike(currentlyRentedBike);
        currentlyRentedBike.setState("InService");
    }

    public void dropBike(Station station){
        station.addBike(currentlyRentedBike);
        currentlyRentedBike.setState("CanBeRented");
    }
}
