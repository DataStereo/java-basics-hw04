public class Employee implements Payable{
  private String employeeId;
  private String name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return calculatePay();
  }

  @Override
  public String toString() {
    return "Employee name > " + name + " Employee id > " + employeeId + " with salary > " + String.format("%.2f", getAverageMonthlySalary());
  }

  @Override
  public double calculatePay() {
    return 0; // employee is a base class so it doesn't calculate pay directly;
  }
}
