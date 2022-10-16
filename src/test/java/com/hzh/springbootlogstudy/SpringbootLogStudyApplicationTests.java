package com.hzh.springbootlogstudy;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogStudyApplicationTests {

	@Test
	void test001() {
		Logger logger = LoggerFactory.getLogger(SpringbootLogStudyApplicationTests.class);
		
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
	}
}
