public class TwentyEight {
    public static void main(String[] args) {
        int n=5;
        int col=2*n-1;
        int sp=n-1;
        int no=1;
        int star=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++) System.out.print("\t");

            int num=no;
            for(int j=1;j<=star;j++)
            {
                if(j==1||j==star)
                    System.out.print(num+"\t");
                else 
                    System.out.print(0+"\t");    
    
            }

            star+=2;
            sp--;
            System.out.println();
            no++;

        }
    }
}
