import java.lang.Math;

public class TestLogicQANo3 
{ 
	public static void printNums(int n) 
	{ 
		int i, j,num; 
		for(i=20; i>n; i--) 
		{ 
			num=10; 
			for(j=20; j>=i; j--) 
			{ 
				System.out.print(num+ " "); 
				num--; 
			} 
			System.out.println(); 
		} 
	} 
	public static void main(String args[]) 
	{ 
		int n = 10; 
		printNums(n); 
	} 
}
