import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner n = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String text = n.nextLine();

        String wynik = "";
        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                wynik += Character.toLowerCase(c);
            } 
            else if (Character.isLowerCase(c)) 
             {
                wynik += Character.toUpperCase(c);
             } 
            else 
             {
                wynik += c;
             }
        }

        System.out.println("Wynik: " + wynik);
    }
}