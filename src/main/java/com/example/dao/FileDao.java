package com.example.dao;

import com.example.model.MyFile;
import com.example.utils.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class FileDao {
    //增加文件
    public static void insert(MyFile myFile) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into file(id, url, type, create_time, update_time, deleted)";
            sql += "value(?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, myFile.getId());
            pstmt.setString(2, myFile.getUrl());
            pstmt.setInt(3, myFile.getType());
            pstmt.setDate(4, (Date) myFile.getCreate_time());
            pstmt.setDate(5, (Date) myFile.getCreate_time());
            pstmt.setInt(6,0);

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改用户
    public static void update(MyFile myFile) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update file set url = ?, type =?, create_time = ?, update_time = ?,deleted = ? ";
            sql += "where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, myFile.getUrl());
            pstmt.setInt(2, myFile.getType());
            pstmt.setDate(3, (Date) myFile.getCreate_time());
            pstmt.setDate(4, (Date) myFile.getUpdate_time());
            pstmt.setInt(6, myFile.getDeleted());
            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        };
    }

    //todo:修改删除为设置deleted为1
    //删除用户
    public static void delete(Integer id){
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "delete from user where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        };
    }

    //查找用户
    public static List<MyFile> select(Integer id, String url, Integer type){
        try {

            String sql = "select id, url, type, user_img, create_time, update_time deleted from user ";
            sql += "where 1=1 ";
            if (id != null){
                sql += "and id = '" + id + "' ";
            }
            if (url != null){
                sql += "and name = '" + url + "' ";
            }
            if (type != null){
                sql += "and type = '" + type + "' ";
            }
            sql += ";";
            return fillResult(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }


    private static List<MyFile> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<MyFile> filesList = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            MyFile file = new MyFile(rs.getInt("id"), rs.getString("url"),
                    rs.getInt("type"), (java.util.Date)rs.getDate("create_time")
                    ,(java.util.Date)rs.getDate("update_time"),rs.getInt("deleted"));
            filesList.add(file);
        }

        DbUtil.release(pstmt, conn);
        return filesList;
    }
}
