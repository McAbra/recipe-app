package org.piotr.recipeapp.domain;

import org.junit.Before;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @org.junit.Test
    public void getId() {
        Long val = 3L;
        category.setId(3L);
        assertEquals(val, category.getId());

    }

    @org.junit.Test
    public void getDescription() {
    }

    @org.junit.Test
    public void getRecipes() {
    }
}