package io.github.kuyer.sboot.dubbo.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void testContextLoad() {
		logger.info("context load success.");
	}

}
