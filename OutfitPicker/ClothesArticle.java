import java.util.ArrayList;
public class ClothesArticle
{
    String type = pickType();
    String color = pickColor();
    String style = pickStyle();
    boolean isClean = pickClean();

    //constructor for ClothesArticle. called multiple times in the program to get a list of clothes.
    public ClothesArticle()
    {
        type = pickType();
        color = pickColor();
        style = pickStyle();
        isClean = pickClean();
        //System.out.println(type +", "+ color +", "+ style +", "+ isClean);
    }
    //called in the driver to print out all the matching ClothesArticle. 
    public String printOut()
    {
        return (style +", "+ color +", "+ type +", "+ isClean);
    }

    //setters methods below *************************************************
    public String pickType()
    {
        int val = (int)(Math.random()*3);
        if (val == 0)
            return "top";
        else if (val == 1)
            return "bottom";
        else 
            return "shoes";
    }

    public String pickColor()
    {
        int val = (int)(Math.random()*3);
        if (val == 0)
            return "red";
        else if (val == 1)
            return "green";
        else 
            return "blue";
    }

    public String pickStyle()
    {
        int val = (int)(Math.random()*3);
        if (val == 0)
            return "casual";
        else if (val == 1)
            return "athletic";
        else 
            return "formal";
    }

    public boolean pickClean()
    {
        int val = (int)(Math.random()*2);
        if (val == 0)
            return false;
        else
            return true;
    }

    //getters methods below ****************************************
    public String getType()
    {
        return type;
    }

    public String getColor()
    {
        return color;
    }

    public String getStyle()
    {
        return style;
    }

    public boolean getClean()
    {
        return isClean;
    }

}
