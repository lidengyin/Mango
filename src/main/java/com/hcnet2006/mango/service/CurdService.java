package com.hcnet2006.mango.service;

import com.github.pagehelper.Page;
import com.hcnet2006.mango.page.PageRequest;
import com.hcnet2006.mango.page.PageResult;

import java.util.List;

/**
 * 通用CURD接口
 * @author lidengyin
 * @date Jan 12 2019
 */
public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 删除操作
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 批量删除操作
     * @param records
     * @return
     */
    int delete(List<T> records);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    Page<T> findPage(PageRequest pageRequest);

}
