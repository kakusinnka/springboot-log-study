package com.hzh.springbootlogstudy;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogStudyApplicationTest03 {

	@Test
	void test001() {
        Logger logger = Logger.getLogger("JULTest");

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
	}
}
