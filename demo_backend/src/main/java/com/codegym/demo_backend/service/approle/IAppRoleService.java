package com.codegym.demo_backend.service.approle;

import com.codegym.demo_backend.model.AppRole;
import com.codegym.demo_backend.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}