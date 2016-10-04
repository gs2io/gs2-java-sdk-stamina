package io.gs2.stamina.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * スタミナの操作リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class ChangeStaminaRequest extends Gs2UserRequest<ChangeStaminaRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "ChangeStamina";
	}
	
	/** スタミナプール名 */
	String staminaPoolName;
	/** スタミナの増減量 */
	Integer variation;
	/** スタミナの最大値 */
	Integer maxValue;
	/** スタミナの最大値を超えることを許容するか */
	Boolean overflow;
	
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
	public ChangeStaminaRequest withStaminaPoolName(String staminaPoolName) {
		setStaminaPoolName(staminaPoolName);
		return this;
	}

	/**
	 * スタミナの増減量を取得。
	 * 
	 * @return スタミナの増減量
	 */
	public Integer getVariation() {
		return variation;
	}
	
	/**
	 * スタミナの増減量を設定。
	 * 
	 * @param variation スタミナの増減量
	 */
	public void setVariation(Integer variation) {
		this.variation = variation;
	}
	
	/**
	 * スタミナの増減量を設定。
	 * 
	 * @param variation スタミナの増減量
	 * @return this
	 */
	public ChangeStaminaRequest withVariation(Integer variation) {
		setVariation(variation);
		return this;
	}

	/**
	 * スタミナの最大値を取得。
	 * 
	 * @return スタミナの最大値
	 */
	public Integer getMaxValue() {
		return maxValue;
	}
	
	/**
	 * スタミナの最大値を設定。
	 * 
	 * @param maxValue スタミナの最大値
	 */
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
	
	/**
	 * スタミナの最大値を設定。
	 * 
	 * @param maxValue スタミナの最大値
	 * @return this
	 */
	public ChangeStaminaRequest withMaxValue(Integer maxValue) {
		setMaxValue(maxValue);
		return this;
	}

	/**
	 * スタミナの最大値を超えることを許容するかを取得。
	 * 
	 * @return スタミナの最大値を超えることを許容するか
	 */
	public Boolean getOverflow() {
		return overflow;
	}
	
	/**
	 * スタミナの最大値を超えることを許容するかを設定。
	 * 
	 * @param overflow スタミナの最大値を超えることを許容するか
	 */
	public void setOverflow(Boolean overflow) {
		this.overflow = overflow;
	}
	
	/**
	 * スタミナの最大値を超えることを許容するかを設定。
	 * 
	 * @param overflow スタミナの最大値を超えることを許容するか
	 * @return this
	 */
	public ChangeStaminaRequest withOverflow(Boolean overflow) {
		setOverflow(overflow);
		return this;
	}
}
