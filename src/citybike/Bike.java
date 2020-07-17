package citybike;

public class Bike {
    private int bikeID;
    private String color;
    private String state;
    static int count = 1000000;

    public Bike(String color){
        this.color = color;
        bikeID = count;
        count++;
        state = "CanBeRented";
    }

    public int getBikeID() {
        return bikeID;
    }

    public void setState(String state) {
        this.state = state;
    }
}
