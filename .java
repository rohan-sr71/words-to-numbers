import java.util.*;
class hello
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("ENTER THE NUMBER TO CONVERT");
		int k=sc.nextInt();
		System.out.println(convert(k));
		}
	}
public static String number(int x)
	{
		String str="";
		while(x!=0)
		{
		if(x==1)
		{
		  str=str+"One";
		  x=0;
		}
		else if(x==2)
		{
		  str=str+"Two";
		  x=0;
		}
		else if(x==3)
		{
		  str=str+"Three";
		  x=0;
		}
		else if(x==4)
		{
		  str=str+"Four";
		  x=0;
		}
		else if(x==5)
		{
		  str=str+"Five";
		  x=0;
		}
		else if(x==6)
		{
		  str=str+"Six";
		  x=0;
		}
		else if(x==7)
		{
		  str=str+"Seven";
		  x=0;
		}
		else if(x==8)
		{
		  str=str+"Eight";
		  x=0;
		}
		else if(x==9)
		{
		  str=str+"Nine";
		  x=0;
		}
		else if(x==10)
		{
		  str=str+"Ten";
		  x=0;
		}
		else if(x==11)
		{
		  str=str+"Eleven";
		  x=0;
		}
		else if(x==12)
		{
		  str=str+"Twelve";
		  x=0;
		}
		else if(x==13)
		{
		  str=str+"Thirteen";
		  x=0;
		}
		else if(x==14)
		{
		  str=str+"Fourteen";
		  x=0;
		}
		else if(x==15)
		{
		  str=str+"Fifteen";
		  x=0;
		}
		else if(x==16)
		{
		  str=str+"Sixteen";
		  x=0;
		}
		else if(x==17)
		{
		  str=str+"Seventeen";
		  x=0;
		}
		else if(x==18)
		{
		  str=str+"Eighteen";
		  x=0;
		}
		else if(x==19)
		{
		  str=str+"Nineteen";
		  x=0;
		}
		else if(x>=20 && x<30)
		{
		  str=str+"Twenty";
		  x=x-20;
		}
		else if(x>=30 && x<40)
		{
		  str=str+"Thirty";
		  x=x-30;
		}
		else if(x>=40 && x<50)
		{
		  str=str+"Fourty";
		  x=x-40;
		}
		else if(x>=50 && x<60)
		{
		  str=str+"Fifty";
		  x=x-50;
		}
		else if(x>=60 && x<70)
		{
		  str=str+"Sixty";
		  x=x-60;
		}
		else if(x>=70 && x<80)
		{
		  str=str+"Seventy";
		  x=x-70;
		}
		else if(x>=80 && x<90)
		{
		  str=str+"Eighty";
		  x=x-80;
		}
		else if(x>=90 && x<100)
		{
		  str=str+"Ninty";
		  x=x-90;
		}
		}
	return str;	
	}
public static String convert(int m)
{
	String str="";
	while(m!=0)
	{
	if(m>=1 && m<100)
	{
		str=str+number(m);
		m=0;
	}
	else if(m>=100 && m<1000)
	{
		str=str+number(m/100);
		str=str+"Hundred";
		m=m%100;
	}
	else if(m>=1000 && m<10000)
	{
		str=str+number(m/1000);
		str=str+"Thousand";
		m=m%1000;
	}
	else if(m>=10000 && m<100000)
	{
		str=str+number(m/1000);
		str=str+"Thousand";
		m=m%1000;
	}
	else if(m>=100000 && m<1000000)
	{
		str=str+number(m/100000);
		str=str+"Lakh";
		m=m%100000;
	}
	}
	return str;
}
}
