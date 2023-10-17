package com.example.springhwani.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyDao1 {

  private final DataSource dataSource;
  public String select(int i) throws SQLException {
    String sql = """
       SELECT * FROM customers
       WHERE customerId = ?
       """;

    Connection connection = dataSource.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1,i);
    ResultSet resultSet = statement.executeQuery();
    
    try (connection; statement) {
      if (resultSet.next()) {
           resultSet.getString("customerName");
      }
    }
    return null;
  }
}
