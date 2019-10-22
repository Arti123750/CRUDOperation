import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Delete_DAO {
	public static  void deleteData()
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Rollno for deleting a record");
		StudentPOJO student=(StudentPOJO)session.get(StudentPOJO.class, sc.nextInt());
		
		if(student !=null)
		{
			session.delete(student);
			session.flush();
			tx.commit();
			System.out.println("Record deleted Succesfully....");
		}
		else
		{
			System.out.println("record not found please enter correct RollNo");
		}
	}

}
