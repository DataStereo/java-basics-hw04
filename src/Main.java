public class Main {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("ID123", "Petro", "SSN123");
        employee1.setFixedMonthlyPayment(2500);
        System.out.println(employee1);

        ContractedEmployee employee2 = new ContractedEmployee("E2", "Volodymyr", "FTI1");
        employee2.setHourlyRate(50);
        employee2.setNumberOfHoursWorked(100);
        System.out.println(employee2);
    }
}
