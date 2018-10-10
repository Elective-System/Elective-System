package pojos;


import java.sql.*;

public class Teacher {
    private String name;        //教师名字
    private String academy;     //所属学院
    private String introduction;//教师简介
    //JDBC驱动名及数据库URL
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/ELECTIVE-SYSTEM";

    //数据库的用户名和密码
    static final String USER="root";
    static final String PASS="123456";

    public void Teacher(){
        //从数据库读数据初始化
        Connection conn=null;
        Statement stmt=null;
/*        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }*/
    }
    public String getInfo(){
        //教师简介
        return introduction;
    }
    public String getName(){
        //教师名字
        return name;
    }
    public String getAcademy(){
        //教师学院
        return academy;
    }

}
