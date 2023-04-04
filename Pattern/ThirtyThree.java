public class ThirtyThree {
    public static void main(String[] args) {
        int n=10;
        int row=n;
        int sp=n-1;
        int star=1;


        int num=10;
        for(int i=1;i<=n;i++)
        {

              for(int j=1;j<=sp;j++)
              {
                System.out.print("\t");
              }

              int no=num;
              for(int j=1;j<=star;j++){
                    if(j==star/2+1)
                       System.out.print(0+"\t");
                    else
                       System.out.print(no+"\t");
                    
                    if(j<=star/2)   
                        no++;   
                    else
                        no--;   
              }
               
              sp--;
              star+=2;
              num--;
              System.out.println();
        }


    }
}
