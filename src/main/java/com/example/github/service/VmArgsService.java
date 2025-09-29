package com.example.github.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VmArgsService {

    @Value("${sample.count}")
    private String appName;

    public String getVmArgs() {
        return getAppName();

    }

    public String getAppName() {
        return appName;
    }
}
