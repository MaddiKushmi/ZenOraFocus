package com.studyplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //return DriverManager.getConnection("jdbc:mysql://localhost:3306/study_planner", "root", "123456");
        return DriverManager.getConnection("jdbc:mysql://kodama.proxy.rlwy.net:40478/railway?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "MibMSVgnxMjgfRhBbEUgvogdGYFCODgo");
    }
}

