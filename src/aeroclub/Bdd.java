/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroclub;

import java.net.Socket;
import java.sql.*;

/**
 *
 * @author alexandre
 */
public class Bdd {
    Connection connection;
    Statement statement;
    String SQL;
    
    String url;
    String username;
    String password;
    Socket client;
    int port;
    String host;
    
    public Bdd(String url, String username, String password, String host,int port){
        this.url = url;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }
    
    //fonction qui permet la connection a la base de données
    public Connection connexionDatabase(){
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            System.out.println("erreur lors de la connexion");
            System.err.println(e.getMessage());
        }
        return connection;
    }
    
    public Connection closeConnexion(){
        try{
            connection.close();
        }catch(Exception e){
            System.err.println(e);
        }
        return connection;
    }
    
    //fonction qui sert a l'execution de requetes sql;
    public ResultSet executionQuery(String sql){
        connexionDatabase();
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
    }
    
    //fonction qui execute des requetes d'update
    public String executionUpdate(String sql){
        connexionDatabase();
        String result = "";
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result = sql;
        }catch(SQLException ex){
            result = ex.toString();
        }
        return result;
    }
    
    //fonction qui retourne le contenu d'une table passée en parametre
    public ResultSet querySelectAll(String nomTable){
        connexionDatabase();
        SQL = "SELECT * FROM "+ nomTable;
        System.out.println(SQL);
        return this.executionQuery(SQL);
    }
    
    //fonction qui retourne le contenu d'une table selon un etat
    public ResultSet querySelectAll(String nomTable, String etat){
        connexionDatabase();
        SQL = "SELECT * FROM "+ nomTable +" WHERE "+ etat;
        return this.executionQuery(SQL);
    }
    
    
    public ResultSet querySelect(String[] nomColonne, String nomTable){
        connexionDatabase();
        int i;
        SQL = "SELECT ";
        
        for(i=0; i<= nomColonne.length -1; i++){
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }
        
        SQL += " FROM "+ nomTable;
        return this.executionQuery(SQL);
    }
    
    public ResultSet fcSelectCommand(String[] nomColonne, String nomTable, String etat){
        connexionDatabase();
        int i;
        SQL = "SELECT ";
        
        for(i = 0; i <= nomColonne.length -1; i++){
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }
        
        SQL += " FROM "+ nomTable +" WHERE "+etat;
        return this.executionQuery(SQL);
    }
    
    //fonction d'insertion de données dans une table
    public String queryInsert(String nomTable, String[] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO "+ nomTable +" VALUES(";
        
        for(i = 0; i <= contenuTableau.length -1; i++){
            SQL += "'"+ contenuTableau[i] +"'";
            if(i < contenuTableau.length -1){
                SQL += ",";
            }
        }
        
        SQL += ")";
        return this.executionUpdate(SQL);
    }
    
    public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO "+ nomTable +"(";

        for(i = 0; i <= nomColonne.length -1; i++){
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }
        
        SQL += ") VALUES(";
        
        for(i = 0; i <= contenuTableau.length -1; i++){
            SQL += "'"+ contenuTableau[i] +"'";
            if(i < contenuTableau.length -1){
                SQL += ",";
            }
        }
        SQL += ")";
        return this.executionUpdate(SQL);
    }
    
    //fonction qui modifie un enregistrement
    public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String etat){
        connexionDatabase();
        int i;
        SQL = "UPDATE "+ nomTable +" SET ";
        
        for(i = 0; i <= nomColonne.length -1; i++){
            SQL += nomColonne[i]+ "='" + contenuTableau[i] +"'";
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }
        
        SQL += " WHERE " + etat;
        return this.executionUpdate(SQL);
    }
    
    //fonction pour supprimer
    public String queryDelete(String nomTable){
        connexionDatabase();
        SQL = "DELETE FROM" +nomTable;
        return this.executionUpdate(SQL);
    }
    
    public String queryDelete(String nomTable, String etat){
        connexionDatabase();
        SQL = "DELETE FROM "+ nomTable +" WHERE "+ etat;
        System.out.println(SQL);
        return this.executionUpdate(SQL);
    }
}
