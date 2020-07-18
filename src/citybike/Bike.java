package citybike;

public class Bike {
    private int bikeID;
    private String color;
    private String state;

    // For the initial ID number
    static int count = 1000000;

    public Bike(String color, String state){
        this.color = color;
        this.state = state;

        //Assigns bikeID
        bikeID = count;
        count++;
    }

    // Returns bikeID
    public int getBikeID() {
        return bikeID;
    }

    // Returns State
    public String getState() {
        return state;
    }

    // Sets State
    public void setState(String state) {
        this.state = state;
    }

    // Returns bike color
    public String getColor() {
        return color;
    }

}
