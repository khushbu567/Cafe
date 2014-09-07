import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
class Cafe
{
	
	public String nm,iden,echar,tno;
	

	private ArrayList<User> users=new ArrayList<User>();
	private ArrayList<Table> table=new ArrayList<Table>();

	Scanner s=new Scanner(System.in);
	
	public void showTables() {
		System.out.println("hi");
		for(User user: users ){
			System.out.println(user.getName);
		}
	}

	public void checkIn() {
		System.out.println("Check in");
		System.out.println("enter your name");
	
	 	nm=s.nextLine();

		System.out.println("enter your identity");
	
	 	iden=s.nextLine();

		User user = new User(nm, iden);
		users.add(user);
	
	}
	public void showAllUsers()
	{
	}

	public void extracharge()
	{
		System.printle("enter charge");
		echar=s.nextLine();

	}
	
	public void checkOut() {
		User user = new User(nm, iden);

		System.out.println("Enter Table no:");
		tno=s.nextLine();
		user.calculatemoney();
	
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	
		String s1;


	do
	{
	
		System.out.print("\n"+"enter your choice:"+"\n"+"1.Show table list"+"\n"+"2.Check in"+"\n"+"3.Check out"+"\n"+"4.Show all user"+"\n"+"5.Extra chargez"+"\n"+"6.exit"+"\n"+"Enter Your Choice:");
 s1=s.nextLine();



	}while(s1.equals("6"));		
		
	if(s1.equals("1"))
	{
		showTables();
	}
	
	if(s1.equals("2"))
	{
	checkIn();

	}

	if(s1.equals("3"))
	{
	checkOut();
	}

	if(s1.equals("4"))
	{
	showAllUsers();
	}

	if(s1.equals("5"))
	{
	extracharge();
	}

	
	}
}
