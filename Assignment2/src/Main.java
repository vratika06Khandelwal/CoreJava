import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String containerdetails;
        List<Container> containers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Containers :");
        int n =scan.nextInt();
        int i=0;
        Container container_new ;
        //Taking Details of n number of Shipments
        while(i<n) {

            System.out.println("Enter Container " + (i + 1) + " Details :");
            containerdetails=scan.next();
            String[] containerList = containerdetails.split(",");
            container_new =new Container();
            container_new.setContainerNumber(containerList[0]);
            container_new.setLength(Float.valueOf(containerList[1]));
            container_new.setWidth(Float.valueOf(containerList[2]));
            container_new.setHeight(Float.valueOf(containerList[3]));
            container_new.setWeight(Double.valueOf(containerList[4]));
            containers.add(container_new);
            i++;
        }
        System.out.println("Container Details are........");
        System.out.format("%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width", "Height", "Weight");
        containers.stream().forEach(container ->container.displayContainerDetails());

    }
}
