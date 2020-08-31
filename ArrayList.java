import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList names=new ArrayList();
        names.add("Raja");
        names.add("Choudary");
        names.add("Malik");
        names.add("Bhatti");

        names.add(1,"Mirza");

        names.set(1, "Gujjar");
        names.remove(2);
        int size= names.size();

        for(int i=0;i<size;i++){
            System.out.println(names.get(i));
        }
        System.out.println(names.contains("John"));
        names.clear();

        //////////////////Integer Type//////////////////////
        ArrayList grades=new ArrayList();
        grades.add(100);
        grades.add(90);
        grades.add(80);
        System.out.println(grades.get(0));
        System.out.println(grades.size());
        for(Object item:grades){
            System.out.println(item);
        }

    }
}
