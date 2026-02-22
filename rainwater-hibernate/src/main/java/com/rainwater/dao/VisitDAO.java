package com.rainwater.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rainwater.entity.MaintVisit;
import com.rainwater.util.HibernateUtil;

public class VisitDAO {

    public boolean saveVisit(MaintVisit visit) {

        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            session.save(visit);

            tx.commit();
            System.out.println("Visit saved successfully ✅");
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;

        } finally {
            if (session != null) session.close();
        }
    }
}