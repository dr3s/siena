/*
 * Copyright 2008 Alberto Gimeno <gimenete at gmail.com>
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package siena;

public class SienaRestrictedApiException extends RuntimeException {
	private static final long serialVersionUID = -5078174427412462781L;

	public String db;
	public String api;
	
	public SienaRestrictedApiException(String db, String api) {
		super("Siena[db=" + db + "][api=" + api + "] Restricted Usage");
		this.db = db;
		this.api = api;
	}

	public SienaRestrictedApiException(String db, String api, String message, Throwable cause) {
		super("Siena[db=" + db + "]" +
				"[api=" + api + "] " +
				"Restricted Usage - Message:" + message, cause);
		this.db = db;
		this.api = api;
	}

	public SienaRestrictedApiException(String db, String api, String message) {
		super("Siena[db=" + db + "]" +
				"[api=" + api + "] " +
				"Restricted Usage - Message:" + message);
		this.db = db;
		this.api = api;
	}

	public SienaRestrictedApiException(String db, String api, Throwable cause) {
		super("Siena[db=" + db + "]" +
				"[api=" + api + "] " +
				"Restricted Usage", cause);
		this.db = db;
		this.api = api;
	}

	/*@Override
	public String getMessage() {
		return 	"Siena[db=" + db + "]" +
				"[api=" + api + "] " +
				"Restricted Usage - Message:" + super.getMessage();
	}*/
	
}
