package io.gs2.stamina.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * 受信ボックスの状態取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetStaminaPoolStatusRequest extends Gs2BasicRequest<GetStaminaPoolStatusRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "GetStaminaPoolStatus";
	}

	/** スタミナプール名 */
	String staminaPoolName;

	/**
	 * スタミナプール名を取得。
	 * 
	 * @return スタミナプール名
	 */
	public String getStaminaPoolName() {
		return staminaPoolName;
	}
	
	/**
	 * スタミナプール名を設定。
	 * 
	 * @param staminaPoolName スタミナプール名
	 */
	public void setStaminaPoolName(String staminaPoolName) {
		this.staminaPoolName = staminaPoolName;
	}
	
	/**
	 * スタミナプール名を設定。
	 * 
	 * @param staminaPoolName スタミナプール名
	 * @return this
	 */
	public GetStaminaPoolStatusRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
		return this;
	}
}
