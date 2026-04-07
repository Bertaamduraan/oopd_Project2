package Persistence;

import Business.User;

import java.sql.SQLException;

public interface UserDao {
    public void insertUser(User user) throws SQLException;
    public void updateUser(User user) throws SQLException;
}
