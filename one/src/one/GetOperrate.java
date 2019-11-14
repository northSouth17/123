package one;

import java.util.Random;

public class GetOperrate {
	public int  x,y;
	public int sum;
	public char sign;
	public float getRandom(){
		Random random=new Random();
		this.x=random.nextInt(101);
		this.y=random.nextInt(101);
		return 0;
	}
	public void math()
	{
		int p;
		p=(int)(Math.random());
		if(p==1)
		{
			sign='+';
			sum=x+y;
		}
		else
		{
			sign='-';
			sum=x-y;
		}
	}
	public void print(int i)
	{
		System.out.print(i+1+":"+x+sign+y+"=\t"+"\t");
	}

}