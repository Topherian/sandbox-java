package com.topherian.spring.cloud.discoveryserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableEurekaServer
public class DiscoveryServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
