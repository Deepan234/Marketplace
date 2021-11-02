import java.util.Scanner;

public class ThreadJava  {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String erica = sc.nextLine();
	String bob = sc.nextLine();
	char[] a = erica.toCharArray();
	char[] b = bob.toCharArray();
	int count1=0;
	int count2=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='E')
		{
		count1+=1;
	     }
		if(a[i]=='M')
		{
		count1+=3;
	     }
		if(a[i]=='H')
		{
		count1+=5;
	     }
	}
	for(int i=0;i<b.length;i++)
	{
		if(b[i]=='E')
		{
		count2+=1;
	     }
		if(b[i]=='M')
		{
		count2+=3;
	     }
		if(b[i]=='H')
		{
		count2+=5;
	     }
	}
	if(count1>count2)
	{
		System.out.println("erica");
	}
	else if(count1<count2)
	{
		System.out.println("bob");
	}
	else if (count1==count2)
	{
		System.out.println("Tie");
	}
	
	}

}