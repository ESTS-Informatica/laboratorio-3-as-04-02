public class GroundTransportation extends Transport{
    private String licensePlate;
    private static final double FEES = 0.04;
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
}
