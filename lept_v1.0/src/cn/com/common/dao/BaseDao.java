package cn.com.common.dao;
/**
 *@autor   蔡伟乐
 *@date 2016年7月19日
 *@version 1.0
 *@Description:基础Dao
 */
public interface BaseDao {
	/**
	 * @title: save
	 * @description: 保存
	 * @param @param entity
	 * @return void
	 * @throw 
	 * @date 2016年7月19日 下午3:02:51 创建  蔡伟乐
	 * @变更记录
	 */
	public void save(Object entity);
	public void delete(Object entity);
	public void saveOrUpdate(Object entity);
}
