package wildflyswarm;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import wildflyswarm.jaxrs_jsp.MyController;

public class App {

  public static void main(String[] args) throws Exception {
    Swarm swarm = new Swarm();

    JAXRSArchive archive = ShrinkWrap.create(JAXRSArchive.class);

    archive.addPackage(MyController.class.getPackage());
    archive.addAsWebResource(new ClassLoaderAsset("index.jsp", App.class.getClassLoader()), "index.jsp");
    archive.staticContent();

    swarm.start(archive);
  }

}
