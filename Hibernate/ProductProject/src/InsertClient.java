import org.hibernate.*;
import org.hibernate.cfg.*;
public class InsertClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Product p = new Product();
		p.setPid(1004);
		p.setPname("kiwis");
		p.setPrice(700);
		
		s.save(p);
		s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}
