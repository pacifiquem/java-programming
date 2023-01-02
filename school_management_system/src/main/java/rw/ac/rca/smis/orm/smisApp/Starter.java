package rw.ac.rca.smis.orm.smisApp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import rw.ac.rca.smis.orm.Address;
import rw.ac.rca.smis.orm.Course;
import rw.ac.rca.smis.orm.Instructor;
import rw.ac.rca.smis.orm.Mark;
import rw.ac.rca.smis.orm.Student;

import java.util.*;

public class Starter {

    public static void main(String[] args) {
        Date date = new Date();

        // creating address
        Address address1 = new Address("Kigali", "KK 22 ave");

        //creating courses
        Course course1 = new Course(5, "English", 50.0);
        Course course2 = new Course(2, "Database", 30.0);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        // creating Instructors
        Instructor instructor1 = new Instructor("Pacifique Murangwa", date, 'M');
        Instructor instructor2 = new Instructor("Niyo Eden", date, 'F');
        ArrayList<Instructor> instructors = new ArrayList<Instructor>();
        instructors.add(instructor1);
        instructors.add(instructor2);

        //creating Marks
        Mark mark1 = new Mark(15);
        Mark mark2 = new Mark(18);
        ArrayList<Mark> marks = new ArrayList<Mark>();
        marks.add(mark1);
        marks.add(mark2);

        //creating Students
        Student student1 = new Student("Niyo Valens", date, 'M');
        Student student2 = new Student("Uwayo Lina", date, 'F');
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);

        //assigning instuctors and students to address
        address1.setInstructors(instructors);
        address1.setStudents(students);

        //assigning address to student
        student1.setAddress(address1);
        student2.setAddress(address1);

        //assigning address to instructor
        instructor1.setAddress(address1);
        instructor2.setAddress(address1);

        //assigning courses to instructor
        instructor1.setCourses(courses);

        //assigning instructor to course
        course1.setInstructor(instructor1);
        course2.setInstructor(instructor1);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println("Opening session");

        @SuppressWarnings("deprecation")
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println(" Beginning transaction...........");
        Transaction transaction = session.beginTransaction();

        //saving objects
//        session.saveOrUpdate();


        transaction.commit();
        session.close();
        factory.close();

    }
}
