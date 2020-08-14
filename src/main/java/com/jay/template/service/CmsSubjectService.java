package com.jay.template.service;

import com.jay.template.entity.CmsSubject;

import java.util.List;

public interface CmsSubjectService {
    List<CmsSubject> selectCmsSubjectList();

    CmsSubject selectCmsSubjectById(Long id);
}
