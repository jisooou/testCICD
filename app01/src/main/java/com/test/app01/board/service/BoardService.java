package com.test.app01.board.service;

import com.test.app01.board.dao.BoardDao;
import com.test.app01.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public int write(BoardVo vo) {
        return dao.write(vo);
    }
}
