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

package io.gs2.stamina;

import java.util.ArrayList;
import java.util.List;

import io.gs2.util.EncodingUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.stamina.control.*;

/**
 * GS2 Stamina API クライアント
 *
 * @author Game Server Services, Inc.
 *
 */
public class Gs2StaminaClient extends AbstractGs2Client<Gs2StaminaClient> {

	public static String ENDPOINT = "stamina";

	/**
	 * コンストラクタ。
	 *
	 * @param credential 認証情報
	 */
	public Gs2StaminaClient(IGs2Credential credential) {
		super(credential);
	}


	/**
	 * スタミナを増減します<br>
	 * <br>
	 * - 消費クオータ: 5<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public ChangeStaminaResult changeStamina(ChangeStaminaRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("maxValue", request.getMaxValue())
				.put("variation", request.getVariation());

        if(request.getOverflow() != null) body.put("overflow", request.getOverflow());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "/stamina",
				credential,
				ENDPOINT,
				ChangeStaminaRequest.Constant.MODULE,
				ChangeStaminaRequest.Constant.FUNCTION,
				body.toString());

        post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(post, ChangeStaminaResult.class);

	}


	/**
	 * スタミナを消費します。<br>
	 * このエンドポイントは回復に使用できません。<br>
	 * ポリシーで消費と回復を分けて管理したい場合に使用してください。<br>
	 * <br>
	 * - 消費クオータ: 5<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public ConsumeStaminaResult consumeStamina(ConsumeStaminaRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("maxValue", request.getMaxValue())
				.put("variation", request.getVariation());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "/stamina/consume",
				credential,
				ENDPOINT,
				ConsumeStaminaRequest.Constant.MODULE,
				ConsumeStaminaRequest.Constant.FUNCTION,
				body.toString());

        post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(post, ConsumeStaminaResult.class);

	}


	/**
	 * スタミナプールを新規作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public CreateStaminaPoolResult createStaminaPool(CreateStaminaPoolRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("increaseInterval", request.getIncreaseInterval())
				.put("name", request.getName())
				.put("serviceClass", request.getServiceClass());

        if(request.getDescription() != null) body.put("description", request.getDescription());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool",
				credential,
				ENDPOINT,
				CreateStaminaPoolRequest.Constant.MODULE,
				CreateStaminaPoolRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, CreateStaminaPoolResult.class);

	}


	/**
	 * スタミナプールを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteStaminaPool(DeleteStaminaPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteStaminaPoolRequest.Constant.MODULE,
				DeleteStaminaPoolRequest.Constant.FUNCTION);


		doRequest(delete, null);

	}


	/**
	 * サービスクラスの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool/serviceClass";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE,
				DescribeServiceClassRequest.Constant.FUNCTION);


		return doRequest(get, DescribeServiceClassResult.class);

	}


	/**
	 * スタミナプールの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeStaminaPoolResult describeStaminaPool(DescribeStaminaPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeStaminaPoolRequest.Constant.MODULE,
				DescribeStaminaPoolRequest.Constant.FUNCTION);


		return doRequest(get, DescribeStaminaPoolResult.class);

	}


	/**
	 * 現在のスタミナ値を取得します<br>
	 * <br>
	 * - 消費クオータ: 3<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetStaminaResult getStamina(GetStaminaRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "/stamina";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getMaxValue() != null) queryString.add(new BasicNameValuePair("maxValue", String.valueOf(request.getMaxValue())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetStaminaRequest.Constant.MODULE,
				GetStaminaRequest.Constant.FUNCTION);

        get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(get, GetStaminaResult.class);

	}


	/**
	 * スタミナプールを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetStaminaPoolResult getStaminaPool(GetStaminaPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetStaminaPoolRequest.Constant.MODULE,
				GetStaminaPoolRequest.Constant.FUNCTION);


		return doRequest(get, GetStaminaPoolResult.class);

	}


	/**
	 * スタミナプールの状態を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetStaminaPoolStatusResult getStaminaPoolStatus(GetStaminaPoolStatusRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "/status";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetStaminaPoolStatusRequest.Constant.MODULE,
				GetStaminaPoolStatusRequest.Constant.FUNCTION);


		return doRequest(get, GetStaminaPoolStatusResult.class);

	}


	/**
	 * スタミナプールを更新します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public UpdateStaminaPoolResult updateStaminaPool(UpdateStaminaPoolRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("serviceClass", request.getServiceClass())
				.put("increaseInterval", request.getIncreaseInterval());

        if(request.getDescription() != null) body.put("description", request.getDescription());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + (request.getStaminaPoolName() == null ? "null" : request.getStaminaPoolName()) + "",
				credential,
				ENDPOINT,
				UpdateStaminaPoolRequest.Constant.MODULE,
				UpdateStaminaPoolRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(put, UpdateStaminaPoolResult.class);

	}


}