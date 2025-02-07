package DataAccess.DTO;

public class TablaDTO {
    private Integer IdTabla;
    public  Integer IdFK;    
    
    private String  Nombre;       
    private String  Estado;       
    private String  FechaCrea;    
    private String  FechaModifica;
    
    
    public TablaDTO(){ }
    public TablaDTO(Integer idFK, String nombre) {
        IdFK = idFK;
        Nombre = nombre;
    }
    public TablaDTO(Integer idTabla, Integer idFK, String nombre, String estado, String fechaCrea, String fechaModifica) {
        IdTabla = idTabla;
        IdFK = idFK;
        Nombre = nombre;
        Estado = estado;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    
    public Integer getIdTabla() {
        return IdTabla;
    }
    public void setIdTabla(Integer idTabla) {
        IdTabla = idTabla;
    }
    public Integer getIdFK() {
        return IdFK;
    }
    public void setIdFK(Integer idFK) {
        IdFK = idFK;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFechaCrea() {
        return FechaCrea;
    }
    public void setFechaCrea(String fechaCrea) {
        FechaCrea = fechaCrea;
    }
    public String getFechaModifica() {
        return FechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString(){
        return getClass().getName()
        + "\n IdTabla       : "+ getIdTabla      ()
        + "\n IdFK          : "+ getIdFK         ()
        + "\n Nombre        : "+ getNombre       ()
        + "\n Estado        : "+ getEstado       ()
        + "\n FechaCrea     : "+ getFechaCrea    ()
        + "\n FechaModifica : "+ getFechaModifica();
    }
}
