package com.greedy.crud.controller;

import com.greedy.crud.model.dto.CategoryDTO;
import com.greedy.crud.model.dto.MenuDTO;
import com.greedy.crud.model.service.MenuService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/list")
    public ModelAndView findMenuList(ModelAndView mv) {

        List<MenuDTO> menuList = menuService.findAllMenu();

        menuList.forEach(System.out::println);

        mv.addObject("menuList", menuList);
        mv.setViewName("menu/list");

        return mv;
    }

    @GetMapping("/regist")
    public void registPage() {}

    @GetMapping(value="category", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> registMenu() {

        List<CategoryDTO> categoryList = menuService.findAllCategory();

        categoryList.forEach(System.out::println);

        return categoryList;
    }

}
