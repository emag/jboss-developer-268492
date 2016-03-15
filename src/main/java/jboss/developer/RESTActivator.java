package jboss.developer;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class RESTActivator extends Application {

  private Set<Object> singletons = new HashSet<>();
  private Set<Class<?>> empty = new HashSet<>();

  public RESTActivator() {
    boolean useSecond = Boolean.parseBoolean(System.getProperty("use.second", "false"));

    if (useSecond) {
      singletons.add(new SecondBean());
    } else {
      singletons.add(new FirstBean());
    }

  }

  @Override
  public Set<Class<?>> getClasses() {
    return empty;
  }

  @Override
  public Set<Object> getSingletons() {
    return singletons;
  }

}
