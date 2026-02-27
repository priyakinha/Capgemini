package Feb26;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

//Q-1
    public double sumOfSal() {
       //return EmployeeRepository.getEmployees().stream().collect(Collectors.summingDouble(e->e.getSalary()));
       return EmployeeRepository.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.summingDouble(e->e));
    }
//Q-2
    public Map<String,Long> getEmpCountByDept(){
        Map<String,Long>m=EmployeeRepository.getEmployees().stream()
                .filter(e->e.getDepartment()!=null).map(e->e.getDepartment().getDepartmentName())
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

    return m;
    }
//Q3
    public Employee seniorEmployee() {
        return EmployeeRepository.getEmployees().stream().min(Comparator.comparing(Employee::getHireDate)).orElse(null);
    }


//Q-4
public List<String> empNameAndDuration(){
        List<String>li= EmployeeRepository.getEmployees()
                .stream().map(e->{
                    Period p= Period.between(e.getHireDate(), LocalDate.now());
                    int totalMonth=p.getYears()*12+p.getMonths();
                    return e.getFirstName()+"\t"+"Total Month: "+totalMonth+" Total Days: "+p.getDays();
                }).toList();
        return li;

}


//Q5
    public List<String> empWithoutDept(){
        return EmployeeRepository.getEmployees().stream()
                .filter(e->e.getDepartment()==null)
                .map(e->e.getFirstName()).collect(Collectors.toList());
    }


//Q-6
    public List<String>deptWithoutEmp(){
        return EmployeeRepository.getDepartments().stream()
                .filter(dept ->
                        EmployeeRepository.getEmployees().stream()
                                .noneMatch(emp -> dept.equals(emp.getDepartment())))
                .map(dept -> dept.getDepartmentId() + " - " + dept.getDepartmentName())
                .toList();
    }


//Q-7
    public String deptWithHighestCountEmp(){
        return EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .get()
                .getKey();

    }
}
