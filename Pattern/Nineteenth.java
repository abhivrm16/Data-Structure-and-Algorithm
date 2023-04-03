public class Nineteenth {
    public static void main(String[] args) {
        
        int n=7;
        int star=n/2;
        int sp=1;

        for(int i=1;i<=n;i++)
        {

            if(i==1||i==n)
            {
                for(int j=1;j<=n;j++)
                    System.out.print("* ");
            }

            else{

                for(int j=1;j<=star;j++)
                {
                    System.out.print("* ");
                }

                
                for(int j=1;j<=sp;j++)
                {
                    System.out.print("  ");
                }
                

                for(int j=1;j<=star;j++)
                {
                    System.out.print("* ");
                }
                if(i<=3)
                {
                    star--;
                    sp+=2;
                }
                else
                {
                    star++;
                    sp-=2;
                }
            }

            System.out.println();
        }

    }
}
