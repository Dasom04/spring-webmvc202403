package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap05.entity.Board;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Board board = new Board(
                rs.getInt("board_no"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getInt("view_count"),
                rs.getTimestamp("reg_date").toLocalDateTime(),
                rs.getString("writer")
        );
        return board;
    }
}
