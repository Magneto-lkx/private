package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {
	//品牌查询
	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);

	public void delete(long [] ids);

    public TbBrand findOne(long id);

    public void update(TbBrand brand);

	public void add(TbBrand brand);

	public PageResult findPage(int pageNum, int pageSize);

	public List<TbBrand> findAll();

	List<Map> selectOptionList();
	
}
