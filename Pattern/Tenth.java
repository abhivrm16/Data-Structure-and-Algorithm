public class Tenth {
    public static void main(String[] args) {
        
        int n=5;

        int star=2*n-1;
        int sp=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
        
            star-=2;
            sp++;
            System.out.println();
        }


    }
}
