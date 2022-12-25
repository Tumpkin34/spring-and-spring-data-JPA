package com.example.ex00.prac;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PracTest {
    @Autowired
    private Store store;
    @Autowired @Qualifier("cu")
    private Store cu;
    @Autowired @Qualifier("gs25")
    private Store gs25;

    public void pracTest(){
        log.info(store+"");
        log.info(cu+"");
        log.info(gs25+"");
    }
}
