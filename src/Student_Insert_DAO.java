import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Insert_DAO {
	public static void insertData() {
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory sessionfactory=configuration.buildSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
			
	String choice="no";
	Scanner sc=new Scanner(System.in);
	do {
		tx=session.beginTransaction();
	StudentPOJO student=new StudentPOJO();
	System.out.println("Enter Student Roll No: ");
	student.setRollNo(sc.nextInt());
	System.out.println("Enter Student Class: ");
	student.setSclass(sc.next());
	System.out.println("Enter Student Name: ");
	student.setName(sc.next());
	System.out.println("Enter Subject Name: ");
	student.setSub(sc.next());
	System.out.println("Enter Student Marks: ");
	student.setMarks(sc.nextInt());
	session.save(student);
	session.flush();
	tx.commit();
	System.out.println("Your record inserted succesfully....");
	System.out.println("Do you want insert record agian (Y/N)");
	choice=sc.next();
	}
	while(choice.equalsIgnoreCase("Y")|choice.equalsIgnoreCase("Yes"));
	session.close();
	sessionfactory.close();
}
}

