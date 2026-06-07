package com.akshat.jobtracker.job_tracker_api.controller;

import com.akshat.jobtracker.job_tracker_api.entity.Job;
import com.akshat.jobtracker.job_tracker_api.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/save")
    public Job saveJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }

    @GetMapping("/getAll")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id){
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteJobById(@PathVariable int id){
        jobService.deleteJobById(id);
        return "Job Deleted Successfully";
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable int id,
                         @RequestBody Job job){

        return jobService.updateJob(id, job);
    }

    @GetMapping("/status/{status}")
    public List<Job> getJobsByStatus(@PathVariable String status){
        return jobService.getJobsByStatus(status);
    }

    @GetMapping("/company/{companyName}")
    public List<Job> getJobsByCompanyName(@PathVariable String companyName){
        return jobService.getJobsByCompanyName(companyName);
    }
}