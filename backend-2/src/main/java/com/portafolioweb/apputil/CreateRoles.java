package com.portafolioweb.apputil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.portafolioweb.appsecurityEntity.Rol;
import com.portafolioweb.appsecurityEnums.RolNombre;
import com.portafolioweb.appsecurityService.RolService;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
   Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
   Rol rolUser = new Rol(RolNombre.ROLE_USER);
    rolService.save(rolAdmin);
    rolService.save(rolUser);
     
         
    }
}
