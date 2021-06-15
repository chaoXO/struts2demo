package com.example.dao;

import com.example.model.Member;
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
public class MemberDao {
    //增加成员
    public static void insert(Member member) {

        try {
            Connection conn = DbUtil.getConnection();
            String sql = "insert into member(id, name, email, remark, graduated, type, research_direction, achievement, url, member_img, deleted)";
            sql += "value(?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getRemark());
            pstmt.setInt(5, member.getGraduated());
            pstmt.setInt(6, member.getType());
            pstmt.setString(7, member.getResearch_direction());
            pstmt.setString(8, member.getAchievement());
            pstmt.setString(9, member.getUrl());
            pstmt.setString(10, member.getMember_img());
            pstmt.setInt(11, member.getDeleted());

            pstmt.executeUpdate();
            DbUtil.release(pstmt, conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //修改成员
    public static void update(Member member) {
        try {
            Connection conn = DbUtil.getConnection();
            String sql = "update member set name = ?, email = ?, remark = ?, graduated = ?, type = ?, research_direction = ?, achievement = ?, url = ?, member_img = ?, deleted = ? ";
            sql += "where id = ? and name = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getRemark());
            pstmt.setInt(4, member.getGraduated());
            pstmt.setInt(5, member.getType());
            pstmt.setString(6, member.getResearch_direction());
            pstmt.setString(7, member.getAchievement());
            pstmt.setString(8, member.getUrl());
            pstmt.setString(9, member.getMember_img());
            pstmt.setInt(10, member.getDeleted());
            pstmt.setInt(11, member.getId());
            pstmt.setString(12, member.getName());
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

    //查找成员
    public static List<Member> select(Integer id, String name, Integer type){
        try {
            String sql = "select id, name, email, remark, graduated, type, research_direction, achievement, url, member_img, deleted from member ";
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


    private static List<Member> fillResult(String sql) throws SQLException,ClassNotFoundException{
        List<Member> members = new LinkedList<>();
        Connection conn = DbUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Member member = new Member(rs.getInt("id"), rs.getString("name"),
                    rs.getString("email"),rs.getString("remark"),rs.getInt("graduated"),
                    rs.getInt("type"), rs.getString("research_direction"),rs.getString("achievement"),
                    rs.getString("url"),rs.getString("member_img"),rs.getInt("deleted"));
            members.add(member);
        }

        DbUtil.release(pstmt, conn);
        return members;
    }
}
