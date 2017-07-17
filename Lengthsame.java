package player;
import java.util.Scanner;
public class Lengthsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the string1:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
System.out.println("Enter the String2:");
String b=s.nextLine();
String e;
int c=a.length();
int d=b.length();
if(c==d){
	System.out.println(c+d);
}
if(c!=d){
	System.out.println(a.substring(a.length()-2)+b);
}
	}

}
