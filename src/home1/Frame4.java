package home1;

/**
 * Created by Сергей on 14.06.2015.
 */
public class Frame4 {
    public static void main(String[] args)  {
        String str = "Love you";
        System.out.println(str.charAt(0) + str.substring(1));
        System.out.println(("a" + str).substring(0));
        System.out.println(str + "");
        System.out.println(str.substring(0,str.length()));
        System.out.println(str.replace("L","o"));
    }
}
