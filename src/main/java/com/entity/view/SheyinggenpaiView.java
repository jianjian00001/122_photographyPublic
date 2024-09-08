package com.entity.view;

import com.entity.SheyinggenpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影跟拍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
@TableName("sheyinggenpai")
public class SheyinggenpaiView  extends SheyinggenpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyinggenpaiView(){
	}
 
 	public SheyinggenpaiView(SheyinggenpaiEntity sheyinggenpaiEntity){
 	try {
			BeanUtils.copyProperties(this, sheyinggenpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
