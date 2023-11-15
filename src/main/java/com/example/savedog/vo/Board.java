package com.example.savedog.vo;

public class Board {
  private Integer id;
  private String content;

  public Board(){}

  public Board(String content){this.content = content;}
  public Integer getId(){return id;}
  public void setId(Integer id){this.id = id;}
  public String getContent(){return content;}
  public void setContent(String content){
    this.content = content;
  }
}
