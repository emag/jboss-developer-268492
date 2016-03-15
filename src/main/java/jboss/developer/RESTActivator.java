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
    singletons.add(new FirstBean());
//    singletons.add(new SecondBean());
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
