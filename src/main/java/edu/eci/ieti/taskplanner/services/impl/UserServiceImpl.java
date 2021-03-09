package edu.eci.ieti.taskplanner.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import edu.eci.ieti.taskplanner.model.User;
import edu.eci.ieti.taskplanner.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<User>();
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        User user = null;
        for (User u: users){
            if (userId.equals(u.getId())){
                user = u;
            }
        }
        return user;
    }

    @Override
    public User create(User user) {
        this.users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        int index = -1;
        int i=0;
        User usu = null;
        while (i<users.size() && index==-1){
            String userId = users.get(i).getId(); 
            if (userId.equals(user.getId())){
                index = i;
            }
            i++;
        }
        if (index != -1){
            users.set(index, user);
            usu = user;
        }
        
        return usu;
    }

    @Override
    public void remove(String userId) {
        int index = -1;
        int i=0;
        while (i<users.size() && index==-1){
            if (userId.equals(users.get(i).getId())){
                index = i;
            }
            i++;
        }
        if (index != -1){
            users.remove(index);
        }
        
    }
    
}
