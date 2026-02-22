package com.rainwater.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rainwater.entity.MaintReport;
import com.rainwater.util.HibernateUtil;

public class ReportDAO {

    public boolean saveReport(MaintReport report) {

        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            session.save(report);

            tx.commit();
            System.out.println("Report saved successfully ✅");
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