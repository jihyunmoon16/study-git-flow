package com.greedy.crud.controller;

import com.greedy.crud.config.BeanConfiguration;
import com.greedy.crud.config.MybatisConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@ContextConfiguration(classes = {BeanConfiguration.class, MybatisConfig.class})
public class MenuControllerTests {

    @Autowired
    private MenuController menuController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(menuController).build();
    }

    @Test
    @DisplayName("전체 메뉴 조회용 컨트롤러 동작 확인 테스트")
    public void testFindAllMenu() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/menu/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("menu/list"))
                .andDo(MockMvcResultHandlers.print());
    }
}
