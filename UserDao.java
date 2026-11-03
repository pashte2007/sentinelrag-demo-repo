package com.demo.shop;

import java.sql.*;

public class UserDao {
    private final Connection conn;

    public UserDao(Connection conn) { this.conn = conn; }

    public ResultSet findUser(String name) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "SELECT * FROM users WHERE name = '" + name + "'";
        return st.executeQuery(sql);
    }
}
