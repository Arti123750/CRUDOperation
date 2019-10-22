import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for inserting data into database");
		System.out.println("2 for selecting data from database");
		System.out.println("3 for updating data from database");
		System.out.println("4 for deleting data from database");
		System.out.println("Enter your choice");
		
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			Student_Insert_DAO.insertData();
		}
			break;
		case 2:
		{
			Student_Select_DAO.selectData();
		}
		break;	
		case 3:
		{
			Student_Update_DAO.updateData();
		}
		break;
		case 4:
		{
			Student_Delete_DAO.deleteData();
		}
		break;
		default:
			System.out.println("Invalid Choice Please enter correct Choice..");
	}

	}
}
