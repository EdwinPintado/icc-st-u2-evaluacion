import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import controllers.InventoryController;
import models.LabSupply;

public class App {
    public static void main(String[] args) throws Exception {
        List<LabSupply> supplies = new ArrayList<>();
        supplies.add(new LabSupply("IN-205-104", "Ana Torres", 80));
        supplies.add(new LabSupply("IN-201-101", "Luis Mora", 15));
        supplies.add(new LabSupply("IN-208-108", "Carlos Vega", 45));
        supplies.add(new LabSupply("IN-201-101", "Luis Mora", 15));
        supplies.add(new LabSupply("IN-203-103", "Mateo Rojas", 8));
        supplies.add(new LabSupply("IN-201-101", "Luis Mora", 15));
        supplies.add(new LabSupply("IN-203-103", "Mateo Rojas", 15));
        supplies.add(new LabSupply("IN-204-105", "Luis Peralta", 10));
        InventoryController controller = new InventoryController();
        Set<LabSupply> datos = controller.filterAndSortSupplies(supplies, 10);
        System.out.println("\nEJERCICIO: filterAndSortSupplies: \n");
        System.out.println("============ DATOS ============");
        for (LabSupply lap : datos) {
            System.out.println(lap);
        }
        System.out.println();

    }
}
