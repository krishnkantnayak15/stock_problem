package com.allstate.services;

import com.allstate.entities.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/test.sql"})
public class ProductServiceTest {

    @Autowired
  private ProductService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAProduct(){
        Product before = new Product();
        before.setName("moto m");
        before.setStocknumber("moto_m1");
        before.setActualprice(17999.00);
        before.setListprice(19900.00);

        Product after =  this.service.create(before);

        assertEquals(after.getName(),"moto m");

    }

//    @Test
//    public void shouldCreateDistinctProduct(){
//        Product before = new Product();
//        before.setName("moto m");
//        before.setStocknumber("moto_m1");
//        before.setActualprice(17999.00);
//        before.setListprice(19900.00);
//        this.service.create(before);
//
//
//        Product before1 = new Product();
//        before1.setName("moto m");
//        before1.setStocknumber("moto_m1");
//        before1.setActualprice(17999.00);
//        before1.setListprice(19900.00);
//
//
//        Product after = this.service.create(before1);
//
//        assertNull(after);
//
//
//    }

}