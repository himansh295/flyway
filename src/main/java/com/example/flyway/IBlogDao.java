package com.example.flyway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogDao extends JpaRepository<Blog,Long> {
}
