package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * User: 张欢
 * Date: 2023/8/9
 * Time: 20:46
 **/
@SuppressWarnings({"all"})
public interface DishService {
    /**
     * 新增菜品
     * @param dishDTO
     */
    void save(DishDTO dishDTO);
}
