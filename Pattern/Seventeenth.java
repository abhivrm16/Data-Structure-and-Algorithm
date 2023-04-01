public class Seventeenth {
    public static void main(String[] args) {
        
        int n=7;
        int star=n/2;
        int sp=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }

            if(i<=n/2)
            {
                star--;
                sp=sp+4;
            }
            else{
                star++;
                sp-=4;
            }
            System.out.println();
        }
    }
}
