package com.test.app01.board.controller;

import com.test.app01.board.service.BoardService;
import com.test.app01.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    //게시글 작성 (화면)
    @GetMapping("write")
    public String write(){
        return "board/write";
    }

    //게시글 작성
    @PostMapping("write")
    public String write(BoardVo vo){
        //service
        int result = service.write(vo);

        //result
        if(result != 1){
            return "common/error";
        }

        return "redirect:/aaaaa";
    }

    //      게시글 목록 조회
    @GetMapping("list")
    public void getBoardList(){

    }

    //      게시글 상세 조회
    @GetMapping("detail")
    public void getBoardByNo(){

    }

    //      게시글 삭제
    @GetMapping("delete")
    public void deleteByNo(String no){

    }

    //      게시글 수정
    @PostMapping("edit")
    public void editBoard(){

    }


}
