package json.parser;

public class Employee {

    private String employeeEmail;
    private String employeeName;
    private String salary;
    private String department;

    public Employee() {
    }

    public Employee(String empEmail, String empName, String salary, String department) {
        this.employeeEmail = empEmail;
        this.employeeName = empName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpEmail() {
        return employeeEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.employeeEmail = empEmail;
    }

    public String getEmpName() {
        return employeeName;
    }

    public void setEmpName(String empName) {
        this.employeeName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}