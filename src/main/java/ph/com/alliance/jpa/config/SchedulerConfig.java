package ph.com.alliance.jpa.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *     Configuration for Spring Scheduler
 */

@Configuration
@EnableScheduling
public class SchedulerConfig implements SchedulingConfigurer {
 
    @Value("${scheduler.pool}")
    private int poolSize;
    
    
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }
 
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(poolSize);
    }

 
 
}
