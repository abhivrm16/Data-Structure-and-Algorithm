public class TwentyTwo {
    public static void main(String[] args) {
        int  n=5;
        int col=2*n-1;
        int star=n-1;
        int sp=1;


        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=col;j++) System.out.print("*\t");
               
            }
            else
            {
                for(int j=1;j<=star;j++) System.out.print("*\t");
                for(int j=1;j<=sp;j++) System.out.print("\t");
                for(int j=1;j<=star;j++) System.out.print("*\t"); 
                star--;
                sp+=2;
            }
            System.out.println(); 
            
        }

    }
}
