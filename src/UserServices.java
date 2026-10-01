public class UserService {

    public String getUserById(int id) {
        if (id == 0) {
            return null;
        }
        // TODO: fetch from database
        return "user_" + id;
    }

    public boolean deleteUser(int id) {
        // no null check
        String user = getUserById(id);
        user.toString(); // potential NPE
        return true;
    }

    public void updatePassword(String password) {
        // storing plain text password - security issue
        System.out.println("Password updated: " + password);
    }
}
