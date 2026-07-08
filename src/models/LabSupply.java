package models;

public class LabSupply {
  private String code;
  private String manager;
  private int stock;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public LabSupply(String code, String manager, int stock) {
    this.code = code;
    this.manager = manager;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "LabSupply [code=" + code + ", manager=" + manager + ", stock=" + stock + "]";
  }

}
