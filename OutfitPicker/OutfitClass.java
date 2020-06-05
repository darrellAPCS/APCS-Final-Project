import java.util.ArrayList;

/**
 * Write a description of class OutfitClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OutfitClass
{
    //I initially used this class to create an ArrayList of ClothesArticle, but it didn't work because of
    //an error with the getArrayList() method and ,get() method of ArrayLists. It couldn't access the 
    //index for some reason, so I made it work with just two classes. I know it was a requirement to use
    //three classes, but I couldn't make it work.
    
    public int limit = 50;
    ArrayList<ClothesArticle> clothesList = new ArrayList<ClothesArticle>();
    //Constructor for OutfitClass that would fill the clothesList with ClothesArticle.
    public OutfitClass()
    {
        for (int i=0; i<limit; i++)
        {
            ClothesArticle article = new ClothesArticle();
            clothesList.add(article);
        }
        //System.out.println(clothesList.get(0).getStyle() + clothesList.get(0).getColor());
    }
    //getter for the limit
    public int getLimit()
    {
        return limit;
    }
    //getter used to access clothesList, because I had an error with the scope, so I used this. Both of 
    //these methods ultimately became unused, but I tried.
    public ArrayList getArrayList()
    {
        return clothesList;
    }

}
