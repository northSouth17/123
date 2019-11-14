package one;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		int count=0,j;
		ArrayList<GetOperrate> o=new ArrayList<GetOperrate>();
		System.out.println("下面是生成的50到100以内的加减法题目：");
		for(int i=0;;i++)
		{
			GetOperrate init=new GetOperrate();
			init.getRandom();
			init.math();
			if(init.sum>0&&init.sum<100&&count==0)
			{
				o.add(init);
				count++;
			}
			else if(init.sum>0&&init.sum<100)
			{
				for(j=0;j<o.size();j++)
				{
					if((o.get(j).x!=init.x&&o.get(j).y!=init.y&&o.get(j).sign!=init.sign))
					{
						continue;
					}
				}
				if(j>=o.size())
				{
					o.add(init);
					count++;
				}
			}
			if(count==50)break;
		}
		for(int i=0;i<50;i++)
		{
			o.get(i).print(i);
			if(i%5==0)
			System.out.println();
		}
		System.out.println();
		System.out.println("下面是生成的50到100以内的加减法题目：");;
		for(int i=0;i<50;i++)
		{
			System.out.print(i+1+":"+o.get(i).sum+"\t");
			if(i%5==0)
			System.out.println();
		}

	}

}
