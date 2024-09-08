package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyinggenpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyinggenpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyinggenpaiView;


/**
 * 摄影跟拍
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface SheyinggenpaiService extends IService<SheyinggenpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyinggenpaiVO> selectListVO(Wrapper<SheyinggenpaiEntity> wrapper);
   	
   	SheyinggenpaiVO selectVO(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
   	
   	List<SheyinggenpaiView> selectListView(Wrapper<SheyinggenpaiEntity> wrapper);
   	
   	SheyinggenpaiView selectView(@Param("ew") Wrapper<SheyinggenpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyinggenpaiEntity> wrapper);
   	

}

