package Persistence;

import Business.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Interface that abstracts the persistence of users from the rest of the code.
 *
 * In particular, it follows the Data Access Object design pattern, which is commonly used to abstract persistence
 * implementations with a set of generic operations.
 */
public interface UserDao {
    /**
     * Method that saves a specific student, persisting it.
     *
     * @param user The new student to save.
     */
    public void insertUser(User user) throws SQLException;

    /**
     * Method that allows to update the user with the information changed.
     *
     * @param user is the user whose information has been changed and it's going to be updated.
     * @throws SQLException if an error occurs.
     */
    public void updateUser(User user) throws SQLException;

    /**
     * Method that reads the persisted information, returning all stored users.
     *
     * @return A list containing all persisted users.
     */
    List<User> getAllStudents();
}