package home1;

/**
 * Created by Сергей on 14.06.2015.
 */
public class Frame3 {
    public static void main(String[] args)  {
        long data = System.currentTimeMillis() / 1000 / 3600 / 24;
        long hors = System.currentTimeMillis() / 1000 / 3600;
        long minut = System.currentTimeMillis() / 1000 / 60;
        long second = System.currentTimeMillis() / 1000;
        System.out.print("D:" + data + " ");
        System.out.print("H:" + hors + " ");
        System.out.print("M:" + minut + " ");
        System.out.print("S:" + second);
    }
}
