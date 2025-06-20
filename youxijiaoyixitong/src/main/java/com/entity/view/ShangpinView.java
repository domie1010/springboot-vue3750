package com.entity.view;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin")
public class ShangpinView extends ShangpinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 游戏类型的值
		*/
		private String shangpinValue;
		/**
		* 游戏玩法的值
		*/
		private String youxiwanfaValue;
		/**
		* 交易类型的值
		*/
		private String jiaoyileixingValue;
		/**
		* 操作方式的值
		*/
		private String caozuofangshiValue;
		/**
		* 是否热门的值
		*/
		private String remenValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShangpinView() {

	}

	public ShangpinView(ShangpinEntity shangpinEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 游戏类型的值
			*/
			public String getShangpinValue() {
				return shangpinValue;
			}
			/**
			* 设置： 游戏类型的值
			*/
			public void setShangpinValue(String shangpinValue) {
				this.shangpinValue = shangpinValue;
			}
			/**
			* 获取： 游戏玩法的值
			*/
			public String getYouxiwanfaValue() {
				return youxiwanfaValue;
			}
			/**
			* 设置： 游戏玩法的值
			*/
			public void setYouxiwanfaValue(String youxiwanfaValue) {
				this.youxiwanfaValue = youxiwanfaValue;
			}
			/**
			* 获取： 交易类型的值
			*/
			public String getJiaoyileixingValue() {
				return jiaoyileixingValue;
			}
			/**
			* 设置： 交易类型的值
			*/
			public void setJiaoyileixingValue(String jiaoyileixingValue) {
				this.jiaoyileixingValue = jiaoyileixingValue;
			}
			/**
			* 获取： 操作方式的值
			*/
			public String getCaozuofangshiValue() {
				return caozuofangshiValue;
			}
			/**
			* 设置： 操作方式的值
			*/
			public void setCaozuofangshiValue(String caozuofangshiValue) {
				this.caozuofangshiValue = caozuofangshiValue;
			}
			/**
			* 获取： 是否热门的值
			*/
			public String getRemenValue() {
				return remenValue;
			}
			/**
			* 设置： 是否热门的值
			*/
			public void setRemenValue(String remenValue) {
				this.remenValue = remenValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}












}
