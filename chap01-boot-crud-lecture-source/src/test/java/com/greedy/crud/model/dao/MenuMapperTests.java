package com.greedy.crud.model.dao;

import com.greedy.crud.config.BeanConfiguration;
import com.greedy.crud.config.MybatisConfig;
import com.greedy.crud.model.dto.MenuDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@ContextConfiguration(classes = {BeanConfiguration.class, MybatisConfig.class})
public class MenuMapperTests {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void 전체메뉴조회테스트() {

        List<MenuDTO> menuList = menuMapper.findAllMenu();

        assertNotNull(menuList);
    }
}
