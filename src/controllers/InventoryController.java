package controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.LabSupply;

public class InventoryController {

  /*
   * Definir tipo de retorno
   * Seleccionar la meejor implementacion de la estructura correcta
   * Implementar logica
   */

  public Set<LabSupply> filterAndSortSupplies(List<LabSupply> supplies, int minimumStock) {
    Set<LabSupply> lab = new TreeSet<>(
        (c1, c2) -> {
          int stock = Integer.compare(c2.getStock(), c1.getStock());
          if (stock != 0) {
            return stock;
          }
          int code = c1.getCode().compareToIgnoreCase(c2.getCode());
          return code;
        });
    for (LabSupply dLap : supplies) {
      if (dLap.getStock() >= minimumStock) {
        lab.add(dLap);
      }
    }
    return lab;
  }

  public Map<String, Set<String>> groupCodesByStock(List<LabSupply> supplies) {
    Map<String, Set<String>> map = new HashMap<>();
    Set<String> h = new HashSet<>();
    Set<String> m = new HashSet<>();
    Set<String> l = new HashSet<>();

    String high = "HIGH";
    String medium = "MEDIUM";
    String low = "LOW";
    for (LabSupply stock : supplies) {
      int stoc = stock.getStock();
      String clave = stock.getCode();
      if (stoc >= 50) {
        map.put(high, new HashSet<>());
        map.get(high).add(clave);
      }
      if (stoc >= 20 && stoc <= 50) {
        map.put(high, new HashSet<>());
        map.get(medium).add(clave);
      }
      if (stoc <= 20) {
        map.get(low).add(clave);
        map.put(high, new HashSet<>());
      }
    }
    return map;
  }
}
