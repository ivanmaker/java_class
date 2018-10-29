package com.origamisoftware.teach.advanced.services;


import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class WebServiceTest {

    @Test
    public void testGetStockServiceInstance() {
        WebStockService webStockService = ServiceFactory.getStockService();
        assertNotNull(webStockService);
    }
}
