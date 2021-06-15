package com.example.dao;

import com.example.model.Project;
import com.example.service.DateParser;
import com.example.utils.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class ProjectDao {
    //增加项目
    public static void insert(Project project) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into project(id, name, auth_num, start_time, end_time, principal, create_time, update_time, deleted)";
            sql += "value(?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, project.getId());
            pstmt.setString(2, project.getName());
            pstmt.setString(3, project.getAuth_num());
            pstmt.setTimestamp(4, DateParser.utilToSql(project.getStart_time()));
            pstmt.setTimestamp(5, DateParser.utilToSql(project.getEnd_time()));
            pstmt.setString(6, project.getPrincipal());
            pstmt.setTimestamp(7, DateParser.utilToSql(project.getCreate_time()));
            pstmt.setTimestamp(8, DateParser.utilToSql(project.getUpdate_time()));
            pstmt.setInt(9, project.getDeleted());

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改项目
    public static void update(Project project) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update project set name = ?,  auth_num = ?, start_time = ?, end_time = ?, principal = ?, create_time = ?, update_time = ?, deleted = ? ";
            sql += "where id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, project.getName());
            pstmt.setString(2, project.getAuth_num());
            pstmt.setTimestamp(3, DateParser.utilToSql(project.getStart_time()));
            pstmt.setTimestamp(4, DateParser.utilToSql(project.getEnd_time()));
            pstmt.setString(5, project.getPrincipal());
            pstmt.setTimestamp(6, DateParser.utilToSql(project.getCreate_time()));
            pstmt.setTimestamp(7, DateParser.utilToSql(project.getUpdate_time()));
            pstmt.setInt(8, project.getDeleted());
            pstmt.setInt(9, project.getId());
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

    //查找项目
    public static List<Project> select(Integer id, String name, Integer auth_num){
        try {

            String sql = "select id, name, auth_num, start_time, end_time, principal, create_time, update_time, deleted from project ";
            sql += "where 1=1 ";
            if (id != null){
                sql += "and id = '" + id + "' ";
            }
            if (name != null){
                sql += "and name = '" + name + "' ";
            }
            if (auth_num != null){
                sql += "and type = '" + auth_num + "' ";
            }
            sql += ";";
            return fillResult(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }


    private static List<Project> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<Project> projectlist = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Project project = new Project(rs.getInt("id"), rs.getString("name"),
                    rs.getString("auth_num"),(java.util.Date)rs.getDate("start_time"),
                    (java.util.Date)rs.getDate("end_time"), rs.getString("principal"),
                    rs.getDate("create_time"),rs.getDate("update_time"),rs.getInt("deleted"));
            projectlist.add(project);
        }

        DbUtil.release(pstmt, conn);
        return projectlist;
    }
}
