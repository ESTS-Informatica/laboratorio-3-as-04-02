public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;

    private static final double FEES = 0.03;

    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(FEES);
    }
}
