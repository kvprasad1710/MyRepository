import org.hibernate.*;
import org.hibernate.cfg.*;
public class InsertClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Cheque cq = new Cheque();
		cq.setPid(1001);
		cq.setPname("kiwis");
		cq.setPrice(700);
		cq.setChqType("SBI");
		
		CreditCard cc = new CreditCard();
		cc.setPid(1002);
		cc.setPname("Apple");
		cc.setPrice(600);
		cc.setCardType("ICICI");
		s.save(cq);
		s.save(cc);
		s.beginTransaction().commit();
		sf.close();
		s.close();
	}

}
