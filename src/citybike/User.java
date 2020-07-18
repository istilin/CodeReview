package citybike;
import java.time.LocalDateTime;

public class User {
    private int userID;
    private String name;
    private String surname;
    private Bike currentlyRentedBike;
    private Rent rent;

    // For the initial ID number
    static int count = 5000;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;

        //Assigns userID
        userID = count;
        count++;
    }

    // User picks a bike
    public void pickBike(Bike currentlyRentedBike, Station station) {

        //Only allows us to pic the bike if it's in the selected station
        if (station.getBikes().containsKey(currentlyRentedBike.getBikeID())) {

            // Changes the state of the bike
            currentlyRentedBike.setState("CanNotBeRented");

            // Assigns the selected bike to the current rented bike
            this.currentlyRentedBike = currentlyRentedBike;

            // Removes the bike from the station
            station.removeBike(currentlyRentedBike);

            // Initialises rent class
            rent = new Rent(currentlyRentedBike.getBikeID());

            // Prints the rentStart for the user
            System.out.println("User " + userID + " (" + name + " " + surname + ") rented the bike on the " + rent.getRentStart());
        }

        // If the bike is not on the station we cannot pick it and prints a message to let us know
        else{
            System.out.println("I'm sorry " + name + " but the selected bike is not available in this station.");
        }
    }

    // User drops bike
    public void dropBike(Station station){

        // If the user has a bike it will allow us to drop the bike
        if (currentlyRentedBike != null) {

            // When the bike is in state CanNotBeRented the user is using the bike and will try to add it to the station
            if (currentlyRentedBike.getState().equals("CanNotBeRented")) {

                // Only adds bikes when there are free spots (5 spots in total)
                if (station.getBikes().size() < 5) {

                    // Adds the bike
                    station.getBikes().put(currentlyRentedBike.getBikeID(), currentlyRentedBike);

                    // Changes the state to CanBeRented
                    currentlyRentedBike.setState("CanBeRented");

                    // Shows us the renting end time
                    System.out.println("User " + userID + " (" + name + " " + surname + ") ended the rent on the " + rent.getRentEnd());

                    // Sets the current rented bike to null
                    currentlyRentedBike = null;

                } else {

                    // When station is full prints a message
                    System.out.println("Station is full " + name + ", you can't drop your bike here. Please find another station.");
                }
            }
        }

        // If the user doesn't have a bike currently, it cannot drop a bike and prints a message to let us know
        else{
            System.out.println("I'm sorry " + name + " but you don't have any bikes to drop.");
        }
    }

    // Returns currently rented bike
    public Bike getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    // Returns users name
    public String getName() {
        return name;
    }

    // Returns users surname
    public String getSurname() {
        return surname;
    }

    // Returns userID
    public int getUserID() {
        return userID;
    }
}
