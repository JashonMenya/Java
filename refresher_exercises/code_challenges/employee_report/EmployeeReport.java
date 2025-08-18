package refresher_exercises.code_challenges.employee_report;

class EmployeeReport {
    private int numberOfManagers;
    private int numberOfEngineers;
    private int numberOfInterns;

    public EmployeeReport() {
        setNumberOfManagers(0);
        setNumberOfEngineers(0);
        setNumberOfInterns(0);
    }

    public EmployeeReport(int numberOfManagers, int numberOfEngineers, int numberOfInterns) {
        setNumberOfManagers(numberOfManagers);
        setNumberOfEngineers(numberOfEngineers);
        setNumberOfInterns(numberOfInterns);
    }

    public int getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(int numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
    }

    public int getNumberOfEngineers() {
        return numberOfEngineers;
    }

    public void setNumberOfEngineers(int numberOfEngineers) {
        this.numberOfEngineers = numberOfEngineers;
    }

    public int getNumberOfInterns() {
        return numberOfInterns;
    }

    public void setNumberOfInterns(int numberOfInterns) {
        this.numberOfInterns = numberOfInterns;
    }

    @Override
    public String toString() {
        return "EmployeeReport{" +
                "numberOfManagers=" + numberOfManagers +
                ", numberOfEngineers=" + numberOfEngineers +
                ", numberOfInterns=" + numberOfInterns +
                '}';
    }
}