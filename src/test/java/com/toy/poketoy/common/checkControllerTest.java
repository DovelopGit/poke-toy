package com.toy.poketoy.common;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
class checkControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void Health_체크() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/check"))
                .andExpect(status().isOk())
                .andExpect(content().string((Matcher<? super String>) null));
    }
}