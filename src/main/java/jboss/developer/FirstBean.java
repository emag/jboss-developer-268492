package jboss.developer;

public class FirstBean implements ICommon {

  @Override
  public String getGreetings() {
    return "{\"value\" : \"FirstBean#getGreetings\"}";
  }

}
