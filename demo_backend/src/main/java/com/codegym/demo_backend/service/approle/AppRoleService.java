package com.codegym.demo_backend.service.approle;

import com.codegym.demo_backend.model.AppRole;
import com.codegym.demo_backend.repo.IAppRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppRoleService implements IAppRoleService {

    @Autowired
    private IAppRoleRepo roleRepo;

    @Override
    public Iterable<AppRole> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return roleRepo.findById(id);
    }

    @Override
    public AppRole save(AppRole appRole) {
        return roleRepo.save(appRole);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public AppRole findByName(String name) {
        return roleRepo.findByName(name);
    }
}
