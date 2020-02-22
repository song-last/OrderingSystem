package com.song;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author song
 * @Date 2020/2/22 19:39
 */
@SpringBootTest
@Slf4j
public class LoggerTest {

    //日志打印
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
//        logger.debug("debug....");
//        logger.info("info...");
//        logger.error("error...");

        log.debug("debug....");
        log.info("info...");
        log.error("error...");
    }
}
