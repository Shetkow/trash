package org.example.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
      try {
          Session session = factory.openSession();
          Employee emp = new Employee("Pavel","Shetkov","It",500);
          session.beginTransaction();
          session.save(emp);
          session.getTransaction().commit();
      }finally {
          factory.close();
      }

    }
}
