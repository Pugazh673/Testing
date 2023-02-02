
package com.test;

import java.util.ArrayList;
import java.util.List;

public class Testig {

	public static void main(String[] arg) {

		List<Object> data1 = new ArrayList<>();
		List<Object> data2 = new ArrayList<>();
		List<Object> data3 = new ArrayList<>();
		data1.add("id1");
		data1.add("name1");
		data1.add("status1");
		data2.add("id2");
		data2.add("name2");
		data2.add("status2");
		data3.add("id3");
		data3.add("name3");
		data3.add("status3");
		List<Object> roles = new ArrayList<>();
		roles.add(data1);
		roles.add(data2);
		roles.add(data3);
		for(int i=0;i<=roles.size();i++) {
			roles.get(i);
		}
	}
}
