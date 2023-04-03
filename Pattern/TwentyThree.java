public class TwentyThree {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int sp=n-1;
       
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=sp;j++) System.out.print("\t");
            int num=1;
        
            for(int j=1;j<=star;j++){ 
                System.out.print(num+"\t");
                if(j<=star/2)
                     num++;
                else 
                    num--;     

            }

            star+=2;
            sp--;
            System.out.println();
        }

    }
}
