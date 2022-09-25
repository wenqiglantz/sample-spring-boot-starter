package com.github.wenqiglantz.library.sample.config;

import com.github.wenqiglantz.library.sample.service.SampleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SampleService.class)
public class SampleAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SampleService sampleService() {
        return new SampleService();
    }

}
