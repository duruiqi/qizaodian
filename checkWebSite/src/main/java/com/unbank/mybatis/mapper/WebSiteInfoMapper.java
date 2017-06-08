package com.unbank.mybatis.mapper;

import com.unbank.mybatis.entity.WebSiteInfo;
import com.unbank.mybatis.entity.WebSiteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebSiteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int countByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int deleteByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int deleteByPrimaryKey(Integer websiteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int insert(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int insertSelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    List<WebSiteInfo> selectByExample(WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    WebSiteInfo selectByPrimaryKey(Integer websiteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int updateByExampleSelective(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int updateByExample(@Param("record") WebSiteInfo record, @Param("example") WebSiteInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int updateByPrimaryKeySelective(WebSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_website
     *
     * @mbggenerated Wed Aug 19 09:37:11 GMT+08:00 2015
     */
    int updateByPrimaryKey(WebSiteInfo record);
}