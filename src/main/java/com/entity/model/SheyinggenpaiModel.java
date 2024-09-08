package com.entity.model;

import com.entity.SheyinggenpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 摄影跟拍
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
public class SheyinggenpaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐图片
	 */
	
	private String taocantupian;
		
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 套餐简介
	 */
	
	private String taocanjianjie;
		
	/**
	 * 拍摄地点
	 */
	
	private String paishedidian;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
		
	/**
	 * 套餐价格
	 */
	
	private Integer taocanjiage;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：套餐图片
	 */
	 
	public void setTaocantupian(String taocantupian) {
		this.taocantupian = taocantupian;
	}
	
	/**
	 * 获取：套餐图片
	 */
	public String getTaocantupian() {
		return taocantupian;
	}
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：套餐简介
	 */
	 
	public void setTaocanjianjie(String taocanjianjie) {
		this.taocanjianjie = taocanjianjie;
	}
	
	/**
	 * 获取：套餐简介
	 */
	public String getTaocanjianjie() {
		return taocanjianjie;
	}
				
	
	/**
	 * 设置：拍摄地点
	 */
	 
	public void setPaishedidian(String paishedidian) {
		this.paishedidian = paishedidian;
	}
	
	/**
	 * 获取：拍摄地点
	 */
	public String getPaishedidian() {
		return paishedidian;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
	}
				
	
	/**
	 * 设置：套餐价格
	 */
	 
	public void setTaocanjiage(Integer taocanjiage) {
		this.taocanjiage = taocanjiage;
	}
	
	/**
	 * 获取：套餐价格
	 */
	public Integer getTaocanjiage() {
		return taocanjiage;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
