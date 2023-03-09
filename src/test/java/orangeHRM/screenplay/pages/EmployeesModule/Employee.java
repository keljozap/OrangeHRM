package orangeHRM.screenplay.pages.EmployeesModule;

public enum Employee {
    SANDRA("Sandra","Estrada", "Paola", false);

    private String firstName;
    private String lastName;
    private String middleName;
    private boolean createLoginDetails;

    Employee(String firstName, String lastName, String middleName, boolean createLoginDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.createLoginDetails = createLoginDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean isCreateLoginDetails() {
        return createLoginDetails;
    }

    public void setCreateLoginDetails(boolean createLoginDetails) {
        this.createLoginDetails = createLoginDetails;
    }
}
