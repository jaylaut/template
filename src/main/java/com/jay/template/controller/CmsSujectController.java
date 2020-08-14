package com.jay.template.controller;

import com.jay.template.entity.CmsSubject;
import com.jay.template.service.CmsSubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jay on 2020/8/6.
 */
@Controller
@RequestMapping("/cmssubject")
public class CmsSujectController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsSujectController.class);
    @Resource
    private CmsSubjectService cmsSubjectService;

    @RequestMapping(value="list",method = RequestMethod.GET)
    @ResponseBody
    public List<CmsSubject> selectCmsSubject(){
        return cmsSubjectService.selectCmsSubjectList();
    }


}
