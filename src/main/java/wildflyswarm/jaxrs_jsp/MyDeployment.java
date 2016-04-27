package wildflyswarm.jaxrs_jsp;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class MyDeployment {

  public static JAXRSArchive createDeployment() throws Exception {
    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);

    deployment.addPackage(App.class.getPackage());
    deployment.addAsWebResource(new ClassLoaderAsset("index.jsp", App.class.getClassLoader()), "index.jsp");

    return deployment;
  }
}
