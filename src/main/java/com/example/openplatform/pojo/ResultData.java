package com.example.openplatform.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sweeney
 * @since 2021/06/23 19:35 created.
 */
@Data
@Builder
public class ResultData {
    public boolean status;
    public Integer code;
    public Long count;
    public Object data;
    public Object result;
    public String message;
    public String msg;
}
