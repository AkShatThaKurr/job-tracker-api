package com.akshat.jobtracker.job_tracker_api.service;

import com.akshat.jobtracker.job_tracker_api.entity.Job;
import com.akshat.jobtracker.job_tracker_api.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(int id){
        return jobRepository.findById(id).orElse(null);
    }

    public void deleteJobById(int id){
        jobRepository.deleteById(id);
    }

    public Job updateJob(int id, Job updatedJob){

        Job existingJob = jobRepository.findById(id).orElse(null);

        if(existingJob != null){

            existingJob.setCompanyName(updatedJob.getCompanyName());
            existingJob.setRole(updatedJob.getRole());
            existingJob.setStatus(updatedJob.getStatus());
            existingJob.setAppliedDate(updatedJob.getAppliedDate());

            return jobRepository.save(existingJob);
        }

        return null;
    }

    public List<Job> getJobsByStatus(String status){
        return jobRepository.findByStatus(status);
    }

    public List<Job> getJobsByCompanyName(String companyName){
        return jobRepository.findByCompanyName(companyName);
    }
}