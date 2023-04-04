public class Thirty {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++)
        {
            int num=5;
            for(int j=1;j<=5;j++)
            {
                if(j==n+1-i)
                     System.out.print("*"+"\t");
                else
                    System.out.print(num+"\t");
                 
                num--;    
            }
            System.out.println();
        }
    }
}
