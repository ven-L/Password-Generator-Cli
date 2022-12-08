/*
* App.java
* @author Laxamana, Venell
* 
*/

import java.util.Scanner;

public class App
{
    //*class variables*/
    private static Scanner scan = new Scanner(System.in);

    private static boolean toRepeat = true;

    public static void main(String[] args)
    {
        do
        {
            createNewRandomPassword();
            createAnother();
        }
        while (toRepeat);
    }
    //*End of main()*/
    
    private static int askForLength()
    {
        System.out.print("Length of password : ");
        var length = scan.nextInt();
        return length;
    }
    //*End of askForLenght() */

    private static void createNewRandomPassword()
    {
        Password password = new Password(null);
        password.set(password.randomPassword(askForLength()));
        display(password);
    }
    //*End of createNewRandomPassword() */

    private static void display(Password password)
    {
        System.out.println("This is you new password : " + password.get());
    }
    //*End of display() */

    private static void createAnother()
    {
        var choice = "";
        
        System.out.print("App : Would you like to create a another? Y/N -> ");
        scan.nextLine();
        choice = scan.nextLine();
        if (choice.equalsIgnoreCase("Y"))
        {
            
        }
        else if (choice.equalsIgnoreCase("N"))
        {
            System.exit(0);
        }
    }
    //*End of createAnother() */
}
//*End of App.java */
