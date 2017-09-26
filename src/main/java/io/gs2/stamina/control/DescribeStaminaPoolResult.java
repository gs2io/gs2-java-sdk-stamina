package io.gs2.stamina.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.stamina.model.StaminaPool;

/**
 * スタミナプール一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeStaminaPoolResult {

	/** スタミナプール一覧 */
	List<StaminaPool> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したスタミナプール数を取得。
	 * 
	 * @return 取得したスタミナプール数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count) {}
	
	/**
	 * 取得したスタミナプール一覧を取得。
	 * 
	 * @return スタミナプール一覧
	 */
	public List<StaminaPool> getItems() {
		return items;
	}
	
	/**
	 * スタミナプール一覧を設定。
	 * 
	 * @param items スタミナプール一覧
	 */
	public void setItems(List<StaminaPool> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeStaminaPoolRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
