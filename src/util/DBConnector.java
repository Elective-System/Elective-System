package util;

import java.sql.*;

//初始化与数据库的连接，并执行语句，检查异常，关闭连接
public class DBConnector {
    static String url = "jdbc:mysql://localhost:3306/elective_system";//数据库的名称
    static String username = "root";
    static String password = "zzy971129";
    static Connection conn = null;
    static ResultSet rs = null;                                      //结果集
    static PreparedStatement ps = null;                              //执行语句

    //数据库初始化
    public static void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            System.out.println("SQL驱动初始化失败！");
            e.printStackTrace();
        }
    }

    //执行sql修改语句，并检查是否异常
    public static int addUpdDel(String sql){
        int i = 0;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            i=ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("sql数据库增删改异常");
            e.printStackTrace();
        }
        return i;
    }

    //执行sql查询语句，并检查是否异常
    public static ResultSet selectSql(String sql){
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        }catch (SQLException e){
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeConn(){
        try{
            conn.close();
        }catch (SQLException e){
            System.out.println("数据库关闭异常");
            e.printStackTrace();
        }
    }
}
