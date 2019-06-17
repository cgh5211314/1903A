/**
 * Create Date:2019年6月17日
 */
package com.chengaunghua.common.test;

import org.junit.Test;

import com.chengaunghua.common.utils.RandomUtil;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO 类功能描述 <br>
 * Author:陈广华(823865618@qq.com) <br>
 * Date:2019年6月17日
 */
public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.random(0, 3));
		}
	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		for (int i = 0; i < 10; i++) {
			String r = RandomUtil.randomCharacter();
			System.out.println(r);
		}

	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomUtil#randomCharacter(int)}.
	 */
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			String r = RandomUtil.randomCharacter();
			System.out.println(r);
		}
	}

	/**
	 * Test method for
	 * {@link com.chengaunghua.common.utils.RandomUtil#randomString()}.
	 */
	@Test
	public void testRandomString() {
		for (int i = 0; i < 10; i++) {
			String r = RandomUtil.randomString(4);
			System.out.println(r);
		}
	}

}
