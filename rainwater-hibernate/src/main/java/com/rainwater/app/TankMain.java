package com.rainwater.app;

import java.util.Date;

import com.rainwater.dao.TankDAO;
import com.rainwater.entity.Tank;

public class TankMain {

    public static void main(String[] args) {

        try {

            Tank tank = new Tank();
            tank.setPropertyOrBlockID("B-12");
            tank.setTankLocationDescription("Near main gate");
            tank.setCapacityLiters(5000);
            tank.setInstallationDate(new Date());
            tank.setMaintenanceFrequency("MONTHLY");
            tank.setStatus("ACTIVE");

            TankDAO dao = new TankDAO();

            boolean result = dao.saveTank(tank);

            if(result) {
                System.out.println("Record inserted successfully 🎉");

                // 🔎 Fetch and print
                Tank savedTank = dao.getTankById(tank.getTankID());

                System.out.println("Saved Tank Details 👇");
                System.out.println(savedTank);
            }
            else {
                System.out.println("Insert failed ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}