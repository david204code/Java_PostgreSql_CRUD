package com.company;

public class main {
    public static void main(String[] args) {
    //An instance of the class db
        DbFunction db = new DbFunction();
        db.connect_to_db("tutdb", "postgres", "password");
    }
}
