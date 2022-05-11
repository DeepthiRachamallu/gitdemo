package deepthi;

public class Array {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int [3];
		for(int i=0;i<3;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		int x[][]= {{10,20},{30,40}};
		int y[][]= {{1,2},{3,
			
			
			4}};
		int z[][]=new int[2][2];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
				System.out.println(z[i][j]);
			}
		}
		
		
		
	}
	

}
