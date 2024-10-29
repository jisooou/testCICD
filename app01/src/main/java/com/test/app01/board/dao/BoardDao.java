package com.test.app01.board.dao;

import com.test.app01.board.mapper.BoardMapper;
import com.test.app01.board.vo.BoardVo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final BoardMapper mapper;

    public int write(BoardVo vo) {
        //SQL
        return mapper.write(vo);
    }
}
