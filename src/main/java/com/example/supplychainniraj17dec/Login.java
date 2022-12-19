package com.example.supplychainniraj17dec;

import java.sql.ResultSet;

public class Login {
    public boolean customerLogin(String email, String password){
        String query = String.format(" SELECT * FROM customer WHERE email = '%s' AND password = '%s' ");
        try{
            DatabaseConnection dbCon = new DatabaseConnection();
            ResultSet rs = dbCon.getQueryTable(query);
            if(rs != null && rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
