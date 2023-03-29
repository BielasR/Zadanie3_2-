import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner n = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String text = n.nextLine();
        int l = 0;

        String wynik = "";
        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                wynik += Character.toLowerCase(c);
                l++;
            } 
            else if (Character.isLowerCase(c)) 
             {
                wynik += Character.toUpperCase(c);
                l++;
             } 
            else 
             {
                wynik += c;
             }
        }

        System.out.println("Wynik: " + wynik);
        System.out.println("Liczba zmienionych liter: " + l);
    }
}