/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.stamina.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.stamina.Gs2Stamina;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class CreateStaminaPoolRequest extends Gs2BasicRequest<CreateStaminaPoolRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "CreateStaminaPool";
	}

	/** スタミナの回復速度(秒) */
	private Integer increaseInterval;

	/** スタミナプールの名前 */
	private String name;

	/** スタミナプールのサービスクラス */
	private String serviceClass;

	/** スタミナプールの説明 */
	private String description;


	/**
	 * スタミナの回復速度(秒)を取得
	 *
	 * @return スタミナの回復速度(秒)
	 */
	public Integer getIncreaseInterval() {
		return increaseInterval;
	}

	/**
	 * スタミナの回復速度(秒)を設定
	 *
	 * @param increaseInterval スタミナの回復速度(秒)
	 */
	public void setIncreaseInterval(Integer increaseInterval) {
		this.increaseInterval = increaseInterval;
	}

	/**
	 * スタミナの回復速度(秒)を設定
	 *
	 * @param increaseInterval スタミナの回復速度(秒)
	 * @return this
	 */
	public CreateStaminaPoolRequest withIncreaseInterval(Integer increaseInterval) {
		setIncreaseInterval(increaseInterval);
		return this;
	}

	/**
	 * スタミナプールの名前を取得
	 *
	 * @return スタミナプールの名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * スタミナプールの名前を設定
	 *
	 * @param name スタミナプールの名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * スタミナプールの名前を設定
	 *
	 * @param name スタミナプールの名前
	 * @return this
	 */
	public CreateStaminaPoolRequest withName(String name) {
		setName(name);
		return this;
	}

	/**
	 * スタミナプールのサービスクラスを取得
	 *
	 * @return スタミナプールのサービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * スタミナプールのサービスクラスを設定
	 *
	 * @param serviceClass スタミナプールのサービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * スタミナプールのサービスクラスを設定
	 *
	 * @param serviceClass スタミナプールのサービスクラス
	 * @return this
	 */
	public CreateStaminaPoolRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * スタミナプールの説明を取得
	 *
	 * @return スタミナプールの説明
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * スタミナプールの説明を設定
	 *
	 * @param description スタミナプールの説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * スタミナプールの説明を設定
	 *
	 * @param description スタミナプールの説明
	 * @return this
	 */
	public CreateStaminaPoolRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

}