package com.rainwater.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MAINT_REPORT_TBL")
public class MaintReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_ID")
    private int reportID;

    @Column(name = "STATUS")
    private String status;

    // 🔗 Many Reports → One Visit
    @ManyToOne
    @JoinColumn(name = "VISIT_ID")
    private MaintVisit visit;

    // getters and setters
}