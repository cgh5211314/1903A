/**
 * Create Date:2019年6月17日
 */
package com.chengaunghua.common.utils;

import java.util.Random;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO 工具类功能描述 <br>
 * Author:陈广华(823865618@qq.com) <br>
 * Date:2019年6月17日
 */
public class RandomUtil {
	/**
	 * <br>
	 * Title:TODO 类标题 <br>
	 * Description:TODO 实现两个数之间的区间功能描述 <br>
	 * Author:陈广华(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	public static int random(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min + 1) + min);
	}

	/**
	 * <br>
	 * Title:TODO 类标题 <br>
	 * Description:TODO 在最小值min与最大值max之间截取subs个不重复的随机数。
	 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的， [3,5,5]则不对， 因为5重复了功能描述 <br>
	 * Author:陈广华(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	public static int[] subRandom(int min, int max, int subs) {

		return null;
	}

	/**
	 * <br>
	 * Title:TODO 类标题 <br>
	 * Description:TODO 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 <br>
	 * Author:陈广华(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	// 方法3： (8分)
	public static String randomCharacter() {
		String str = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		Integer index = RandomUtil.random(0, str.length() - 1);
		return str.charAt(index) + "";
	}

	/**
	 * <br>
	 * Title:TODO 类标题 <br>
	 * Description:TODO 返回1个1-9,a-Z之间的随机字符功能描述 <br>
	 * Author:陈广华(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @param i
	 */
	// 方法4： (4分)
	public static String randomString(int i) {
		String str = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String d = "";
		for (int j = 0; j < i; j++) {
			Integer index = random(0, str.length() - 1);
			d += str.charAt(index);
		}
		return d;
	}

}
