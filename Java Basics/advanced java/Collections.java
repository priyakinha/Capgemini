import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collections{
    public static void main(String[] args) {
        // Object[]obj={1,"A",'a'};
        // for(Object ele:obj){
        //     System.out.print(ele+" ");
        // }

    //    TreeSet t=new TreeSet();
    //    t.add(1);
    //    t.add(null);
    //    System.out.println(t);


    ArrayList<Integer> al=new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    
    for(Integer ele:al){
        if(ele.equals(2)){
            al.remove(ele);
        }
        System.out.println(ele);
    }

//   CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
//     al.add(1);
//     al.add(2);
//     al.add(3);
    
//     for(Object ele:al){
//         if(ele.equals(1)){
//             al.remove(ele);
//         }
//         System.out.println(ele);
//     }


//   ArrayList<Integer> al=new ArrayList<>();
//     al.add(1);
//     al.add(2);
//     al.add(3);
    
//     for(Object ele:al){
//         if(ele.equals(1)){
//             al.set(1,6);
//         }
//         System.out.println(ele);
//     }

    }
}