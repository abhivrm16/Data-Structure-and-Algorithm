public class Eleventh {
    public static void main(String[] args) {
        int n=5;
        int sp=n-1;
        int star=1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=star;j++)
            {
                if(j%2==0)
                {
                    System.out.print("! ");
                    //System.out.print("  ")
                }
                else
                System.out.print("* ");
            }


            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            sp--;
            star+=2;
            System.out.println();
        }
    }
}
