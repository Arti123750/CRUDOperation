import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Select_DAO {
	
	public static void selectData()
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll No: ");
		StudentPOJO student=(StudentPOJO)session.load(StudentPOJO.class, sc.nextInt());
		
		System.out.println("Student class is: "+student.getSclass());
		System.out.println("Student name is: "+student.getName());
		System.out.println("Subject is: "+student.getSub());
		System.out.println("Marks is: "+student.getMarks());
		
		session.close();
		sessionfactory.close();
		tx.commit();
		System.out.println("Disply all the information of Student");
	}
}

