package io.gs2.stamina.control;

import io.gs2.stamina.model.StaminaPool;

/**
 * スタミナプールの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class UpdateStaminaPoolResult {
	
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
	public UpdateStaminaPoolResult withItem(StaminaPool item) {
		setItem(item);
		return this;
	}
}
