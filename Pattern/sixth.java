public class sixth {
    public static void main(String[] args) {
        int space=0;
        
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
         space+=2;
            System.out.println();
        }

    }
}
