package com.test.app01.board.mapper;

import com.test.app01.board.vo.BoardVo;
import lombok.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO BOARD (NO , TITLE , CONTENT) VALUES (SEQ_BOARD.NEXTVAL , #{title} , #{content})")
    int write(BoardVo vo);

}
