package mpac.learning.java.voteApp;

import mpac.learning.java.models.Candidate;
import mpac.learning.java.models.Voter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Startter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Candidate newCandidate;

        System.out.println("Enter your role (voter, admin): ");
        String role = sc.nextLine();

        ValuesInitializer valuesInitializer = new ValuesInitializer();
        newCandidate = valuesInitializer.addCandiate();

        Voter vote = new ValuesInitializer().voteCandidate();

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println("Opening session");

        @SuppressWarnings("deprecation")
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println(" Beginning transaction...........");
        Transaction transaction = session.beginTransaction();

        //saving objects
        session.saveOrUpdate(vote);
        session.saveOrUpdate(newCandidate);


        transaction.commit();
        session.close();
        factory.close();


    }
}
