package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.Daili;
import org.linlinjava.litemall.db.domain.example.DailiExample;

public interface DailiMapper {
    long countByExample(DailiExample example);

    int deleteByExample(DailiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Daili record);

    int insertSelective(Daili record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Daili selectOneByExample(DailiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Daili selectOneByExampleSelective(@Param("example") DailiExample example, @Param("selective") Daili.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<Daili> selectByExampleSelective(@Param("example") DailiExample example, @Param("selective") Daili.Column ... selective);

    List<Daili> selectByExample(DailiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Daili selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Daili.Column ... selective);

    Daili selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Daili selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Daili record, @Param("example") DailiExample example);

    int updateByExample(@Param("record") Daili record, @Param("example") DailiExample example);

    int updateByPrimaryKeySelective(Daili record);

    int updateByPrimaryKey(Daili record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DailiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table daili
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}