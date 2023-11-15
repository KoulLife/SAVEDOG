package com.example.savedog.vo;

public class Result {
  int resultCode;
  String message;

  public Result(){}

  public Result(int resultCode, String message) {
    this.resultCode = resultCode;
    this.message = message;
  }

  public int getResult() {
    return resultCode;
  }

  public void setResult(int result) {
    this.resultCode = result;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
