/*
 * Copyright 2009 Alberto Gimeno <gimenete at gmail.com>
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
package siena.aws.ddb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
	
	public String name;
	public Map<String, List<String>> attributes = new HashMap<String, List<String>>();
	
	public Item() {
	}
	
	public Item(String name) {
		this.name = name;
	}
	
	public void add(String attrname, String attrvalue) {
		List<String> list = attributes.get(attrname);
		if(list == null) {
			list = new ArrayList<String>();
			attributes.put(attrname, list);
		}
		list.add(attrvalue);
	}

}
