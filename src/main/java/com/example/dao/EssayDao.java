package com.example.dao;

import com.example.model.Essay;
import com.example.service.DateParser;
import com.example.utils.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class EssayDao {
    //增加论文
    public static void insert(Essay essay) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into essay(id, file, title, writer, member, time, type, publisher, create_time, update_time, deleted)";
            sql += "value(?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, essay.getId());
            pstmt.setInt(2, essay.getFile());
            pstmt.setString(3, essay.getTitle());
            pstmt.setString(4, essay.getWriter());
            pstmt.setString(5, essay.getMember());
            pstmt.setTimestamp(6, DateParser.utilToSql(essay.getTime()));
            pstmt.setString(7, essay.getType());
            pstmt.setString(8, essay.getPublisher());
            pstmt.setTimestamp(9, DateParser.utilToSql(essay.getCreate_time()));
            pstmt.setTimestamp(10, DateParser.utilToSql(essay.getUpdate_time()));
            pstmt.setInt(11,0);


            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改论文
    public static void update(Essay essay) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update essay set file = ?, title = ?, writer = ?, member = ?, time = ?, type = ?, publisher = ?, create_time = ?, update_time = ?,deleted = ? ";
            sql += "where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, essay.getFile());
            pstmt.setString(2, essay.getTitle());
            pstmt.setString(3, essay.getWriter());
            pstmt.setString(4, essay.getMember());
            pstmt.setTimestamp(5, DateParser.utilToSql(essay.getTime()));
            pstmt.setString(6, essay.getType());
            pstmt.setString(7, essay.getPublisher());
            pstmt.setTimestamp(8,  DateParser.utilToSql(essay.getCreate_time()));
            pstmt.setTimestamp(9, DateParser.utilToSql(essay.getUpdate_time()));

            pstmt.setInt(10, essay.getDeleted());
            pstmt.setInt(11, essay.getId());
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
    public static List<Essay> select(Integer id, String title, String writer){
        try {

            String sql = "select id, file, title, writer, member, time, type, publisher, create_time, update_time,deleted from essay ";
            sql += "where 1=1 ";
            if (id != null){
                sql += "and id = '" + id + "' ";
            }
            if (title != null){
                sql += "and name = '" + title + "' ";
            }
            if (writer != null){
                sql += "and type = '" + writer + "' ";
            }
            sql += ";";
            return fillResult(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }


    private static List<Essay> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<Essay> essaysList = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Essay essay = new Essay(rs.getInt("id"), rs.getInt("file"),
                    rs.getString("title"),rs.getString("writer"),rs.getString("member"),
                    rs.getDate("time"),rs.getString("type"),rs.getString("publisher"),
                    rs.getDate("create_time"),rs.getDate("update_time"),rs.getInt("deleted"));
            essaysList.add(essay);
        }

        DbUtil.release(pstmt, conn);
        return essaysList;
    }
}
