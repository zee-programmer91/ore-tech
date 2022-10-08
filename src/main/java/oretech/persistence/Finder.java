package oretech.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 3.3
 */
public class Finder {

    private final Connection connection;

    public Finder(Connection connection) {
        this.connection = connection;
    }

    public Object select() {

        try (
            final PreparedStatement statement = this.connection.prepareStatement(
                "SELECT ;"))
        {
            ResultSet resultSet =  statement.executeQuery();
            while (resultSet.next()) {
                String code = resultSet.getString("code");
                String name = resultSet.getString("description");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}