package com.hspedu.mhl.utils;

import com.hspedu.mhl.view.MHLView;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
        //new MHLView().mainMenu();
    }
}
