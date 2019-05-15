package vendedores;

public class Vendedor {
    private int numvend;
    private String nomvend;
    private String nombrecomer;
    private String provincia;
    private String localidad;
    private String direccion;
    
    public Vendedor(int numv, String nomv, String nomcom, String prov, String loc, String dir) {
       numvend = numv;
       nomvend = nomv;
       nombrecomer = nomcom;
       provincia = prov;
       localidad = loc;
       direccion = dir;
    }
    
    public void setNumvend(int numv) {
        numvend = numv;
    }
    
    public int getNumvend() {
        return numvend;
    }
    
    public void setNomvend(String nomv) {
        nomvend = nomv;
    }
    
    public String getNomvend() {
        return nomvend;
    }
    
    public void setNombrecomer(String nomcom) {
        nombrecomer = nomcom;
    }
    
    public String getNombrecomer() {
        return nombrecomer;
    }
    
    public void setProvincia(String prov) {
        provincia = prov;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    public void setLocalidad(String loc) {
        localidad = loc;
    }
    
    public String getLocalidad() {
        return localidad;
    }
    
    public void setDireccion(String dir) {
        direccion = dir;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public boolean equals(Object obj) {
        Vendedor vend = (Vendedor) obj;
        boolean iguales = false;
        
        if(nomvend.equals(vend.getNomvend()) && numvend==vend.getNumvend()) {
            iguales = true;
        }
        
        return iguales;
    }
}
