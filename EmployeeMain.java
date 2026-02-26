package Feb26;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeService es=new EmployeeService();
        System.out.println(es.sumOfSal());
        System.out.println(es.getEmpCountByDept());
        System.out.println(es.seniorEmployee());
        System.out.println(es.empWithoutDept());
        System.out.println(es.empNameAndDuration());
        System.out.println(es.deptWithoutEmp());
        System.out.println(es.deptWithHighestCountEmp());
    }
}
