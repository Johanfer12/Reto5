package modelo;
/*@author johan*/

public class Usuarios {
    
    private String campo1;
    private String[] estado;
    private String[] user;
    private String resultado;
    private String[] newuser;
    private String resultadoins;
    private String deluser;
    private String delresultado;    
      
    DB u =new DB();

 //Clases buscar   

 public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }   
 public String[] getEstado() {
     
     return estado;
    }

//Clases Actualizar

 public void setUser(String[] user) {
        this.user = user;
    }

 public String getResultado() {
     
     return resultado;
     
    }
 
 //Clases Agregar

 public void setNewuser(String[] newuser) {
        this.newuser = newuser;
    }

 public String getResultadoins() {
     
     return resultadoins;
     
    }
 
  //Clases Borrar

 public void setDeluser(String deluser) {
        this.deluser = deluser;
    }

 public String getDelresultado() {
     
     return delresultado;
     
    }
 
//Funciones llamadas por el control 
 
 public void buscar()      
            
    {
        estado = u.consulta(campo1);        

    }

 public void actualizar()      
            
    {
        resultado = u.actualizar(user);        

    }
 
  public void agregar()      
            
    {
        resultadoins = u.agregar(newuser);        

    }

  public void borrar()      
            
    {
        delresultado = u.borrar(deluser);        

    }  
}