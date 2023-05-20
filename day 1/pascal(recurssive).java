import java.util.*;

class Main {
    public static int pascal(int i,int j)
    {
       if(i==j||j==0||i==0)
        return 1;
      else{
          return pascal(i-1,j)+pascal(i-1,j-1);
      }
    }
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<(i+1);j++){
		        System.out.print(pascal(i,j)+" ");
		    }
		    System.out.println();
		}
	}
}

