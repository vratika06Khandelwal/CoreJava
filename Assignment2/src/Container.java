public class Container extends Cargo{
    private String containerNumber;

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public void displayContainerDetails(){
        System.out.format("%-20s %-15s %-15s %-15s %s\n", containerNumber, getLength(), getWidth(), getHeight(), getWeight());

    }
}
