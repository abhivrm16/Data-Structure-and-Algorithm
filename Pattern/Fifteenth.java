public class Fifteenth {
    public static void main(String[] args) {
        int n=5;
        int row=2*n-1;
        int star=n;
        int sp=0;

        for(int i=1;i<=row;i++)
        {
                for(int j=1;j<=sp;j++)
                {
                    System.out.print("  ");
                }

                for(int j=1;j<=star;j++)
                {
                    System.out.print("* ");
                }

                if(i>=5)
                {
                    star++;
                    sp-=2;
                }
                else
                {
                    star--;
                    sp+=2;
                }

                System.out.println();;
        }

    }
}
