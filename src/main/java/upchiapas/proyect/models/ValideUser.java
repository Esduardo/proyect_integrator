package upchiapas.proyect.models;

import java.util.ArrayList;

public class ValideUser {
    public static ArrayList<Caja> cajas =  new ArrayList<>();

    public ValideUser(){
        cajas.add(new Caja("Esduardo", "admin", "123"));
        cajas.add(new Caja("Pedro", "admin", "321"));
    }

    public boolean autenticarUser(String userName, String password){
        boolean status =  false;
        Caja user = findUser(userName);
        if( user != null && user.getPassword().equals(password)){
            status =  true;
        }
        return status;
    }

    private Caja findUser(String username){
        boolean status =  false;
        Caja user =  null;
        int index = 0;
        while(!status && index < cajas.size()){
            if(cajas.get(index).getEmail().equals(username)) {
                user = cajas.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
}
