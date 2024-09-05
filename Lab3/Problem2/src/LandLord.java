import java.util.ArrayList;
import java.util.List;

class Landlord {
    private List<Building> buildings;

    public Landlord() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double getMonthlyProfit() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.getProfit();
        }
        return totalProfit;
    }
}