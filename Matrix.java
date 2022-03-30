import java.util.*;

public class Matrix
{
	public static void main(String args[])
	{
		int m1,n1,m2,n2,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows of first matrix:");
		m1=s.nextInt();
		System.out.println("Enter the number of columns of first matrix:");
		n1=s.nextInt();
	
		System.out.println("Enter the number of rows of second matrix:");
		m2=s.nextInt();
		System.out.println("Enter the number of columns of second matrix:");
		n2=s.nextInt();
		if(m1==m2 && n1==n2)
		{
		int matrix1[][]=new int[m1][n1];
		int matrix2[][]=new int[m2][n2];
		System.out.println("Enter the elements of first matrix");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for(i=0;i<m1;i++)
		{
			
			for(j=0;j<n1;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Matrix 2:");
		for(i=0;i<m2;i++)
		{
			
			for(j=0;j<n2;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.print("\n");
		}
		int res[][]=new int[m1][n1];
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n2;j++)
			{
				for(k=0;k<m2;k++)
				{
					res[i][j]=matrix1[i][j]+matrix2[i][j];	
				}
			}
		}
		System.out.println("Resultant Matrix: ");
		for(i=0;i<m1;i++)
		{
			
			for(j=0;j<n2;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.print("\n");
		}
		}
		else
		{
			System.out.println("Matrix addition is not possible");
		}
	}
}
