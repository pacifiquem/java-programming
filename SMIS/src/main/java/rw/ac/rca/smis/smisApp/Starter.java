package rw.ac.rca.smis.smisApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.ac.rca.smis.orm.*;

import java.util.Date;

public class Starter {
    public static void main(String[] args) {
        Address address1 = new Address("Kigali", "23.2, 12.2");
        Student student1 = new Student("Murangwa", "Male", new Date());
        Instructor instructor1 = new Instructor("Nyarwaya", new Date());
        Mark mark1 = new Mark(12);
        Course course1 = new Course("Java", 12, 80);

        //setting imported values

        address1.setStudents(student1);

        student1.setAddress(address1);
        student1.setCourse(course1);

        instructor1.setAddress(address1);
        instructor1.setCourses(course1);

        mark1.setCourse(course1);

        course1.setMark(mark1);
        course1.setStudent(student1);

        Configuration DbConf = new Configuration();
        DbConf.configure("hibernate.cfg.xml");
        System.out.println("Openning Session");

        @SuppressWarnings("deprecation")
        SessionFactory factory = DbConf.buildSessionFactory();
        Session session = factory.openSession();
        System.out.println("Transaction Started ");

        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(address1);
        session.saveOrUpdate(course1);
        session.saveOrUpdate(instructor1);
        session.saveOrUpdate(mark1);
        session.saveOrUpdate(student1);
        transaction.commit();

        session.close();
        factory.close();
    }
}
