public class Exceptions {
    
    static class LowSalaryException extends Exception {
        public LowSalaryException(String message) {
            super(message);
        }
    }

    // Method that throws custom exception
    static void checkSalary(int salary) throws LowSalaryException {
        if (salary < 5000) {
            throw new LowSalaryException("Salary is too low!");
        } else {
            System.out.println("Salary is acceptable");
        }
    }

    public static void main(String[] args) {
        try {
            checkSalary(3000);
        } catch (LowSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
