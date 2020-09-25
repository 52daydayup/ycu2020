package com.ycu.ycumybatis;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {
    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp()throws Exception{
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getCustomers()throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/getCustomers")
        .accept(MediaType.APPLICATION_JSON_UTF8)
        ).andDo(MockMvcResultHandlers.print());

    }
}
