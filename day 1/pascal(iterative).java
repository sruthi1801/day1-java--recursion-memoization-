import java.util.*;

class Main {
    /*public static int pascal(int i,int j)
    {
       
    }*/
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int pr=1;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<(i+1);j++){
	        if(j==0)
	         pr=1;
	        else{
	            pr=pr*(i-j+1)/j;
	        }
	        System.out.print(pr+" ");
	    }
	    System.out.println();
	}
	}
}