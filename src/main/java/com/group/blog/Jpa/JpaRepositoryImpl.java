package com.group.blog.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface JpaRepositoryImpl<T, ID extends Serializable> extends JpaRepository<T, ID>  {

}
