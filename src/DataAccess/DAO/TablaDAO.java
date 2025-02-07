package DataAccess.DAO;

import DataAccess.DTO.*;
import DataAccess.IDAO;
import DataAccess.SQLiteDataHelper;
import Framework.ExceptionLogger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TablaDAO extends SQLiteDataHelper implements IDAO<TablaDTO> {
    @Override
    public TablaDTO readBy(Integer id) throws Exception {
        TablaDTO dto = new TablaDTO();
        String query =" SELECT IdTabla      "
                     +"       ,IdFk         "
                     +"       ,Nombre       "
                     +"       ,Estado       "
                     +"       ,FechaCrea    " 
                     +"       ,FechaModifica" 
                     +" FROM  Tabla         "
                     +" WHERE IdTabla = " + id.toString() ;
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();    
            ResultSet rs   = stmt.executeQuery(query);
            while (rs.next()) {
                dto = new TablaDTO(  rs.getInt   (1)
                                    ,rs.getInt   (2)
                                    ,rs.getString(3)
                                    ,rs.getString(4)
                                    ,rs.getString(5)
                                    ,rs.getString(6));
            }
        } 
        catch (SQLException e) {
            throw new ExceptionLogger(e.getMessage(), getClass().getName(), "readBy()");
        }
        return dto;
    }

    @Override
    public List<TablaDTO> readAll() throws Exception {
        TablaDTO dto;
        List<TablaDTO> lst = new ArrayList<>();
        String query =" SELECT IdTabla      "
                     +"       ,IdFk         "
                     +"       ,Nombre       "
                     +"       ,Estado       "
                     +"       ,FechaCrea    " 
                     +"       ,FechaModifica" 
                     +" FROM  Tabla         ";
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();  
            ResultSet rs   = stmt.executeQuery(query);
            while (rs.next()) {
                dto = new TablaDTO(  rs.getInt   (1)
                                    ,rs.getInt   (2)
                                    ,rs.getString(3)
                                    ,rs.getString(4)
                                    ,rs.getString(5)
                                    ,rs.getString(6));
                lst.add(dto);
            }
        } 
        catch (SQLException e) {
            throw new ExceptionLogger(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst;
    }

    @Override
    public boolean create(TablaDTO entity) throws Exception {
        String query = " INSERT INTO Tabla (Nombre, IdFK) VALUES (?, ?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt   (1, entity.getIdFK());
            pstmt.setString(2, entity.getNombre());

            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ExceptionLogger(e.getMessage(), getClass().getName(), "create()"); 
        }
    }

    @Override
    public boolean update(TablaDTO entity) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String query = " UPDATE Tabla SET IdFK = ?, Nombre = ?, FechaModifica = ? WHERE IdTabla = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);

            pstmt.setInt   (1, entity.getIdFK());
            pstmt.setString(2, entity.getNombre());
            pstmt.setString(3, formatter.format(now));
            pstmt.setInt   (4, entity.getIdTabla());

            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ExceptionLogger(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String query = " UPDATE Tabla SET Estado = ?, FechaModifica = ?  WHERE IdTabla = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);

            pstmt.setString(1, "X");
            pstmt.setString(2, formatter.format(now));
            pstmt.setInt   (3, id);

            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new ExceptionLogger(e.getMessage(), getClass().getName(), "update()");
        }
    }
}
