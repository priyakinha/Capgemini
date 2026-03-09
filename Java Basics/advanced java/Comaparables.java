import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

class Job{
  int priority;
  String title;
  double salary;

Job(int priority,String title,double salary){
    this.priority=priority;
    this.title=title;
    this.salary=salary;
}
     public String toString() {
        return priority + " " + title + " " + salary;
    }

}
//class CompareByPriority implements Comparator<Job>{
    // @Override
    // public int compare(Job J1,Job J2){
    //     return J1.priority-J2.priority;
    // }

    // @Override
    // public int compare(Job J1,Job J2){
    //     return J1.title.compareTo(J2.title);
    // }

//    @Override
//     public int compare(Job J1,Job J2){
//         return Double.compare(J1.salary,J2.salary);
//     }
   
//}
public class Comaparables {  

    public static void main(String[] args) {
        LinkedList<Job>jobs=new LinkedList<>();
        jobs.add(new Job(2,"Developer",5000));
        jobs.add(new Job(1,"Analyst",8000));
        jobs.add(new Job(3,"Tester",4000));
        System.out.println("Before sorting: ");
        for(Job job:jobs){
            System.out.println(job);
        }
        //Collections.sort(jobs,new CompareByPriority());
        // Collections.sort(jobs,(a,b)->a.priority-b.priority);

        jobs.sort(Comparator.comparing(obj->obj.salary));

        System.out.println("After sorting: ");
        for(Job job:jobs){
            System.out.println(job);
        }
    }<
}
