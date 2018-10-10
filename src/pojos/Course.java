package pojos;

public class Course {
    private String time;        //上课时间
    private String site;        //上课地点
    private Teacher teacher;    //教师
    private float credits;      //学分
    private String period;      //学时
    private String name;        //课程名
    private String category;    //课程分类
    private String feature;     //课程特点（一句话）
    private float grade;        //课程评分
    public void Course(){
        //读取数据库初始化
    }

    public String getTime() {
        return time;
    }

    public String getSite() {
        return site;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public float getCredits() {
        return credits;
    }

    public String getPeriod() {
        return period;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getFeature() {
        return feature;
    }

    public float getGrade() {
        return grade;
    }

}
