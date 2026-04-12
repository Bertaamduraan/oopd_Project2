package Persistence.sql;

import Business.User;
import Persistence.UserDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Class that implements the methods described in the {@link UserDao} interface.
 *
 * Specifically, it implements the user persistence in a SQL database.
 */
public class SQLUserDAO implements UserDao {
    @Override
    public void insertUser(User user) {
        String query = "INSERT INTO Student(username, email, password) VALUES ('" +
                user.getUsername() + "', '" +
                user.getEmail() + "', '" +
                user.getPassword() + "', '" +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAllStudents() {
        List<User> users = new LinkedList<>();
        /*
        List<User> students = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM user;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String login = result.getString("login");
                String studentName = result.getString("full_name");
                String birthDate = result.getString("birth_date");

                students.add(new User(id, login, studentName, birthDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
        return users;
    }
}
