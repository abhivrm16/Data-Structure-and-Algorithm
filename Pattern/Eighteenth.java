public class Eighteenth {
    public static void main(String[] args) {
        int n=7;
        int star=1;
        int sp=n/2;
        for(int i=1;i<=n;i++)
        {
            for(int  j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }

            if(i<=n/2)
            {
                star+=2;
                sp--;
            }
            else{
                star-=2;
                sp++;
            }
            System.out.println();

        }
    }
}
