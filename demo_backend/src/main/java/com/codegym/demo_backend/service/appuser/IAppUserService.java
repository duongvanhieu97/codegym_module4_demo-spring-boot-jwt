package com.codegym.demo_backend.service.appuser;

import com.codegym.demo_backend.model.AppUser;
import com.codegym.demo_backend.model.DTO.ICountRole;
import com.codegym.demo_backend.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Iterable<ICountRole> getRoleNumber();
}