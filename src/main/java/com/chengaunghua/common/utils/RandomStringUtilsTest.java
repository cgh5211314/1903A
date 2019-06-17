/**
 * Create Date:2019年6月17日
 */
package com.chengaunghua.common.utils;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO 类功能描述 <br>
 * Author:陈广华(823865618@qq.com) <br>
 * Date:2019年6月17日
 */
public class RandomStringUtilsTest {

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomStringUtils#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomStringUtils#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomStringUtils#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseString() {
		for (int i = 0; i < 10; i++) {
			String r = RandomStringUtils.randomChineseString(4);
			System.out.println(r);
		}
	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomStringUtils#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
