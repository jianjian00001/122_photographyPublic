package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GenpailiuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GenpailiuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GenpailiuchengView;


/**
 * 跟拍流程
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public interface GenpailiuchengService extends IService<GenpailiuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GenpailiuchengVO> selectListVO(Wrapper<GenpailiuchengEntity> wrapper);
   	
   	GenpailiuchengVO selectVO(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
   	
   	List<GenpailiuchengView> selectListView(Wrapper<GenpailiuchengEntity> wrapper);
   	
   	GenpailiuchengView selectView(@Param("ew") Wrapper<GenpailiuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GenpailiuchengEntity> wrapper);
   	

}

