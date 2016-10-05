package io.gs2.stamina.control;

import io.gs2.stamina.model.Stamina;

/**
 * スタミナ操作結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class ChangeStaminaResult {

	/** スタミナ */
	Stamina item;
	/** 次回スタミナ回復のタイミング */
	Integer nextIncreaseTimestamp;
	
	/**
	 * 取得したスタミナを取得。
	 * 
	 * @return スタミナ
	 */
	public Stamina getItem() {
		return item;
	}
	
	/**
	 * スタミナを設定。
	 * 
	 * @param item スタミナ
	 */
	public void setItem(Stamina item) {
		this.item = item;
	}

	/**
	 * 次回スタミナ回復のタイミングを取得。
	 * 
	 * @return 次回スタミナ回復のタイミング
	 */
	public Integer getNextIncreaseTimestamp() {
		return nextIncreaseTimestamp;
	}

	/**
	 * 次回スタミナ回復のタイミングを設定。
	 * 
	 * @param nextIncreaseTimestamp 次回スタミナ回復のタイミング
	 */
	public void setNextIncreaseTimestamp(Integer nextIncreaseTimestamp) {
		this.nextIncreaseTimestamp = nextIncreaseTimestamp;
	}
}