package io.gs2.stamina.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.stamina.model.StaminaPool;

/**
 * スタミナプール取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetStaminaPoolResult {

	/** スタミナプール */
	StaminaPool item;
	
	/**
	 * 取得したスタミナプールを取得。
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
}
