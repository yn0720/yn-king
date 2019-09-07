/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: yn-common
 * @Package: com.yn.common.utils 
 * @Description: TODO
 * @author: 闫sir   
 * @date: 2019年9月6日 下午8:15:12 
 * @version: V1.0   
 */
package com.yn.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 闫sir
 * @date: 2019年9月6日 下午8:15:12  
 */
public class DateUtilTest {

	@Test
	public void test1() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 1, 8);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
