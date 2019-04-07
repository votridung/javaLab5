/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class LoaiSP {
    public Connect cn= new Connect();
//Truy van tat ca du lieu trong Table LoaiSP
    public ResultSet ShowLoaiSP() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * FROM LoaiSP";
        return cn.LoadData(sql);
    }
//Truy van cac dong du lieu trong Table LoaiSP theo Maloai
    public ResultSet ShowLoaiSP(String ml) throws SQLException{
        String sql = "SELECT * FROM LoaiSP where Maloai='"+ml+"'";
        return cn.LoadData(sql);
    }
//Theo moi 1 dong du lieu vao table LoaiSP
    public void InsertData(String ml, String tl) throws SQLException{
        String sql = "Insert into LoaiSP values('"+ml+"',N'"+tl+"')";
        cn.UpdateData(sql);
    }
    public void EditData(String ml, String tl) throws SQLException {
        String sql = "Update LoaiSP set Tenloai=N'"+tl+"' where Maloai='"+ml+"'";
        cn.UpdateData(sql);
    }
//Xoa 1 dong du lieu vao table LoaiSP

    public void DeleteData(String ml) throws SQLException {
        String sql = "Delete from LoaiSP where Maloai='"+ml+"'";
        cn.UpdateData(sql);
    }
    public ResultSet ShowMaLoai() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT Maloai FROM LoaiSP";
        return cn.LoadData(sql);
    }
    public ResultSet ShowSanpham(String ml){
        String sql = "SELECT * FROM Sanpham a , LoaiSP b where a.Maloai = b.Maloai and  b.Maloai = '"+ml+"'";
        return cn.LoadData(sql);
    }
}
