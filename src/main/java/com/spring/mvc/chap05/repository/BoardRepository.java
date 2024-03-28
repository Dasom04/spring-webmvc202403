package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap05.entity.Board;

import java.util.List;

// 게시판 CRUD 기능 명세.
public interface BoardRepository {

    // 목록 조회
    List<Board> findAll();

    // 상세조회
    Board findOne(int boardNo);

    // 게시물 등록 - boolean 타입도 사용하지만 보통 void로 사용.
    void save(Board board);

    // 게시물 삭제
    void delete(int boardNo);

    // 조회수 처리
    void updateViewCount(int bno);
}
