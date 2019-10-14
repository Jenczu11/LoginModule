import login.loginManager;
import login.loginAccess;
//import login.User;
public class main {
    public static void main(String[] args) {
        loginManager lm = loginManager.getInstance();
        lm.login("admin","admin");
        loginAccess la = new loginAccess();
        System.out.println(la.getAccessLevel());
        lm.logout();
        System.out.println(la.getAccessLevel());
        lm.login("user","user");
        System.out.println(la.getAccessLevel());

    }
}
