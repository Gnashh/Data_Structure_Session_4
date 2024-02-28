import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
            colors.add("Blue");
            colors.add("Green");
            colors.add("Red");
            colors.add("Black");
            colors.add("White");

        for (String color : colors){
            System.out.println(color);
        }

        colors.add(2,"Rainbow");
        colors.remove(1);

        System.out.println(colors);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color with capital for first letter : ");
        String mycolor = sc.next();
        searchColor(colors,mycolor);
    }

    public static void searchColor(ArrayList<String> colors, String mycolor){
        if (colors.contains(mycolor)){
                System.out.println(mycolor + " is inside the array.");
            }
            else {
                System.out.println(mycolor + " is not inside the array.");
            }
        }
    }
