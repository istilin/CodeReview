package citybike;
import java.time.LocalDateTime;

public class Rent {
    private int bikeID;
    private LocalDateTime rentStart;

    public Rent(int bikeID){
        this.bikeID = bikeID;

        // Calculates the local date time and assigns it to rentStart
        rentStart = LocalDateTime.now();
    }

    // Returns rentStart
    public LocalDateTime getRentStart() {
        return rentStart;
    }

    // When this function is called it returns the local date time (it is called when the rent is over so it will be the rentEnd
    public LocalDateTime getRentEnd() {
        return LocalDateTime.now();
    }

    // Returns bikeID
    public int getBikeID() {
        return bikeID;
    }
}
