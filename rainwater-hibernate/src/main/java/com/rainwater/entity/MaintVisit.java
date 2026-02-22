package com.rainwater.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MAINT_VISIT_TBL")
public class MaintVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VISIT_ID")
    private int visitID;

    @Temporal(TemporalType.DATE)
    @Column(name = "VISIT_DATE")
    private Date visitDate;

    @Column(name = "TECHNICIAN_NAME")
    private String technicianName;

    // 🔗 Many Visits → One Tank
    @ManyToOne
    @JoinColumn(name = "TANK_ID")
    private Tank tank;

    // 🔗 One Visit → Many Reports
    @OneToMany(mappedBy = "visit", cascade = CascadeType.ALL)
    private List<MaintReport> reports;

    // getters and setters
}