import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class ListCollection {
    public static void main(String[] args) {
        // LinkedList<Integer>ll=new LinkedList<>();
        // ll.addFirst(10);
        // ll.addFirst(20);
        // ll.addLast(30);
        // ll.addFirst(40);
        //System.out.println(ll);

        //print using iterator
        // Iterator<Integer>cursor=ll.iterator();
        // while(cursor.hasNext()){
        //     System.out.print(cursor.next()+" ");
        // }

        //Hashet
        // HashSet<Integer>set=new HashSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(30);
        // set.add(40);
        // for(Object ele:set){
        //     System.out.print(ele+" ");
        // }

        //treeset
        // TreeSet<Integer>set=new TreeSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(30);
        // set.add(40);
        // System.out.println(set.higher(20));
        // System.out.println(set.lower(20));
        // System.out.println(set.ceiling(20));
        // System.out.println(set.floor(20));

        //HashMap
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Priya");
        map.put(2,"Ammy");
        map.put(3,"Rathi");
        //System.out.println(map);
        // for(Map.Entry<Integer,String>entry : map.entrySet()){
        //     System.out.println("Key="+entry.getKey()+","+"value="+entry.getValue());
        // }

        for(Integer key:map.keySet()){
            System.out.println(key+","+map.get(key));
        }
    }
}
