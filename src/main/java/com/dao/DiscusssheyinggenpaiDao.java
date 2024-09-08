package com.dao;

import com.entity.DiscusssheyinggenpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssheyinggenpaiVO;
import com.entity.view.DiscusssheyinggenpaiView;


/**
 * 摄影跟拍评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:30:25
 */
public interface DiscusssheyinggenpaiDao extends BaseMapper<DiscusssheyinggenpaiEntity> {
	
	List<DiscusssheyinggenpaiVO> selectListVO(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
	
	DiscusssheyinggenpaiVO selectVO(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
	
	List<DiscusssheyinggenpaiView> selectListView(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);

	List<DiscusssheyinggenpaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
	
	DiscusssheyinggenpaiView selectView(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
	

}
