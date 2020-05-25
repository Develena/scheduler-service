package com.nuri.scheduler;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.spec.SchedulerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name="scheduler", value = "scheduler")
public interface SchedulerClient extends SchedulerService {

    @GetMapping(value={"/v0.1/test"})
    public String test();

    @PostMapping(value={"/v0.1/start"})
    public String addScheduleJob();

    @DeleteMapping(value={"/v0.1/delete"})
    public String deleteScheduleJob();

    @GetMapping(value={"/v0.1/all"})
    public String getAllJobs();

    @PutMapping(value={"/v0.1/pauseJob"})
    public String pauseJob();

    @PutMapping(value={"/v0.1/pauseJob"})
    public String resumeJob();
}
