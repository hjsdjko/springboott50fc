package com.entity.model;

import com.entity.QiuzhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 球桌信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public class QiuzhuoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 会员时价
	 */
	
	private Integer huiyuanshijia;
		
	/**
	 * 普通时价
	 */
	
	private Integer putongshijia;
		
	/**
	 * 球桌状态
	 */
	
	private String qiuzhuozhuangtai;
		
	/**
	 * 球桌详情
	 */
	
	private String qiuzhuoxiangqing;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：会员时价
	 */
	 
	public void setHuiyuanshijia(Integer huiyuanshijia) {
		this.huiyuanshijia = huiyuanshijia;
	}
	
	/**
	 * 获取：会员时价
	 */
	public Integer getHuiyuanshijia() {
		return huiyuanshijia;
	}
				
	
	/**
	 * 设置：普通时价
	 */
	 
	public void setPutongshijia(Integer putongshijia) {
		this.putongshijia = putongshijia;
	}
	
	/**
	 * 获取：普通时价
	 */
	public Integer getPutongshijia() {
		return putongshijia;
	}
				
	
	/**
	 * 设置：球桌状态
	 */
	 
	public void setQiuzhuozhuangtai(String qiuzhuozhuangtai) {
		this.qiuzhuozhuangtai = qiuzhuozhuangtai;
	}
	
	/**
	 * 获取：球桌状态
	 */
	public String getQiuzhuozhuangtai() {
		return qiuzhuozhuangtai;
	}
				
	
	/**
	 * 设置：球桌详情
	 */
	 
	public void setQiuzhuoxiangqing(String qiuzhuoxiangqing) {
		this.qiuzhuoxiangqing = qiuzhuoxiangqing;
	}
	
	/**
	 * 获取：球桌详情
	 */
	public String getQiuzhuoxiangqing() {
		return qiuzhuoxiangqing;
	}
			
}
