package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.NpcPoint;
import org.linlinjava.litemall.db.domain.example.NpcPointExample;

public interface NpcPointMapper {
    long countByExample(NpcPointExample example);

    int deleteByExample(NpcPointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NpcPoint record);

    int insertSelective(NpcPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NpcPoint selectOneByExample(NpcPointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NpcPoint selectOneByExampleSelective(@Param("example") NpcPointExample example, @Param("selective") NpcPoint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<NpcPoint> selectByExampleSelective(@Param("example") NpcPointExample example, @Param("selective") NpcPoint.Column ... selective);

    List<NpcPoint> selectByExample(NpcPointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NpcPoint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") NpcPoint.Column ... selective);

    NpcPoint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NpcPoint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") NpcPoint record, @Param("example") NpcPointExample example);

    int updateByExample(@Param("record") NpcPoint record, @Param("example") NpcPointExample example);

    int updateByPrimaryKeySelective(NpcPoint record);

    int updateByPrimaryKey(NpcPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") NpcPointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table npc_point
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}