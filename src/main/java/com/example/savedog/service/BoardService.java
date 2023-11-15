package com.example.savedog.service;

import com.example.savedog.vo.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
  private final List<Board> boardList;

  public BoardService(List<Board> boardList){
    this.boardList = boardList;
  }

  public void addBoard(Board board){
    board.setId(boardList.size());
    boardList.add(board);
  }

  public List<Board> getBoardList(){
    return boardList;
  }

  public void deleteBoard(int index){
    boardList.remove(index);
  }
}
