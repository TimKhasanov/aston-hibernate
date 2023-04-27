package com.example.HibernateProject.repository;


import com.example.HibernateProject.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHibernate extends CrudRepository<User, Integer> {
}
