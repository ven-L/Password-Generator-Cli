/*
* Password.java
* @author Laxamana, Venell
* 
*/

import java.util.Random;

public class Password 
{
    //*Instance variable/s */
    private String password;

    //*Class variables */
    private final char[] ALPHABETS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private final char[] NUMBERS = "0123456789".toCharArray();

    private  final char[] SPECIAL_CHARACTERS = "!@#$%^&*()_+-={}[]<>?".toCharArray();

    private Random random = new Random();

    public Password(String newPassword)
    {
        this.password = newPassword;
    }
    //*End of Constructor() */
    
    public String randomPassword(int length)
    {
        String output = "";
        String[] CHARACTER_TYPES = {"ALPHABET","NUMBER","SPECIAL_CHARACTERS"};
        
        for (int i = 0; i < length; i++)
        {
            String character_type = CHARACTER_TYPES[random.nextInt(CHARACTER_TYPES.length)];

            switch (character_type)
            {
                case "ALPHABET" -> output += ALPHABETS[random.nextInt(25)];
                case "NUMBER" -> output += NUMBERS[random.nextInt(9)];
                case "SPECIAL_CHARACTERS" -> output += SPECIAL_CHARACTERS[random.nextInt(20)];
            }
        }

        return output;
    }
    //*End of randomPassword() */

    public void set(String newPassword)
    {
        this.password = newPassword;
    }
    //*End of set() */

    public String get()
    {
        return this.password;
    }
    //*End of get() */
}
//*End of Password.java */

