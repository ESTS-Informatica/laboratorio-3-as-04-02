import java.util.ArrayList;

import java.util.HashSet;
public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;
    public ShippingCompany(String name){
        this.name = name;
        inService = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Transport> getInService(){
        return inService;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        for (Transport transport : inService){
            sb.append(transport.toString());
        }
        return sb.toString();
    }
}
