package sp.in.main.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate {
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure("/sp/in/main/Config/hibernate.cfg.xml");
		return cfg.buildSessionFactory();
		
	}

}
