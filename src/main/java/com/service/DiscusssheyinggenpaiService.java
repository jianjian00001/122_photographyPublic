package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssheyinggenpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssheyinggenpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssheyinggenpaiView;


/**
 * 摄影跟拍评论表
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:25
 */
public interface DiscusssheyinggenpaiService extends IService<DiscusssheyinggenpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssheyinggenpaiVO> selectListVO(Wrapper<DiscusssheyinggenpaiEntity> wrapper);
   	
   	DiscusssheyinggenpaiVO selectVO(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
   	
   	List<DiscusssheyinggenpaiView> selectListView(Wrapper<DiscusssheyinggenpaiEntity> wrapper);
   	
   	DiscusssheyinggenpaiView selectView(@Param("ew") Wrapper<DiscusssheyinggenpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssheyinggenpaiEntity> wrapper);
   	

}

