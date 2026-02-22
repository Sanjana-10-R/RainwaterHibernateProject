package com.rainwater.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TANK_TBL")
public class Tank {

    @Id
    @Column(name = "TANK_ID")
    private String tankID;

    @Column(name = "PROPERTY_OR_BLOCK_ID")
    private String propertyOrBlockID;

    @Column(name = "TANK_LOCATION_DESCRIPTION")
    private String tankLocationDescription;

    @Column(name = "CAPACITY_LITERS")
    private int capacityLiters;

    @Temporal(TemporalType.DATE)
    @Column(name = "INSTALLATION_DATE")
    private Date installationDate;

    @Column(name = "MAINTENANCE_FREQUENCY")
    private String maintenanceFrequency;

    @Column(name = "STATUS")
    private String status;

    // Getters & Setters

    public String getTankID() { return tankID; }
    public void setTankID(String tankID) { this.tankID = tankID; }

    public String getPropertyOrBlockID() { return propertyOrBlockID; }
    public void setPropertyOrBlockID(String propertyOrBlockID) { this.propertyOrBlockID = propertyOrBlockID; }

    public String getTankLocationDescription() { return tankLocationDescription; }
    public void setTankLocationDescription(String tankLocationDescription) { this.tankLocationDescription = tankLocationDescription; }

    public int getCapacityLiters() { return capacityLiters; }
    public void setCapacityLiters(int capacityLiters) { this.capacityLiters = capacityLiters; }

    public Date getInstallationDate() { return installationDate; }
    public void setInstallationDate(Date installationDate) { this.installationDate = installationDate; }

    public String getMaintenanceFrequency() { return maintenanceFrequency; }
    public void setMaintenanceFrequency(String maintenanceFrequency) { this.maintenanceFrequency = maintenanceFrequency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Tank{" +
                "tankID='" + tankID + '\'' +
                ", propertyOrBlockID='" + propertyOrBlockID + '\'' +
                ", location='" + tankLocationDescription + '\'' +
                ", capacity=" + capacityLiters +
                ", installationDate=" + installationDate +
                ", frequency='" + maintenanceFrequency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}