package com.example.savedog.controller;

import com.example.savedog.service.BoardService;
import com.example.savedog.vo.Board;
import com.example.savedog.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class BoardController {
  private final BoardService boardService;
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  @GetMapping("/board")
  @ResponseBody
  public List<Board> getBoardList(){
    List<Board> board = boardService.getBoardList();
    return board;
  }

  @PostMapping("/board")
  @ResponseBody
  public Object addBoard(HttpServletResponse response, @RequestBody Board boardParam){
    Board board = new Board(boardParam.getContent());
    boardService.addBoard(board);

    response.setStatus(HttpServletResponse.SC_OK);
    return new Result(200, "Success");
  }

  public Object deleteBoard(HttpServletResponse response, @PathVariable("id") String id){
    boardService.deleteBoard(Integer.parseInt(id));

    response.setStatus(HttpServletResponse.SC_OK);
    return new Result(200,"Success");
  }


}
