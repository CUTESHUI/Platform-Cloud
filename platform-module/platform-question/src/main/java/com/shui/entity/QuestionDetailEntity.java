package com.shui.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目-题目表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
@Data
@TableName("question_detail")
public class QuestionDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 题目标题
	 */
	private String title;
	/**
	 * 题目解答
	 */
	private String answer;
	/**
	 * 题目难度等级
	 */
	private Integer level;
	/**
	 * 排序
	 */
	private Integer displayOrder;
	/**
	 * 副标题
	 */
	private String subTitle;
	/**
	 * 题目类型
	 */
	private Long type;
	/**
	 * 是否显示
	 */
	private Integer enable;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
