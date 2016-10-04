package io.gs2.stamina.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * スタミナプール
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class StaminaPool implements Serializable {

	/** スタミナプールID */
	String staminaPoolId;
	/** オーナーID */
	String ownerId;
	/** 名前 */
	String name;
	/** 説明 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** スタミナの更新速度 */
	Integer increaseInterval;
	/** 登録日時 */
	Long createAt;
	/** 更新日時 */
	Long updateAt;
	
	/**
	 * スタミナプールIDを取得
	 * 
	 * @return スタミナプールID
	 */
	public String getStaminaPoolId() {
		return staminaPoolId;
	}
	
	/**
	 * スタミナプールIDを設定
	 * 
	 * @param staminaPoolId スタミナプールID
	 */
	public void setStaminaPoolId(String staminaPoolId) {
		this.staminaPoolId = staminaPoolId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * スタミナプール名を取得
	 * 
	 * @return スタミナプール名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * スタミナプール名を設定
	 * 
	 * @param name スタミナプール名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * サービスクラスを取得
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * スタミナ値の回復間隔(秒)を取得
	 * 
	 * @return スタミナ値の回復間隔(秒)
	 */
	public Integer getIncreaseInterval() {
		return increaseInterval;
	}
	
	/**
	 * スタミナ値の回復間隔(秒)を設定
	 * 
	 * @param increaseInterval スタミナ値の回復間隔(秒)
	 */
	public void setIncreaseInterval(Integer increaseInterval) {
		this.increaseInterval = increaseInterval;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}
