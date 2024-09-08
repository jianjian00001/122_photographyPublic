package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GenpaiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GenpaiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GenpaiyuyueView;


/**
 * 跟拍预约
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface GenpaiyuyueService extends IService<GenpaiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GenpaiyuyueVO> selectListVO(Wrapper<GenpaiyuyueEntity> wrapper);
   	
   	GenpaiyuyueVO selectVO(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
   	
   	List<GenpaiyuyueView> selectListView(Wrapper<GenpaiyuyueEntity> wrapper);
   	
   	GenpaiyuyueView selectView(@Param("ew") Wrapper<GenpaiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GenpaiyuyueEntity> wrapper);
   	

}

