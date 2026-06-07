package com.akshat.jobtracker.job_tracker_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_role")
    private String role;

    @Column(name = "job_status")
    private String status;

    @Column(name = "applied_date")
    private LocalDate appliedDate;
}