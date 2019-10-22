import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Update_DAO {
	
	
	public static void updateData()
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no to Update: ");
		StudentPOJO student=(StudentPOJO)session.get(StudentPOJO.class, sc.nextInt());
		
		if(student!=null) 
		{
			System.out.println("Enter a marks to update: ");
			student.setMarks(sc.nextInt());
			session.update(student);
			session.flush();
			tx.commit();
			System.out.println("Record update Succesfully.....");
		}
		else
		{
			System.out.println("Record not found please enter correct RolNo");
		}
		
	}

}
