public class Thirtytwo {
    public static void main(String[] args) {
        
        int n=5;
        int row=2*n-1;
        int star=1;
        int no=1;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=star;j++)
            {
                if(j%2==0)
                   System.out.print("*\t");
                else   
                  System.out.print(no+"\t");
                   
            }
            System.out.println();
            if(i<=row/2){
                star+=2;
                no++;
            }
              
            else{
                star-=2;   
                no--;
            }
                 

           System.out.println();     
        }
    }
}
