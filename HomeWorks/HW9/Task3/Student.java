package Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {       //Constructor
        this.name = name;
        this.course = course;
    }

    public String getName() {                       //Getters and Setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents (List<Student> students, Integer course){      //Print students by course
        List<Student> currentCourse = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getCourse() == course){
             currentCourse.add(student);
            }
        }
        System.out.println(currentCourse);
    }

    private static Comparator<Student> compareByName (List<Student> list){      //Comparator for Name
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    private static Comparator<Student> compareByCourse (List<Student> list){        //Comparator for Course
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getCourse(), o2.getCourse());
            }
        };
    }

    public static List<Student> sortByName (List<Student> list){               //Sort list by Name
        list.sort(compareByName(list));
        return list;
    }

    public static List<Student> sortByCourse (List<Student> list){             //Sort list by Course
        list.sort(compareByCourse(list));
        return list;
    }

    @Override
    public String toString() {
        return  name +" - Course: "
                + course + " | ";
    }
}


//    public Boolean compareByName(Student o){                           //It's my attempts to create comparing algorithm
//        if (o == null || getClass() != o.getClass()) return false;
//        if (this == o) return true;
//        return this.getName().equals(o.getName());
//    }
//
//    public Boolean compareByCourse(Student o){
//        if (o == null || getClass() != o.getClass()) return false;
//        if (this == o) return true;
//        return this.getCourse() == o.getCourse();
//    }