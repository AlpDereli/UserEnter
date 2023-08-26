import java.util.Scanner;
public class Enter {
    public static void main(String[] args) {
        String s3;
        Scanner take = new Scanner(System.in);
        System.out.println("Username: ");
        String s = take.nextLine();
        System.out.println("Password: ");
        String s2 = take.nextLine();
        if(s.equals("Alp") && s2.equals("Alp123"))
        {
            System.out.println("Successfully entered");
        }
        else {
            System.out.println("Cannot entered to the system");
            if (!s2.equals("Alp123"))
            {
                System.out.println("Change Password(1)");
                int i = take.nextInt();
                if (i == 1)
                {
                    System.out.println("Enter new password: ");
                    s3 = take.nextLine();
                    if(!s3.equals("Alp123") && !s3.equals(s2))
                    {
                        System.out.println("Password changed");
                    }
                    else {
                        System.out.println("Password cannot changed");
                    }
                }
            }
        }
    }
}
