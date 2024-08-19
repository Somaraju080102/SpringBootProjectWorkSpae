package com.nani.mtm.serv;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.nani.mtm.Roles;
import com.nani.mtm.entity.Users;
import com.nani.mtm.repo.RolesRepo;
import com.nani.mtm.repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserRoleServ {
    
    @Autowired
    UserRepo userRepo;
    
    @Autowired
    RolesRepo rolesRepo;
    
    public void getData() {
    	 Optional<Users>uobj= userRepo.findById(1);
    	 if(uobj.isPresent()) {
    		 Users uans=uobj.get();
    		 
    		 System.out.println(uans.toString());
    		 
    		 Set<Roles> ansList=uans.getRoles();
    		 
    		 ansList.forEach(ans->System.out.println(ans.toString()));
    		 
    		 
    		 
    	 }
    	
    }
    
    @Transactional
    public void saveData() {
        
        Users u1 = new Users();
        u1.setUname("Somaraju");
        u1.setUphno("9177");
        
        Roles r1 = new Roles();
        r1.setRname("Admin");
        
        Roles r2 = new Roles();
        r2.setRname("Developer");
        
        // Synchronizing both sides of the relationship
        u1.getRoles().add(r1);
        u1.getRoles().add(r2);
        
        r1.getUsers().add(u1);
        r2.getUsers().add(u1);
        
        // Save users and roles
        rolesRepo.save(r1); // Save roles first to ensure proper persistence
        rolesRepo.save(r2);
        
        userRepo.save(u1); // Save the user after saving roles
        
        System.out.println("Data Saved Successfully");
    }
}
