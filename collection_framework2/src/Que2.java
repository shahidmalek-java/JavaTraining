import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que2 {

    public static void main(String[] args) {
        List<String> oldList = new ArrayList<>();

        oldList.add("Banana");
        oldList.add("Apple");
        oldList.add("Orange");

        System.out.println("Old List : ");
        System.out.println(oldList);


        System.out.println();
        List<String> newList = new ArrayList<>();

        newList.add("Apple");
        newList.add("Orange");
        newList.add("Water Melon");

        System.out.println("New List : ");
        System.out.println(newList);

        List<String> finalList= new ArrayList<>();

       for (int i = 0 ; i < newList.size() ; i++)
       {
           if(!oldList.contains(newList.get(i)))
           {
               finalList.add(newList.get(i));
           }
       }

        System.out.println("Added : ");
        System.out.println(finalList);
        finalList.clear();



        for(int i = 0 ; i < oldList.size();i++)
        {
            if(!newList.contains(oldList.get(i)))
            {
                finalList.add(oldList.get(i));
            }
        }

        System.out.println("Removed : ");
        System.out.println(finalList);
        finalList.clear();


        for (int i = 0; i < (oldList.size()<newList.size()?oldList.size():newList.size()); i++)
        {
            if(!oldList.get(i).equals( newList.get(i)))
            {
                finalList.add("Index : "+i+ " : "+ oldList.get(i)+" -> "+ newList.get(i));
            }
        }

        System.out.println("Modified : ");
        System.out.println(finalList);



    }
}
