package com.company;

import java.sql.Connection;
public class main {
    public static void main(String[] args) {
    //An instance of the class db
        DbFunction db = new DbFunction();
        Connection conn = db.connect_to_db("tutdb", "postgres", "password");
        db.createTable(conn, "employee");
    }
}
