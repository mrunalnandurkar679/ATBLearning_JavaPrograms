package OOPSConcepts_MethodOverriding;

public class Lab04_LoginFunctionality_Ex04 {
    public static void main(String[] args) {
        User u = new User("Rahul ", "rahulchambhare@gmail.com", "31123@qwer" );
        u.login();
        User a = new AdminUser( "Mrunal", "Mrunal.nandurkar@gmail.com", "1234Qwer@", 123);
        a.login();

    }
}

class User
{
    private String username;
    private String email;
    private String password;
    private boolean isActive;
    User( String username , String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    void login()
    {
        System.out.println("Base username :  "+username +  "( " +email +")");
        System.out.println("user type : Regular");
        System.out.println("status" + (isActive ? "Active"  : "inActive"));
    }

    void displayInfo()
    {
        System.out.println("========User Information=========");
        System.out.println("username :" +username);
        System.out.println("email :" +email);
        System.out.println("status" + (isActive ? "Active" : "inActive"));
    }
}

class AdminUser extends User
{    private String[] Permission;
    private int adminID;
    AdminUser(String username, String email, String password, int adminID) {
        super(username, email, password);
        super.isActive();
        this.adminID = adminID;
        this.Permission = new String[]{"Read", "Write", "Dalete", "Manage_Users"};

    }

    public String[] getPermission() {
        return Permission;
    }

    public void setPermission(String[] Permission) {
        this.Permission = Permission;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    void login() {

        System.out.println("=======Admin User Details===============");
        System.out.println("Admin ID: " +adminID);
        System.out.println("Username" + getUsername());
        System.out.println("user email :" + getEmail());
        System.out.println("Status" + (isActive() ?"Active" : "isActive"));
        System.out.println("permission :" +String.join(",", Permission));
    }
}

