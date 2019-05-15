package vendedores;

import java.util.ArrayList;

public class DB_Tabla_Vendedores {
    private String conexion;
    
    public DB_Tabla_Vendedores() {
        
    }
    
    public boolean Anaydir_Vendedor(Vendedor Obj) {
        return true;
    }
    
    public boolean Modificar_Vendedor(int numvend, String[] datosModificar) {
        return true;
    }
    
    public boolean Borrar_Vendedor(int numvend) {
        return true;
    }
    
    public ArrayList<Vendedor> Buscar_Vendedor(String provincia) {
        return null;
    }
    
    public void Desconectar() {
        
    }
}
