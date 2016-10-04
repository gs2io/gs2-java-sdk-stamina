package io.gs2.stamina;

import java.util.ArrayList;
import java.util.List;

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
import io.gs2.auth.Gs2AuthClient;
import io.gs2.model.IGs2Credential;
import io.gs2.stamina.control.ChangeStaminaRequest;
import io.gs2.stamina.control.ChangeStaminaResult;
import io.gs2.stamina.control.CreateStaminaPoolRequest;
import io.gs2.stamina.control.CreateStaminaPoolResult;
import io.gs2.stamina.control.DeleteStaminaPoolRequest;
import io.gs2.stamina.control.DescribeServiceClassRequest;
import io.gs2.stamina.control.DescribeServiceClassResult;
import io.gs2.stamina.control.DescribeStaminaPoolRequest;
import io.gs2.stamina.control.DescribeStaminaPoolResult;
import io.gs2.stamina.control.GetStaminaPoolRequest;
import io.gs2.stamina.control.GetStaminaPoolResult;
import io.gs2.stamina.control.GetStaminaPoolStatusRequest;
import io.gs2.stamina.control.GetStaminaPoolStatusResult;
import io.gs2.stamina.control.GetStaminaRequest;
import io.gs2.stamina.control.GetStaminaResult;
import io.gs2.stamina.control.UpdateStaminaPoolRequest;
import io.gs2.stamina.control.UpdateStaminaPoolResult;

/**
 * GS2-Stamina API クライアント
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
	 * サービスクラス一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return サービスクラス一覧
	 */
	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/serviceClass", 
				credential, 
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE, 
				DescribeServiceClassRequest.Constant.FUNCTION);
		return doRequest(get, DescribeServiceClassResult.class);
	}

	/**
	 * スタミナプールを作成。<br>
	 * <br>
	 * GS2-Staminaを利用するには、まずスタミナプールを作成する必要があります。<br>
	 * スタミナプールには複数のユーザのスタミナ値を格納することができます。<br>
	 * <br>
	 * スタミナプールの設定として、スタミナ値の回復速度を秒単位で指定できます。<br>
	 * この設定値を利用して、スタミナ値の回復処理を行いつつユーザごとに最新のスタミナ値を取得することができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateStaminaPoolResult createStaminaPool(CreateStaminaPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass())
				.put("increaseInterval", request.getIncreaseInterval());
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
	 * スタミナプール一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return スタミナプール一覧
	 */
	public DescribeStaminaPoolResult describeStaminaPool(DescribeStaminaPoolRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/staminaPool";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
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
	 * スタミナプールを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return スタミナプール
	 */
	public GetStaminaPoolResult getStaminaPool(GetStaminaPoolRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName(), 
				credential, 
				ENDPOINT,
				GetStaminaPoolRequest.Constant.MODULE, 
				GetStaminaPoolRequest.Constant.FUNCTION);
		return doRequest(get, GetStaminaPoolResult.class);
	}

	/**
	 * スタミナプールの状態を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return スタミナプールの状態
	 */
	public GetStaminaPoolStatusResult getStaminaPoolStatus(GetStaminaPoolStatusRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName() + "/status", 
				credential, 
				ENDPOINT,
				GetStaminaPoolStatusRequest.Constant.MODULE, 
				GetStaminaPoolStatusRequest.Constant.FUNCTION);
		return doRequest(get, GetStaminaPoolStatusResult.class);
	}

	/**
	 * スタミナプールを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateStaminaPoolResult updateStaminaPool(UpdateStaminaPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass())
				.put("increaseInterval", request.getIncreaseInterval());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName(), 
				credential, 
				ENDPOINT,
				UpdateStaminaPoolRequest.Constant.MODULE, 
				UpdateStaminaPoolRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateStaminaPoolResult.class);
	}

	/**
	 * スタミナプールを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteStaminaPool(DeleteStaminaPoolRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName(), 
				credential, 
				ENDPOINT,
				DeleteStaminaPoolRequest.Constant.MODULE, 
				DeleteStaminaPoolRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * スタミナ値を取得。<br>
	 * <br>
	 * 指定したユーザの最新のスタミナ値を取得します。<br>
	 * 回復処理などが行われた状態の値が応答されますので、そのままゲームで利用いただけます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return スタミナ値
	 */
	public GetStaminaResult getStamina(GetStaminaRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName() + "/stamina?maxValue=" + request.getMaxValue(), 
				credential, 
				ENDPOINT,
				GetStaminaRequest.Constant.MODULE, 
				GetStaminaRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, GetStaminaResult.class);
	}

	/**
	 * スタミナ値を増減させる。<br>
	 * <br>
	 * 同一ユーザに対するスタミナ値の増減処理が衝突した場合は、後でリクエストを出した側の処理が失敗します。<br>
	 * そのため、同時に複数のデバイスを利用してゲームを遊んでいる際に、一斉にクエストを開始することで1回分のスタミナ消費で2回ゲームが遊べてしまう。<br>
	 * というような不正行為を防ぐことが出来るようになっています。<br>
	 * <br>
	 * クエストに失敗した時に消費したスタミナ値を戻してあげる際や、スタミナ値の回復アイテムを利用した際などに<br>
	 * スタミナ値を増やす操作を行うことになりますが、その際に overflow に true を指定することで、スタミナ値の最大値を超える回復を行えます。<br>
	 * スタミナ値の上限を超えた部分は overflow フィールドに格納され、優先してそちらが消費されます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 増減結果
	 */
	public ChangeStaminaResult changeStamina(ChangeStaminaRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("variation", request.getVariation())
				.put("maxValue", request.getMaxValue())
				.put("overflow", request.getOverflow());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/staminaPool/" + request.getStaminaPoolName() + "/stamina", 
				credential, 
				ENDPOINT,
				ChangeStaminaRequest.Constant.MODULE, 
				ChangeStaminaRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, ChangeStaminaResult.class);
	}
}
