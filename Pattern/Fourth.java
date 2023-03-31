

public class Fourth {
    public static void main(String[] args) {
    //    int n=5;

    //    for(int i=1;i<=n;i++)
    //    {
           
    //        for(int j=1;j<=(n-i);j++)
    //        {
    //            System.out.print("  ");
    //        }
           
    //        for(int k=1;k<=i;k++)
    //        {
    //            System.out.print("*  ");
    //        }
           
    //        System.out.println();
    //    }
    int rows = 5;
    for(int i=1;i<=5;i++)
    {     // Print spaces before the asterisks in each row
        for (int j = 1; j <= (rows - i); j++) {
            System.out.print("  ");
        }

        // Print asterisks in each row
        for (int k = 1; k <= i; k++) {
            System.out.print(" *");
        }

        // Move to the next line
        System.out.println();
    }
    
}
}
