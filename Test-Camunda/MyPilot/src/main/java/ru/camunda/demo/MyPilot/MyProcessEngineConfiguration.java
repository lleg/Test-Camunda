package ru.camunda.demo.MyPilot;

import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.util.SpringBootProcessEnginePlugin;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyProcessEngineConfiguration extends SpringBootProcessEnginePlugin {

    @Override
    public void preInit(SpringProcessEngineConfiguration processEngineConfiguration) {
        super.preInit(processEngineConfiguration);    
        if (!processEngineConfiguration.isAuthorizationEnabled()) {
        	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            processEngineConfiguration.setAuthorizationEnabled(true);
        }
    }
}
