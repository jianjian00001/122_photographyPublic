package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingshiView;


/**
 * 摄影师
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface SheyingshiService extends IService<SheyingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingshiVO> selectListVO(Wrapper<SheyingshiEntity> wrapper);
   	
   	SheyingshiVO selectVO(@Param("ew") Wrapper<SheyingshiEntity> wrapper);
   	
   	List<SheyingshiView> selectListView(Wrapper<SheyingshiEntity> wrapper);
   	
   	SheyingshiView selectView(@Param("ew") Wrapper<SheyingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingshiEntity> wrapper);
   	

}

