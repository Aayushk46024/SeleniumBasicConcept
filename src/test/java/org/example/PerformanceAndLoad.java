package org.example;

import org.testng.annotations.Test;

public class PerformanceAndLoad {

    @Test(invocationCount = 6, threadPoolSize = 3)
    public void performanceAndLoad(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}
