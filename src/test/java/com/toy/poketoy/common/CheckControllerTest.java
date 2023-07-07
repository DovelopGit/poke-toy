package com.toy.poketoy.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CheckControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @WithMockUser // 가짜 사용자 인증
    public void Health_체크() throws Exception {
       String success = "{\"status\":\"success\",\"data\":\"success\",\"message\":null}";

        mvc.perform(get("/check"))
                .andExpect(status().isOk())
                .andExpect(content().string(success));
    }
}

