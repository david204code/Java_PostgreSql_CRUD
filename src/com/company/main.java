package com.company;

import java.sql.Connection;
public class main {
    public static void main(String[] args) {
    //An instance of the class db
        DbFunction db = new DbFunction();
        Connection conn = db.connect_to_db("tutdb", "postgres", "password");
//        db.createTable(conn, "employee");
//        db.insert_row(conn, "employee", "Jose", "England");
//        db.update_name(conn, "employee", "Jose", "Matthew");
//        db.search_by_name(conn, "employee",  "Matthew");
//        db.delete_row_by_name(conn, "employee", "Judas");
//        db.delete_row_by_id(conn, "employee", 5);
//        db.read_data(conn, "employee");
//        db.search_by_id(conn, "employee", 4);
//        db.delete_table(conn, "employee");
    }
}
