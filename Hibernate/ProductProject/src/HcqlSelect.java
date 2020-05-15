import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class HcqlSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Criteria crt = s.createCriteria(Product.class);
		Criterion ctn = Restrictions.gt("price", new Double(300));
		crt.add(ctn);
		crt.addOrder(Order.desc("price"));
		List l = crt.list();
		Iterator it = l.iterator();
		
		while(it.hasNext())
		{
			Object o =it.next();
			Product p=(Product)o;
			
			System.out.println("Product Id :"+p.getPid());
			System.out.println("Product Name:"+p.getPname());
			System.out.println("Product Price :"+p.getPrice());
		}
		
		 
		//s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}
