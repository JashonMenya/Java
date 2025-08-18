package refresher_exercises.inheritance;

public class Employee extends Person {
    private int employeeId;
    private String title;

    public Employee() {
        super("JJ", 21, "Male");
        System.out.println("Employee constructor called");
    }

    public Employee(int employeeId, String title) {
        this.employeeId = employeeId;
        this.title = title;
    }

    public Employee(String name, int age, String gender, int employeeId, String title) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.title = title;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
