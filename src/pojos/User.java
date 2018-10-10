package pojos;

import java.util.List;

public class User {
    private String name;        //学生名字
    private float credits;      //已修学分
    private String academy;     //所属学院
    private List courses;       //已选课程列表
    private List dropCourses;   //退选课程列表

    public String getName() {
        return name;
    }

    public float getCredits() {
        return credits;
    }

    public String getAcademy() {
        return academy;
    }

    public List getCourses() {
        return courses;
    }

    public List getDropCourses() {
        return dropCourses;
    }
}
