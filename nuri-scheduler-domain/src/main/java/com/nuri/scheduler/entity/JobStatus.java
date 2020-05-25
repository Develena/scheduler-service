package com.nuri.scheduler.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class JobStatus {

    private String dcuId;
    private String ip;
    private Integer port;
    private String nameSpace;
    private String dcuStatus;

    public JobStatus(String dcuId, String ip, int port) {
        this.dcuId = dcuId;
        this.ip = ip;
        this.port = port;
    }

    public static List<JobStatus> sample() {

        List<JobStatus> dcus = new ArrayList<JobStatus>();

        dcus.add(new JobStatus("1000","127.0.0.1", 8000));
        dcus.add(new JobStatus("1001","127.0.0.2", 8000));

        return dcus;
    }
}
