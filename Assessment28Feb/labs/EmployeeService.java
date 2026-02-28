package Assessment28Feb.labs;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {


// 1. Calculate average salary
       public double average(){
           return EmployeeRepository.getEmployees().stream()
                   .map(e->e.getSalary()).collect(Collectors.averagingDouble(e->e));
       }


//  2. Find employee with maximum salary in each department.
    public Map<String,String> empWithMaxSal(){
           return EmployeeRepository.getEmployees().stream()
                   .filter(e -> e.getDepartment() != null)
                   .collect(Collectors.toMap(
                           e -> e.getDepartment().getDepartmentName(),
                           e -> e,
                           (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2
                   ))
                   .entrySet()
                   .stream()
                   .collect(Collectors.toMap(
                           Map.Entry::getKey,
                           e -> e.getValue().getFirstName()
                   ));
    }


 //3.Calculate total salary per department
 public Map<String,Double> totalSal(){
     Map<String,Double>m= EmployeeRepository.getEmployees().stream()
             .filter(e -> e.getDepartment() != null)
             .collect(Collectors.groupingBy(
                     e -> e.getDepartment().getDepartmentName(),
                     Collectors.summingDouble(Employee::getSalary)
             ));
     return m;
 }


 //4. Display employee name and salary
    public Map<String,Double> empNameAndSal(){
           Map<String,Double>m=EmployeeRepository.getEmployees().stream()
                   .collect(Collectors.toMap(e->e.getFirstName()
                           +" " +e.getLastName(),Employee::getSalary));
                   return m;
    }


 // 5.Sort by salary in descending order
 public List<String> sortSalInDesc(){
           return EmployeeRepository.getEmployees().stream()
                   .sorted(Comparator.comparing(Employee::getSalary).reversed())
                   .map(e -> e.getFirstName() + " - " + e.getSalary())
                   .collect(Collectors.toList());
 }



}
