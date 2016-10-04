package io.gs2.stamina.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * スタミナプールの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetStaminaPoolRequest extends Gs2BasicRequest<GetStaminaPoolRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "GetStaminaPool";
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
	public GetStaminaPoolRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
		return this;
	}
}
