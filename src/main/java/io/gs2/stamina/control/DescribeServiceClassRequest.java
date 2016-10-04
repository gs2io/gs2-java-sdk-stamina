package io.gs2.stamina.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.stamina.Gs2Stamina;

/**
 * サービスクラス一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeServiceClassRequest extends Gs2BasicRequest<DescribeServiceClassRequest> {

	public static class Constant extends Gs2Stamina.Constant {
		public static final String FUNCTION = "DescribeServiceClass";
	}
}
