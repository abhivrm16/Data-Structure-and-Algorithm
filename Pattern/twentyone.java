public class twentyone {
    public static void main(String[] args) {
        int n=5;
        int col=2*n-1;
        int sp=2*n-3;
        int star=1;

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=star;j++) System.out.print("*\t");


            for(int j=1;j<=sp;j++) System.out.print("\t");

            if(i==5) star--; 
            for(int j=1;j<=star;j++) System.out.print("*\t");

           star++;
           sp-=2;
           System.out.println();
        
        }
    }
    
}
