/**
 * AdapterPatternPower
 */
public class AdapterPatternPower {

  public static void main(String[] args) {
    Power BuildingA = new Building();
    PowerAdapter buildingAdapter = new PowerAdapeterImpl(BuildingA);
    System.out.println("Rumah ini memiliki Watt sebesar " + buildingAdapter.getPower() + "Watt");
  }
}