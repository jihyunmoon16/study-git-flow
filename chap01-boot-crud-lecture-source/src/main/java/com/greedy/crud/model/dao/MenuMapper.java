package com.greedy.crud.model.dao;

import com.greedy.crud.model.dto.CategoryDTO;
import com.greedy.crud.model.dto.MenuDTO;

import java.util.List;

public interface MenuMapper {
    List<MenuDTO> findAllMenu();

    List<CategoryDTO> findAllCategory();
}
