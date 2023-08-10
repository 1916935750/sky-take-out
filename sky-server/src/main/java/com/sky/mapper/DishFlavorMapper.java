package com.sky.mapper;

import com.sky.dto.DishDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * User: 张欢
 * Date: 2023/8/9
 * Time: 21:28
 **/
@Mapper
public interface DishFlavorMapper {

    void save(DishDTO dishDTO);
}
