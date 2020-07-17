package citybike;

public class Bike {
    private int bikeID;
    private String color;
    private String state;
    static int count = 1000000;

    public Bike(){
        bikeID = count;
        count++;
    }

    public int getBikeID() {
        return bikeID;
    }
}
