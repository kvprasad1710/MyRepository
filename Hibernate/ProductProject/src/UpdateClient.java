import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Object o= s.load(Product.class,new Integer(1002));
		Product p=(Product)o;
		 		
		p.setPname("Grapes");
		 
		
		//s.save(p);
		s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}
