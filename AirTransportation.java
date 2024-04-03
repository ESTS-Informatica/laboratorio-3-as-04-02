public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;

    private static final double FEES = 0.03;

    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(FEES);
    }
    public String getName(){return name;}
    public int getNumberOfContainers(){return numberOfContainers;}
    public double getFees(){return FEES;}
    public void setName(String name){this.name = name;}
    public void setNumberOfContainers(int numberOfContainers) {this.numberOfContainers = numberOfContainers;}
}
