package DB;

import Business.User;
import Utils.DBUtil;

import javax.servlet.annotation.WebServlet;
import java.sql.*;
import java.util.ArrayList;


public class UserDB {
    public static long insert(User user) {
        // TODO: Add code that adds the user to the database
        // NOTE: This is shown in chapters 11-13
        return 0;
    }
    public static int insertNew(User user) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;

        String query
                = "INSERT INTO User (Email, FirstName, LastName) "
                + "VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            connection.close();
        }
    }

    public static int update(User user) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;

        String query = "UPDATE User SET "
                + "FirstName = ?, "
                + "LastName = ? "
                + "WHERE Email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            connection.close();
        }
    }

    public static int delete(User user) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;

        String query = "DELETE FROM User "
                + "WHERE Email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getEmail());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            connection.close();
        }
    }

    public static boolean emailExists(String email) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT Email FROM User "
                + "WHERE Email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
          connection.close();
        }
    }

    public static User selectUser(String email) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM User "
                + "WHERE Email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setEmail(rs.getString("Email"));
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
           connection.close();
        }
    }

    public static ArrayList<User> selectUsers() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_f7ee65ddf9b7232","b4da2dcf0d7d16","6b51eb72");
            System.out.println("connection success!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM User";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<User> users = new ArrayList<User>();
            while (rs.next()) {
                User user = new User();
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setEmail(rs.getString("Email"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
          connection.close();
        }
    }
}
