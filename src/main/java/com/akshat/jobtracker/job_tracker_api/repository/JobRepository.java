package com.akshat.jobtracker.job_tracker_api.repository;

import com.akshat.jobtracker.job_tracker_api.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    List<Job> findByStatus(String status);
    List<Job> findByCompanyName(String companyName);
}