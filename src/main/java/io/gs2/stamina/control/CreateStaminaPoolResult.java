package io.gs2.stamina.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.stamina.model.StaminaPool;

/**
 * スタミナプールの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateStaminaPoolResult {
	
	StaminaPool item;
	
	/**
	 * スタミナプールを取得。
	 * 
	 * @return スタミナプール
	 */
	public StaminaPool getItem() {
		return item;
	}
	
	/**
	 * スタミナプールを設定。
	 * 
	 * @param item スタミナプール
	 */
	public void setItem(StaminaPool item) {
		this.item = item;
	}
	
	/**
	 * スタミナプールを設定。
	 * 
	 * @param item スタミナプール
	 * @return this
	 */
	public CreateStaminaPoolResult withItem(StaminaPool item) {
		setItem(item);
		return this;
	}
}
