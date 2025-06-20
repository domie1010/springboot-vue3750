package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 订单投诉
 *
 * @author 
 * @email
 */
@TableName("tousu")
public class TousuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TousuEntity() {

	}

	public TousuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 商品订单
     */
    @TableField(value = "shangpin_order_id")

    private Integer shangpinOrderId;


    /**
     * 投诉编号
     */
    @TableField(value = "tousu_uuid_number")

    private String tousuUuidNumber;


    /**
     * 投诉标题
     */
    @TableField(value = "tousu_name")

    private String tousuName;


    /**
     * 投诉类型
     */
    @TableField(value = "tousu_types")

    private Integer tousuTypes;


    /**
     * 投诉内容
     */
    @TableField(value = "tousu_content")

    private String tousuContent;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 处理状态
     */
    @TableField(value = "chuli_types")

    private Integer chuliTypes;


    /**
     * 处理结果
     */
    @TableField(value = "chuli_content")

    private String chuliContent;


    /**
     * 处理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：商品订单
	 */
    public Integer getShangpinOrderId() {
        return shangpinOrderId;
    }
    /**
	 * 获取：商品订单
	 */

    public void setShangpinOrderId(Integer shangpinOrderId) {
        this.shangpinOrderId = shangpinOrderId;
    }
    /**
	 * 设置：投诉编号
	 */
    public String getTousuUuidNumber() {
        return tousuUuidNumber;
    }
    /**
	 * 获取：投诉编号
	 */

    public void setTousuUuidNumber(String tousuUuidNumber) {
        this.tousuUuidNumber = tousuUuidNumber;
    }
    /**
	 * 设置：投诉标题
	 */
    public String getTousuName() {
        return tousuName;
    }
    /**
	 * 获取：投诉标题
	 */

    public void setTousuName(String tousuName) {
        this.tousuName = tousuName;
    }
    /**
	 * 设置：投诉类型
	 */
    public Integer getTousuTypes() {
        return tousuTypes;
    }
    /**
	 * 获取：投诉类型
	 */

    public void setTousuTypes(Integer tousuTypes) {
        this.tousuTypes = tousuTypes;
    }
    /**
	 * 设置：投诉内容
	 */
    public String getTousuContent() {
        return tousuContent;
    }
    /**
	 * 获取：投诉内容
	 */

    public void setTousuContent(String tousuContent) {
        this.tousuContent = tousuContent;
    }
    /**
	 * 设置：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：投诉时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：处理状态
	 */
    public Integer getChuliTypes() {
        return chuliTypes;
    }
    /**
	 * 获取：处理状态
	 */

    public void setChuliTypes(Integer chuliTypes) {
        this.chuliTypes = chuliTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getChuliContent() {
        return chuliContent;
    }
    /**
	 * 获取：处理结果
	 */

    public void setChuliContent(String chuliContent) {
        this.chuliContent = chuliContent;
    }
    /**
	 * 设置：处理时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 获取：处理时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tousu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", shangpinOrderId=" + shangpinOrderId +
            ", tousuUuidNumber=" + tousuUuidNumber +
            ", tousuName=" + tousuName +
            ", tousuTypes=" + tousuTypes +
            ", tousuContent=" + tousuContent +
            ", insertTime=" + insertTime +
            ", chuliTypes=" + chuliTypes +
            ", chuliContent=" + chuliContent +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
