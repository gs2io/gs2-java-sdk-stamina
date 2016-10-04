package io.gs2.stamina.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * スタミナ
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Stamina implements Serializable {

	/** ユーザID */
	String userId;
	/** スタミナ値 */
	Integer value;
	/** 最大値を超えているスタミナ値 */
	Integer overflow;
	/** 更新日時 */
	Long lastUpdateAt;
	
	/**
	 * ユーザIDを取得
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * ユーザIDを設定
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * スタミナ値を取得
	 * 
	 * @return スタミナ値
	 */
	public Integer getValue() {
		return value;
	}
	
	/**
	 * スタミナ値を設定
	 * 
	 * @param value スタミナ値
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
	
	/**
	 * 最大値を超えているスタミナ値を取得
	 * 
	 * @return 最大値を超えているスタミナ値
	 */
	public Integer getOverflow() {
		return overflow;
	}
	
	/**
	 * 最大値を超えているスタミナ値を設定
	 * 
	 * @param overflow 最大値を超えているスタミナ値
	 */
	public void setOverflow(Integer overflow) {
		this.overflow = overflow;
	}
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getLastUpdateAt() {
		return lastUpdateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param lastUpdateAt 更新日時
	 */
	public void setLastUpdateAt(Long lastUpdateAt) {
		this.lastUpdateAt = lastUpdateAt;
	}
}
