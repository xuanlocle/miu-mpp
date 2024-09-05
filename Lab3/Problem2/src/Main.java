import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(1000);
        Apartment apartment2 = new Apartment(1200);
        Apartment apartment3 = new Apartment(900);
        
        Building building1 = new Building(500);
        building1.addApartment(apartment1);
        building1.addApartment(apartment2);
        
        Building building2 = new Building(300);
        building2.addApartment(apartment3);
        
        Landlord landlord = new Landlord();
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);
        
        double totalProfit = landlord.getMonthlyProfit();
        
        System.out.println("The landlord's total monthly profit is: $" + totalProfit);
    }
}
