public class Thirtheenth {
    public static void main(String[] args) {
        int n=5;
        int sp=n-1;
        int star=1;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=star;j++)
            {
                    System.out.print("* ");
            }
            if(i>=5)
            {
                star--;
            }
            else star++;

          System.out.println();  
        }
    }
}
