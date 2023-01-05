package com.springboot.nbshop.reponsitory;


import com.springboot.nbshop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
