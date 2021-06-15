package com.example.dao;

import com.example.model.User;
import com.example.service.DateParser;
import com.example.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class UserDao {
    //增加用户
    public static void insert(User user) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into user(id, name, password, type, user_img, create_time, update_time, deleted)";
            sql += "value(?,?,?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,user.getId());
            pstmt.setString(2,user.getName());
            pstmt.setString(3,user.getPassword());
            pstmt.setInt(4,user.getType());
            pstmt.setString(5,user.getUser_img());
            pstmt.setTimestamp(6, DateParser.utilToSql(user.getCreate_time()));
            pstmt.setTimestamp(7, DateParser.utilToSql(user.getUpdate_time()));
            pstmt.setInt(8,0);

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改用户
    public static void update(User user) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update user set name = ?, password =?, type = ?, user_img = ?, create_time = ?, update_time = ?,deleted = ? ";
            sql += "where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getType());
            pstmt.setString(4, user.getUser_img());
            pstmt.setTimestamp(5, DateParser.utilToSql(user.getCreate_time()));
            pstmt.setTimestamp(6, DateParser.utilToSql(user.getUpdate_time()));
            pstmt.setInt(7, user.getDeleted());
            pstmt.setInt(8, user.getId());
            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        };
    }

    //todo:修改删除为设置deleted为1
    //删除用户(物理)
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
    public static List<User> select(Integer id, String name, Integer type){
        try {

            String sql = "select id, name, password, type, user_img, create_time, update_time, deleted from user ";
            sql += "where 1=1 ";
            if (id != null){
                sql += "and id = '" + id + "' ";
            }
            if (name != null){
                sql += "and name = '" + name + "' ";
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


    private static List<User> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<User> deptList = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            User user = new User(rs.getInt("id"), rs.getString("name"),
                    rs.getString("password"),rs.getInt("type"),rs.getString("user_img"),
                    rs.getDate("create_time"),rs.getDate("update_time"),rs.getInt("deleted"));
            deptList.add(user);
        }

        DbUtil.release(pstmt, conn);
        return deptList;
    }
}
