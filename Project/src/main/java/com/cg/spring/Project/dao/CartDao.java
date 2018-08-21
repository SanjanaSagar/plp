package com.cg.spring.Project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.Project.bean.Cart;

@Repository("cartdao")
public interface CartDao extends CrudRepository<Cart, Integer> {

}
