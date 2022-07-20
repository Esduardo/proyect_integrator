package upchiapas.proyect.models;

import java.util.ArrayList;

public class ValideUser {
    protected static ArrayList<Admin> admins =  new ArrayList<>();

    public ValideUser(){
        admins.add(new Admin("Esduardo", "admin", "123"));
        admins.add(new Admin("Pedro", "admin", "321"));
    }

    public boolean autenticarUser(String userName, String password){
        boolean status =  false;
        Admin user = findUser(userName);
        if( user != null && user.getPassword().equals(password)){
            status =  true;
        }
        return status;
    }

    private Admin findUser(String username){
        boolean status =  false;
        Admin user =  null;
        int index = 0;
        while(!status && index < admins.size()){
            if(admins.get(index).getEmail().equals(username)) {
                user = admins.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
}
