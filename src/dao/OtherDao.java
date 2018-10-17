package dao;

import util.DBConnector;

import java.sql.ResultSet;

public class AccountDao {
    //验证登陆
    public static boolean login(String name,String password){
        boolean flag = false;
        try {
            DBConnector.init();
            ResultSet result = DBConnector.selectSql("select name,password from user");
            while (result.next()) {
                if(result.getString("name").equals(name)&&result.getString("password").equals(password))
                    flag = true;
            }
            DBConnector.closeConn();
        }catch (Exception e){
            System.out.println("error!");
        }
        return flag;
    }

    //注册
    public static boolean register(String name,String password){
        boolean flag = false;
        try {
            DBConnector.init();
            //检查是否用户名重复
            ResultSet result = DBConnector.selectSql("select name from user");
            while (result.next()) {
                if(result.getString("name").equals(name))
                    //插入成功
                    if(DBConnector.addUpdDel("insert into user values name,password")>0)
                        flag = true;
            }

            DBConnector.closeConn();
        }catch (Exception e){
            System.out.println("error!");
        }
        return flag;
    }
}
