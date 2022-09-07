package com.greedy.crud.model.service;

import com.greedy.crud.config.BeanConfiguration;
import com.greedy.crud.config.MybatisConfig;
import com.greedy.crud.model.dto.MenuDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {BeanConfiguration.class, MybatisConfig.class})
public class MenuServiceTests {

    @Autowired
    private MenuService menuService;

    @Test
    @DisplayName("메뉴 목록 조회용 서비스 메소드 테스트")
    public void testFindAllMenu() {

        //given

        //when
        List<MenuDTO> menuList = menuService.findAllMenu();
        menuList.forEach(System.out::println);

        //then
        assertNotNull(menuList);
//        assertEquals(27, menuList.size());
    }
}
