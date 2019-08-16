// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.entity.TestRecordEntity;
import com.wechat_study.demo.response.ApiResponse;
import com.wechat_study.demo.service.impl.GradeService;
import com.wechat_study.demo.service.impl.LinksService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName GradeQueryController
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/9 11:32
 * @ModifyDate 2019/8/9 11:32
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @Autowired
    private LinksService linksService;
    @GetMapping(value = "/query")
    @ApiOperation(value = "查询用户成绩单")
    public ApiResponse<?> queryGrade(
            @ApiParam(name = "openid", value = "用户唯一标识", required = true, defaultValue = "0")
            @RequestParam(value = "openid") String openid) {
        List<TestRecordEntity> recordEntities = gradeService.queryGrade(openid);
        if(null == recordEntities){
        return new ApiResponse<>();
        } else {
            return new ApiResponse<>(recordEntities);
        }
    }

    @GetMapping(value = "/set")
    @ApiOperation(value = "设置用户分数")
    public ApiResponse<?> setGrade(
            @ApiParam(name = "openid", value = "用户唯一标识", required = true, defaultValue = "0")
            @RequestParam("openid") String openid,
            @ApiParam(name = "bankId", value = "题库id", required = true, defaultValue = "0")
            @RequestParam("bankId") int bankId,
            @ApiParam(name = "grade", value = "成绩", required = true, defaultValue = "0")
            @RequestParam("grade") int grade,
            @ApiParam(name = "grade", value = "总分", required = true, defaultValue = "0")
            @RequestParam("total") int total
    ) {
        int res = gradeService.setGrade(openid,bankId,grade,total);
       if( res ==1) {
           return new ApiResponse<>("插入成绩记录成功");
       }else if( res == -2){
           return new ApiResponse(244L,"题库不存在");
       }else if( res == -1){
           return new ApiResponse(245L,"用户不存在");
       }else {
           return new ApiResponse(240L,"插入失败");
       }
    }

    @GetMapping(value = "/resource")
    @ApiOperation(value = "根据用户分数和所做题库推荐相应资料")
    public ApiResponse<?> getResource(
            @ApiParam(name = "ratio", value = "用户分数/总分", required = true, defaultValue = "0")
            @RequestParam("ratio") double ratio ,
            @ApiParam(name = "bankId", value = "题库ID", required = true, defaultValue = "0")
            @RequestParam("bankId") int bankId) {
        return new ApiResponse<>(linksService.getResource(ratio,bankId));
    }


}
