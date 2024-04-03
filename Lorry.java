public class Lorry extends GroundTransportation{
    private int numberOfPallets;
    private int trailers;
    public Lorry(int numberOfPallets, int trailers, String licensePlate){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    public int getTrailers(){
        return trailers;
    }
    public String getLicencePlate(){
        return getLicensePlate();
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Matricula", this.getLicensePlate()));
        sb.append(String.format("%15s: %d\n", "Numero de Paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %d\n", "Numero de Atrelados", this.trailers));


        return sb.toString();
    }
}
