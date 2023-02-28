package orangeHRM.screenplay.pages.aunthentication.actions;

public enum User {
    ADMIN("Admin","admin123");
    private final String username;
    private final String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
