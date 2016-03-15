package jboss.developer;

public class SecondBean implements ICommon {

  @Override
  public String getGreetings() {
    return "{\"value\" : \"SecondBean#getGreetings\"}";
  }

}
