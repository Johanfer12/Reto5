package modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class DB {
    
    Connection conn;
    PreparedStatement statement;
    
    public DB() 
            
    {       
        String dbURL ="jdbc:mysql://localhost:3306/reto4";
        String username = "USERNAME";
        String password = "PASSWORD";
       
try{
    conn=DriverManager.getConnection(dbURL, username, password);
    
       if (conn != null ) {
        System.out.println ("Conectado");
    }
    
}
catch ( SQLException ex) 
{
    ex.printStackTrace ();
}
 }

public String agregar(String[] x) {
    
    String resultadoins = "";
    String sql=("INSERT INTO asistente VALUES (?,?,?,?,?,?,?)");
    
    try{
        
        statement = conn.prepareStatement(sql);
        
        statement.setString(1, x[0]);
        statement.setString(2, x[1]);
        statement.setString(3, x[2]);
        statement.setString(4, x[3]);
        statement.setString(5, x[4]);
        statement.setString(6, "default");
        statement.setString(7, x[5]);
        
        int rowsInserted = statement.executeUpdate();
        
        if (rowsInserted > 0) {
            
            System.out.println("Agregado exitosamente.");
            resultadoins = "Agregado exitosamente.";
        }
   
    }
        catch ( SQLException ex){
            
            Logger.getLogger(DB.class.getName()).log (Level.SEVERE, null, ex);
        }
    
    return resultadoins;
    
   }

public String[] consulta(String x){
    
String[] usuario = new String[7];
String sql = "SELECT * FROM asistente WHERE asi_login = \"" + x + "\"";

    try{
        
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        int flag = 0;
        while (result.next()){
              
            usuario[0] = result.getString(1);
            usuario[1] = result.getString(2);
            usuario[2] = result.getString(3);
            usuario[3] = result.getString(4);
            usuario[4] = result.getString(5);
            usuario[5] = result.getString(7);
            flag = 1;
            usuario[6] = "Usuario encontrado.";
            //Prueba de consulta de DB
            System.out.println ("Login : " +usuario[0] + " Nombre : " +usuario[1] + " Apellido : " +usuario[2] + " e-Mail : " +usuario[3] + " Teléfono : " +usuario[4] + " Ingreso : " +usuario[5] );        
            System.out.println(usuario[6]);
        }
        
        //Si el login buscado no se encuentra en la DB
        if (flag == 0){
            usuario[6] = "Usuario no encontrado.";
            System.out.println(usuario[6]);
        } 
    
    }

catch ( SQLException ex){
    
    Logger.getLogger(DB.class.getName()).log (Level.SEVERE, null, ex);
} 

   return usuario; 
}

public String actualizar(String[] x){
    
  String resultado = "";          
  String sql = "UPDATE asistente SET asi_login =?, asi_nombre =?, asi_apellido =?, usr_email =?, asi_celular =?, asi_fecha_nto =? WHERE asi_login =?";
  
  try{
      
      PreparedStatement statement =conn.prepareStatement(sql);
      
      statement.setString(1, x[0]);
      statement.setString(2, x[1]);
      statement.setString(3, x[2]);
      statement.setString(4, x[3]);
      statement.setString(5, x[4]);
      statement.setString(6, x[5]);
      statement.setString(7, x[0]);
      
      int rowsUpdated = statement.executeUpdate();
      
      if ( rowsUpdated > 0) {
          System.out.println ("DB: Actualizado exitosamente.");
          resultado = "Actualizado exitosamente.";
        }
    }
  
  catch ( SQLException ex){
      
      Logger.getLogger(DB.class.getName()).log (Level.SEVERE, null, ex);
    } 
return resultado;

}

public String borrar(String x){
    
    String delresultado = "cosa";
    
    String sql = "DELETE FROM asistente WHERE asi_login =?";
    
    try{
        PreparedStatement statement =conn.prepareStatement(sql);
        
        statement.setString(1, x);
        
        int rowsDeleted = statement.executeUpdate();
        
        if (rowsDeleted > 0) {
            System.out.println("DB Usuario eliminado.");
            delresultado = "Usuario " +x +" eliminado.";
        }
    }
catch ( SQLException ex){
    
        Logger.getLogger(DB.class.getName()).log (Level.SEVERE, null, ex);

} 

return delresultado;

}
}