import java.util.*;
class user
{
void user () 
{
Scanner sc=new Scanner(System.in);
int userid;
System.out.print("enter the id: ");
userid=sc.nextInt();
String password="";
System.out.print("enter the password: ");
password=sc.next();
}
}
class registration extends user
{
void reg()
{
Scanner sc=new Scanner(System.in);
String username="";
System.out.print("enter the name: ");
username=sc.next();
String dob;
System.out.print("enter the DoB: ");
dob=sc.next();
String address="";
System.out.print("enter the address: ");
address=sc.next();
long num;
System.out.print("enter the number: ");
num=sc.nextLong();
String gender="";
System.out.print("enter the gender : ");
gender=sc.next();
System.out.print("registration completed");	
}
}
class verfication extends registration
{
void verify()
{
Scanner sc=new Scanner(System.in);
int pincode;
System.out.print("\nEnter Country Pincode: ");
pincode=sc.nextInt();
long aadhaar;
System.out.print("\nEnter Aadhaar Number: ");
aadhaar=sc.nextLong();
long a1=999999999999L,a2=100000000000L;
if((aadhaar<=a1) && (aadhaar>a2))
{
if((pincode>100000) && (pincode<=690000) )
{
	System.out.print("Verified You are an Indian");
}
else
{
	System.out.print("You are not an Indian");
}
}
else
{
	System.out.print(" Invalid Details ");
}
}	
}
class passport
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" WELCOME TO PASSPORT MANAGEMENT SYSTEM ");
		System.out.print(" \n 1 => USER SIGN-IN \n 2=> REGISTERATION \n 3=> VERIFICATION ");
		int choice;
		System.out.print("\n Enter the Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			user p1=new user();
			p1.user();
			break;
			case 2:
			registration p2=new registration();
			p2.reg();
			break;
			case 3:
			verfication p3=new verfication();
			p3.verify();
			break;
			default:
			System.out.print("invalid choice");
			break;
			
		}
	}
}