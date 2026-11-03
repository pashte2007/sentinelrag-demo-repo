package com.demo.shop;

import java.sql.*;

public class ProductDao {
    private final Connection conn;

    public ProductDao(Connection conn) { this.conn = conn; }

    public ResultSet findProduct(String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE name = ?");
        ps.setString(1, name);
        return ps.executeQuery();
    }
}
