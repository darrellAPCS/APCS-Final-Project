import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class OutfitDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OutfitDriver
{
    //main. it does everything
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);

        //asking the user
        String style = "";
        System.out.println("What style do you want? (casual, formal, athletic)");
        style = s.next();
        System.out.println("CONFIRMED: " + style);

        String color = "";
        System.out.println("What color do you want? (red, green, blue)");
        color = s.next();
        System.out.println("CONFIRMED: " + color);

        String type = "";
        System.out.println("What type do you want? (top, bottom, shoes)");
        type = s.next();
        System.out.println("CONFIRMED: " + type);

        ArrayList<ClothesArticle> matches = findMatches(style, color, type);
        //this will print out every ClothesArticle in the ArrayList that will match with the chosen 
        //piece. If there are none, it will say you have no matches.
        
        if (matches.size()>0)
        {
            for (int i=0; i<matches.size(); i++)
                System.out.println(matches.get(i).printOut());
        }
        else
            System.out.println("You don't have any matching clothes!");

    }
    //this took a long time to get right, but it essentially is just a method that finds out other 
    //articles of clothing that would go with the selected one. 

    public static ArrayList findMatches(String style, String color, String type)
    {
        // OutfitClass fits = new OutfitClass();

        ArrayList<ClothesArticle> clothesList = new ArrayList<ClothesArticle>();
        int limit = 10;
        for (int i=0; i<limit; i++)
        {
            ClothesArticle c = new ClothesArticle();
            clothesList.add(c);
        }
        //these ArrayLists eventually trickle down to the matches ArrayList and those are the ones
        //that will go with the outfit. Mayhe there's a more efficient way to do this, but my brain 
        //is too fried.
        ArrayList<ClothesArticle> matchingStyle = new ArrayList<ClothesArticle>();
        ArrayList<ClothesArticle> matchingColor = new ArrayList<ClothesArticle>();
        ArrayList<ClothesArticle> matchingType = new ArrayList<ClothesArticle>();
        ArrayList<ClothesArticle> matches = new ArrayList<ClothesArticle>();

        // for (int i=0; i<fits.getLimit(); i++)
        // {
        // ClothesArticle current = fits.getArrayList().get(i);
        // if (current.getStyle().equals(style))
        // matchingStyle.add(current);
        // }

        //will return an ArrayList of all clothesArticle that are matching style and color, but
        //a different type (because you want a top, bottom, and shoes), and it has to be clean.
        for (int i=0; i<limit; i++)
        {
            ClothesArticle current = clothesList.get(i);
            if (current.getStyle().equals(style))
                matchingStyle.add(current);
        }
        for (int i=0; i<matchingStyle.size(); i++)
        {
            ClothesArticle current = matchingStyle.get(i);
            if (current.getColor().equals(color))
                matchingColor.add(current);
        }
        for (int i=0; i<matchingColor.size(); i++)
        {
            ClothesArticle current = matchingColor.get(i);
            if (current.getType().equals(type) == false)
                matchingType.add(current);
        }
        for (int i=0; i<matchingType.size(); i++)
        {
            ClothesArticle current = matchingType.get(i);
            if (current.getClean() ==  true)
                matches.add(current);
        }

        System.out.println("");
        System.out.println("");
        return matches;
    }
}
