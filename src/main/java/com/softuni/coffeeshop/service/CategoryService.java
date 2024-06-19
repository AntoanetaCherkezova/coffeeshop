package com.softuni.coffeeshop.service;

import com.softuni.coffeeshop.model.entity.Category;
import com.softuni.coffeeshop.model.entity.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
