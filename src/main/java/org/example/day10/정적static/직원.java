package org.example.day10.정적static;
// 1013-NEW01-STATIC Q3
public class 직원 {
    String name;
    int age;
    String gender;
    static int count;
    static int avg;

    public 직원(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        avg = avg + age;
    }

    public String 직원수() {
        return "우리 회사의 직원수는? >> " + count + "명";
    }

    public String 평균() {
        return "우리 회사의 직원의 평균 나이 >> " + avg/count;
    }



    public String toString() {
        return "직원{" + "name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + '}';
    }
}
