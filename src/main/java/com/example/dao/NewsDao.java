package com.example.dao;

import com.example.model.News;
import com.example.model.User;
import com.example.service.DateParser;
import com.example.utils.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class NewsDao {
    //增加新闻
    public static void insert(News news) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into news(id, title, writer, text, img, create_time, update_time, deleted)";
            sql += "value(?,?,?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, news.getId());
            pstmt.setString(2, news.getTitle());
            pstmt.setString(3, news.getWriter());
            pstmt.setString(4, news.getText());
            pstmt.setString(5, news.getImg());
            pstmt.setTimestamp(6, DateParser.utilToSql(news.getCreate_time()));
            pstmt.setTimestamp(7, DateParser.utilToSql(news.getUpdate_time()));
            pstmt.setInt(8,0);

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改新闻
    public static void update(News news) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update news set title = ?, writer =?, text = ?, img = ?, create_time = ?, update_time = ?,deleted = ? ";
            sql += "where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, news.getTitle());
            pstmt.setString(2, news.getWriter());
            pstmt.setString(3, news.getText());
            pstmt.setString(4, news.getImg());
            pstmt.setTimestamp(5, DateParser.utilToSql(news.getCreate_time()));
            pstmt.setTimestamp(6, DateParser.utilToSql(news.getUpdate_time()));
            pstmt.setInt(7, news.getDeleted());
            pstmt.setInt(8, news.getId());
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

    //查找新闻
    public static List<News> select(Integer id, String title, Integer writer,Integer deleted){
        try {

            String sql = "select id, title, writer, text, img, create_time, update_time, deleted from news ";
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
            if (deleted != null){
                sql += "and deleted = '" + deleted + "' ";
            }
            sql += ";";
            return fillResult(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }


    private static List<News> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<News> newsList = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            News news = new News(rs.getInt("id"), rs.getString("title"),
                    rs.getString("writer"),rs.getString("text"),rs.getString("img"),
                    rs.getDate("create_time"),rs.getDate("update_time"),rs.getInt("deleted"));
            newsList.add(news);
        }

        DbUtil.release(pstmt, conn);
        return newsList;
    }
}
