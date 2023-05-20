import java.util.*;

class Main {
    
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n+1];
		List<List<Integer>> pascal=new ArrayList<>();
		List<Integer> first=new ArrayList();
		arr[0][1]=1;
		first.add(arr[0][1]);
		pascal.add(first);
		for(int i=1;i<n;i++)
		{
		    List<Integer> internal=new ArrayList<>();
		    for(int j=1;j<=(i+1);j++)
		    {
		        arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
		        internal.add(arr[i][j]);
		    }
		    pascal.add(internal);
		}
		System.out.println(pascal);
	}
}