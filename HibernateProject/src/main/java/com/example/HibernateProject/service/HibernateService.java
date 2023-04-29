package com.example.HibernateProject.service;

import com.example.HibernateProject.model.User;
import com.example.HibernateProject.repository.RepositoryHibernate;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HibernateService {
    private final RepositoryHibernate repositoryHibernate;

    public HibernateService(RepositoryHibernate repositoryHibernate) {
        this.repositoryHibernate = repositoryHibernate;
    }
    public User getOne(int number) {
        Optional<User> optionalTask = repositoryHibernate.findById(number);
        if (!optionalTask.isPresent()) {
            throw new NullPointerException();
        }
        return optionalTask.get();
    }
}
