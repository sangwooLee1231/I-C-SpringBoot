package com.example.spring4.board.service;


import com.example.spring4.board.dao.BoardMapper;
import com.example.spring4.board.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public int insertBoard(BoardVO boardVO) {
        return boardMapper.insertBoard(boardVO);
    }
    public int updateBoard(BoardVO boardVO) {
        return boardMapper.updateBoard(boardVO);

    }
    public int deleteBoard(int id) {
        return boardMapper.deleteBoard(id);
    }

    public BoardVO selectBoardByNo(int no) {
        return boardMapper.selectBoardByNo(no);
    }
    public List<BoardVO> getBoardByContent(String find) {
        return boardMapper.getBoardByContent(find);
    }

    public List<BoardVO> selectAllBoard() {
        return boardMapper.selectBoardAll();
    }



}
