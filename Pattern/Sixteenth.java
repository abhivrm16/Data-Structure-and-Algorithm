public class Sixteenth {
    public static void main(String[] args) {
        
        int n=5;

        int row=2*n-1;

        int star=n;
        int sp=n-1;
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
            if(i<5)
            {
                sp--;
                star--;
            }
            else{
                sp++;
                star++;
            }

            System.out.println();
        }

    }
}
