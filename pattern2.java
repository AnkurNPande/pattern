        import java.util.Scanner;


     class pattern2
{
    public static void main(String[] args)
    {       
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int row =scr.nextInt();

            System.out.println("Enter the number of column");
            int col = scr.nextInt();

        for(int i = 1; i<=row;i++)
        {
            for(int j = 1; j <=i;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}