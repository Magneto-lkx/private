package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;

	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList(){
		return brandService.selectOptionList();
	}

	@RequestMapping("/search")
	public PageResult search( @RequestBody TbBrand brand,int page,int rows){
		return brandService.findPage(brand,page,rows);
	}
	@RequestMapping("/delete")
	public Result delete(long [] ids){
		try {
			brandService.delete(ids);
			return new Result(true ,"删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	@RequestMapping("/findOne")
    public TbBrand findOne(long id){
	    return brandService.findOne(id);
    }
	@RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result(true ,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }


    }
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand){
		try{
			brandService.add(brand);
			return new Result(true ,"添加成功");
		}catch (Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}


	}

	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows){
		return brandService.findPage(page, rows);
	}


	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}

	
}
