/**
 * PowerAdapeterImpl
 */
public class PowerAdapeterImpl implements PowerAdapter {
  private Power buildingA;

  public PowerAdapeterImpl(Power buildingA){
    this.buildingA = buildingA;
  }
  
  @Override
  public double getPower(){
    double ampere = buildingA.getPower();
    return ConvertAmperetoWatt(ampere);
  }

  private double ConvertAmperetoWatt(double ampere){
    return ampere * 120;
  }

}