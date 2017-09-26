package io.gs2.stamina.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.stamina.model.Stamina;

/**
 * スタミナ取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetStaminaResult {

	/** スタミナ */
	Stamina item;
	/** 次回スタミナ回復のタイミング */
	Integer nextIncreaseTimestamp;
	
	/**
	 * スタミナを取得。
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
