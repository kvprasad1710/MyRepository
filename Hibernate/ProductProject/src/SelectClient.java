import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Object o= s.load(Product.class,new Integer(1002));
		Product p=(Product)o;
		 		
		System.out.println("Product Id :"+p.getPid());
		System.out.println("Product Name:"+p.getPname());
		System.out.println("Product Price :"+p.getPrice());
		 
		//s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}