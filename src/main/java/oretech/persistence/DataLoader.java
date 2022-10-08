package oretech.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Exercise 3.2
 */
public class DataLoader {
    private final Connection connection;

    /**
     * Create an instance of the DataLoader object using the provided database connection
     *
     * @param connection The JDBC connection to use
     */
    public DataLoader(Connection connection) {
        this.connection = connection;
    }

    public Object insert() throws SQLException {
        try (
            final PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO  () VALUES (?,?);"))
        {
            // for (Book book : books) {
            //     statement.setString(1, book.getTitle());
            //     statement.setString(2, book.getGenre().getCode());
            //     statement.execute();
            // }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
