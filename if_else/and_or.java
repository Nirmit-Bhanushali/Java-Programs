package if_else;

public class and_or {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 2 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
