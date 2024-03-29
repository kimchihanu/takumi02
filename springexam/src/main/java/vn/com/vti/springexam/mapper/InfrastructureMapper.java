package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;

public interface InfrastructureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    long countByExample(InfrastructureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int deleteByExample(InfrastructureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int insert(Infrastructure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int insertSelective(Infrastructure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    List<Infrastructure> selectByExample(InfrastructureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    Infrastructure selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int updateByExampleSelective(@Param("record") Infrastructure record, @Param("example") InfrastructureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int updateByExample(@Param("record") Infrastructure record, @Param("example") InfrastructureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int updateByPrimaryKeySelective(Infrastructure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table infrastructure
     *
     * @mbg.generated Sat Mar 25 14:59:00 JST 2023
     */
    int updateByPrimaryKey(Infrastructure record);
}