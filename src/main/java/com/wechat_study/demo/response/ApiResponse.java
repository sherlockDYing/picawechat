// Copyright 2016-2101 Pica.
package com.yunqueyi.wechatstudy.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ApiResponse
 * @Description 请求返回体
 * @Author caijia.rao
 * @Date 2019/8/7 16:20
 * @ModifyDate 2019/8/7 16:20
 * @Version 1.0
 */
@Data
public class ApiResponse<T> implements Serializable {

  private static final long serialVersionUID = 7408790903212368997L;

  private Long code = 0L;

  private String msg = "成功";

  private String version = "1.0";

  private Long timestamp = System.currentTimeMillis();

  private T data;

  public ApiResponse() {
  }

  public ApiResponse(T obj) {
    this.data = obj;
  }

  public ApiResponse(Long resCode, String resMsg) {
    this.code = resCode;
    this.msg = resMsg;
  }

  public ApiResponse<T> success() {
    return this;
  }


}
