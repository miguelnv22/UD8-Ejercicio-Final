package vendedores;

import java.util.ArrayList;

public class Vendedores {

    private ArrayList<Vendedor> vendedores;
    
    public Vendedores() {
        vendedores = new ArrayList<Vendedor>();
    }
    
    public boolean Anaydir_Vendedor(Vendedor Obj) {
        boolean anyadir = true;
        if(vendedores.contains(Obj)) {
            anyadir = false;
        }
        else {
            vendedores.add(Obj);
        }
        
        return anyadir;
    }
    
    public boolean Eliminar_Vendedor(int numvend) {
        Vendedor v = Buscar_Vendedor(numvend);
        boolean eliminar = true;
        if(v==null) {
            eliminar = false;
        }
        else {
            vendedores.remove(numvend);
        }
        return eliminar;
    }
    
    public Vendedor Buscar_Vendedor(int numvend) {
        Vendedor v = null;
        for(int i=0;i<vendedores.size();i++) {
            if(vendedores.get(i).getNumvend()==numvend) {
                v = vendedores.get(i);
            }
        }
        
        return v;
    }
    
    public ArrayList<Vendedor> Buscar_Vendedor(String provincia) {
        ArrayList<Vendedor> v = new ArrayList<Vendedor>();
        for(int i = 0;i<vendedores.size();i++) {
            if(vendedores.get(i).getProvincia().equalsIgnoreCase(provincia)) {
                v.add(vendedores.get(i));
            }
        }
        return v;
    }
    
    public boolean Cargar_Datos(String provincia) {
        boolean cargar = false;
        DB_Tabla_Vendedores tv = new DB_Tabla_Vendedores();
        ArrayList<Vendedor> v  = tv.Buscar_Vendedor(provincia);
        
        if(v!=null) {
            vendedores = v;
            cargar = true;
        }
        
        return cargar;
    }
}
