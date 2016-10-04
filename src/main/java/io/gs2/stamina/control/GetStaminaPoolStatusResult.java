package io.gs2.stamina.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 受信ボックスの状態取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetStaminaPoolStatusResult {

	/** 受信ボックスの状態 */
	String status;
	
	/**
	 * 取得した受信ボックスの状態を取得。
	 * 
	 * @return 受信ボックス
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * 受信ボックスの状態を設定。
	 * 
	 * @param status 受信ボックス
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
