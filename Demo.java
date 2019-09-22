/*
data:2019.9.22
author:zouweipeng
program:¾Å¾Å³Ë·¨±í
*/
public class Demo {
	public static void main(String[] args){
		//System.out.println("run:");
		int sum = 1;
		for(int i = 1;i<=9;i++)
		{
			
			for(int j = 1;j <= i;j++)
			{
				System.out.printf("%d*%d = %2d",j,i,i*j);
				System.out.printf("\t");
			}
		}System.out.printf("\n");
		
	}
}