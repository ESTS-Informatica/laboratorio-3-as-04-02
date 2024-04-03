public class GroundTransportation extends Transport{
    private String licensePlate;
    private static final double FEES = 3.00;
    public GroundTransportation(String licensePlate){
        this.licensePlate = licensePlate;
        setFees(FEES);
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public double getFees(){
        return FEES;
    }
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (FEES * 0.01));
    }
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
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
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));

        return sb.toString();
    }
}
