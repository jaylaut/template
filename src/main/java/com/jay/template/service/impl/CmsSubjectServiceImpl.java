package com.jay.template.service.impl;

import com.jay.template.dao.CmsSubjectDao;
import com.jay.template.entity.CmsSubject;
import com.jay.template.service.CmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jay on 2020/8/6.
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {

    @Resource
    private CmsSubjectDao cmsSubjectDao;
    @Override
    public List<CmsSubject> selectCmsSubjectList() {
        return cmsSubjectDao.selectCmsSubjectList();
    }

    @Override
    public CmsSubject selectCmsSubjectById(Long id) {
        return cmsSubjectDao.selectCmsSubjectById(id);
    }
}
