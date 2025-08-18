package refresher_exercises.code_challenges.employee_report;

public class AnswerEr {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager(),
                new Engineer(),
                new Manager(),
                new Intern(),
                new Intern(),
                new Manager(),
                new Engineer(),
                new Engineer(),
                new Engineer(),
                new Engineer()
        };

        EmployeeReport rp = generateReport(employees);
        System.out.println(rp);

    }

    static EmployeeReport generateReport(Employee[] employees) {

        int managerCount = 0;
        int engineerCount = 0;
        int internCount = 0;

        for (int i = 0; i < employees.length; i++) {
            /*
             * TODO: Determine the employee's role
             * and increase the count appropriately
             * 
             */
            if (employees[i] instanceof Manager) {
                managerCount += 1;
            } else if (employees[i] instanceof Engineer) {
                engineerCount += 1;
            } else if (employees[i] instanceof Intern) {
                internCount += 1;
            }
        }

        return new EmployeeReport(managerCount, engineerCount, internCount);
    }
}
