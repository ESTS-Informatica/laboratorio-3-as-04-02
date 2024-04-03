public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;

    private static final double FEES = 4.00;

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
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (FEES * 0.01));
    }

    @Override
    public String getTransportType() {
        return "Transporte Aereo";
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", this.getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", FEES));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", this.getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %s\n", "NºContentores", getNumberOfContainers()));

        return sb.toString();
    }
}
