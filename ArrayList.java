package Jan2018;
import java.util.*;


public class ArrayList {
    public static void main(String[] args){
        //create an Array list variable:
        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        //all on one line:
        ArrayList arrayListTwo = new ArrayList();

        List<String> names = new java.util.ArrayList<String>();
        names.add("john smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        names.add(2, "jack ryan");

        for(int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        names.set(0, "John Adams");

        int a = 1;
        while(a <= 41){
            System.out.print("-");
            a++;

        }
        System.out.println();

        for(int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        names.remove(3);

        a = 1;
        while(a <= 41){
            System.out.print("-");
            a++;

        }
        System.out.println();

        for(int i = 0; i< names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }

}
