package com.rainwater.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rainwater.entity.Tank;
import com.rainwater.util.HibernateUtil;

public class TankDAO {

    public boolean saveTank(Tank tank) {
        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();

            // If ID not set → generate simple one
            if(tank.getTankID() == null)
                tank.setTankID("TN" + System.currentTimeMillis());

            session.save(tank);

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    // 🔎 Fetch by ID
    public Tank getTankById(String id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Tank.class, id);
        }
    }
}