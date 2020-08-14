package com.jay.template.dao;

import com.jay.template.entity.CmsSubject;

import java.util.List;

public interface CmsSubjectDao {

    List<CmsSubject> selectCmsSubjectList();

    CmsSubject selectCmsSubjectById(Long id);
}
