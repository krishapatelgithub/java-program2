import java.io.*;
import java.util.*;
class lab22
{
	public static void main(String args[])
	{
		String str1,str2;
		String s3,s4;
		s4="";
		int l1,l2;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st name: ");
		str1=sc.nextLine();
		System.out.print("Enter 2nd name: ");
		str2=sc.nextLine();
		
		l1=str1.length();
		l2=str2.length();
		char[] c1=new char[l1];
		char[] c2=new char[l2];
		
		for(int i=0;i<l1;i++)
		{
			c1[i]=str1.charAt(i);
		}
		for(int j=0;j<l2;j++)
		{
			c2[j]=str2.charAt(j);
		}
		
		String t1,t2;
		for(int k=0;k<l1;k++)
		{
			t1=c1[k]+" ";
			t2=c2[k]+" ";
			s3=t1.concat(t2);
			s4=s4.concat(s3);
		}
		
		System.out.println(s4);
	}
}