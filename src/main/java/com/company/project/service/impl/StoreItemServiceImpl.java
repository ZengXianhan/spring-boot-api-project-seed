package com.company.project.service.impl;

import com.company.project.dao.StoreItemMapper;
import com.company.project.model.StoreItem;
import com.company.project.service.StoreItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/10.
 */
@Service
@Transactional
public class StoreItemServiceImpl extends AbstractService<StoreItem> implements StoreItemService {
    @Resource
    private StoreItemMapper storeItemMapper;

}
