package wildflyswarm.jaxrs_jsp;

import org.wildfly.swarm.container.Container;

public class MyContainer {

  public static Container newContainer() throws Exception {
    Container container = new Container();
    return container;
  }
}
