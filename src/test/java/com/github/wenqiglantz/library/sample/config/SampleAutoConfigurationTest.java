package com.github.wenqiglantz.library.sample.config;

import com.github.wenqiglantz.library.sample.service.SampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleAutoConfigurationTest {

    private SampleAutoConfiguration sampleAutoConfigurationUnderTest;

    @BeforeEach
    void setUp() {
        sampleAutoConfigurationUnderTest = new SampleAutoConfiguration();
    }

    @Test
    void testSampleService() {
        // Setup
        // Run the test
        final SampleService result = sampleAutoConfigurationUnderTest.sampleService();

        // Verify the results
    }
}
