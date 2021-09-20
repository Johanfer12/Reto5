package control;
import modelo.Usuarios;

public class ControlUsuarios {
    
    Usuarios usuario;
    
//Constructor    
public ControlUsuarios(){
    
    usuario = new Usuarios();
    
    }

public String[] usuario_buscar(String campo1)        
{     
    usuario.setCampo1(campo1);
    usuario.buscar();
    String[] x = usuario.getEstado();
    return x;

}

public String usuario_actualizar(String[] user)        
{     
    usuario.setUser(user);
    usuario.actualizar();
    String x = usuario.getResultado();
    return x;

}

public String usuario_agregar(String[] newuser)        
{     
    usuario.setNewuser(newuser);
    usuario.agregar();
    String x = usuario.getResultadoins();
    return x;

}

public String usuario_borrar(String deluser)        
{     
    usuario.setDeluser(deluser);
    usuario.borrar();
    String x = usuario.getDelresultado();
    return x;

}

}
