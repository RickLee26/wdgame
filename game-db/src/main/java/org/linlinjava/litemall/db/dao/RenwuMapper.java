package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.Renwu;
import org.linlinjava.litemall.db.domain.example.RenwuExample;

public interface RenwuMapper {
    long countByExample(RenwuExample example);

    int deleteByExample(RenwuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Renwu record);

    int insertSelective(Renwu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Renwu selectOneByExample(RenwuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Renwu selectOneByExampleSelective(@Param("example") RenwuExample example, @Param("selective") Renwu.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<Renwu> selectByExampleSelective(@Param("example") RenwuExample example, @Param("selective") Renwu.Column ... selective);

    List<Renwu> selectByExample(RenwuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Renwu selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Renwu.Column ... selective);

    Renwu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Renwu selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Renwu record, @Param("example") RenwuExample example);

    int updateByExample(@Param("record") Renwu record, @Param("example") RenwuExample example);

    int updateByPrimaryKeySelective(Renwu record);

    int updateByPrimaryKey(Renwu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") RenwuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renwu
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}