/**
 * Create Date:2019年6月17日
 */
package com.chengaunghua.common.test;

import java.util.Date;

import org.junit.Test;

import com.chengaunghua.common.utils.RandomUtil;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO Person实体类方法功能描述 <br>
 * Author:陈广华(823865618@qq.com) <br>
 * Date:2019年6月17日
 */
public class PersonUtils {
	@Test
	public void PersonTest() {
		for (int i = 0; i < 10000; i++) {
			System.out.print(RandomUtil.random(1, 120));
			System.out.println(new Date());
		}
	}
}
