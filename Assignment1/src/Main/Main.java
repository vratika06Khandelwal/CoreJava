package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String shipperName,arrivalPort,departurePort,modeOfTrasportation;
        Float totalWeight;
        Shipment ship[];
        Scanner scan = new Scanner(System.in);
        System.out.println("====================SHIPMENT MANAGEMENT SYSTEM======================");
        //Taking
        System.out.println("Enter the number of shipments :");
        int n =scan.nextInt();
        ship=new Shipment[n];
        int i=0;
        //Taking Details of n number of Shipments
        while(i<n)
        {

            System.out.println("Enter Shipment "+ (i+1) +" Details :");
            System.out.println("Enter the shipper name :");
            shipperName=scan.next();
            System.out.println("Enter the mode of transportation :");
            modeOfTrasportation= scan.next();
            System.out.println("Enter the total weight :");
            totalWeight=scan.nextFloat();
            System.out.println("Enter the arrival port :");
            arrivalPort=scan.next();
            System.out.println("Enter the departure port :");
            departurePort= scan.next();
            ship[i]=Shipment.createNewShipment(i,shipperName,modeOfTrasportation,totalWeight,arrivalPort,departurePort);
        i++;
        }

       // System.out.println("===================");
        //Shipment Details using streams

        System.out.println("Shipment Details are........");

        System.out.println(String.format("%-15s%-15s%-25s%-15s%-20s%s","Id" ,"ShipperName","ModeOfTransportation","TotalWeight","ArrivalPort","DeparturePort" ));

        Arrays.stream(ship).forEach(shipment -> System.out.println(shipment.toString()));





    }
}
