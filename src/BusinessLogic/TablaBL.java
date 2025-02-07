package BusinessLogic;

import DataAccess.DAO.TablaDAO;
import DataAccess.DTO.TablaDTO;
import java.util.List;

public class TablaBL {
    private TablaDTO Tabla; //cache
    private TablaDAO tDAO = new TablaDAO();

    public List<TablaDTO> getAll() throws Exception {
        return tDAO.readAll();
    }
    
    public TablaDTO getById(int idTabla) throws Exception {
        Tabla = tDAO.readBy(idTabla);
        return Tabla;
    }
    
    public boolean update(TablaDTO Tabla) throws Exception {
        return tDAO.update(Tabla);
    }
    
    public boolean delete(int idTabla) throws Exception {
        return tDAO.delete(idTabla);
    }
}
