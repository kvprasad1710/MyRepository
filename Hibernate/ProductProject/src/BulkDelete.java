import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class BulkDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		String vsql="delete from Product p where p.price=?";
		Query q = s.createQuery(vsql);
		q.setParameter(0,new Double(700));
		
	/*	List l = q.list();
		
		Iterator it = l.iterator();
		System.out.println("Pid		Pname	Price");
		System.out.println("===========================");
		
		while(it.hasNext())
		{
			Object o=it.next();
			Product p = (Product)o;
			System.out.println(p.getPid()+"    "+p.getPname()+"    "+p.getPrice());
			
		}
		*/
		int n=q.executeUpdate();
		System.out.println(n +"   Records deleted");
		s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}

