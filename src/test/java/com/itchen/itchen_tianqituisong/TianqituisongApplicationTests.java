package com.itchen.itchen_tianqituisong;

import com.itchen.controller.Pusher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TianqituisongApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void goodMorning() {
        Pusher.push();
    }

}
