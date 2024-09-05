import java.util.ArrayList;
import java.util.List;

class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double getProfit() {
        double totalRent = 0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }
}