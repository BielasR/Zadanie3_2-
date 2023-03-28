import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner n = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String text = n.nextLine();

        String result = "";
        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                result += Character.toLowerCase(c);
            } 
            else if (Character.isLowerCase(c)) 
             {
                result += Character.toUpperCase(c);
             } 
            else 
             {
                result += c;
             }
        }

        System.out.println("Wynik: " + result);
    }
}