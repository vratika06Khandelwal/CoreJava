package Main;

public class Shipment {
    // Shipment has a Following Details
    private int id;
    private String shipperName;
    private String modeOfTransportation;
    private  Float totalWeight;
    private String arrivalPort;
    private String departurePort;

    private static int nextShipmentId=1000;

    public Shipment(int id,String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort) {
        this.id = nextShipmentId++;
        this.shipperName=shipperName;
        this.modeOfTransportation=modeOfTransportation;
        this.totalWeight=totalWeight;
        this.arrivalPort=arrivalPort;
        this.departurePort=departurePort;
    }

    public static Shipment createNewShipment(int id, String shipperName, String modeOfTransportation,
                                             float totalWeight, String arrivalPort, String departurePort){

        Shipment shipment = new Shipment(id, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);

        return shipment;
    }

    @Override
    public String toString(){
        return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,this.totalWeight.toString()+"Kg",this.arrivalPort,this.departurePort);
    }
}
