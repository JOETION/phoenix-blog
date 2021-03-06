package com.snow.phoenix.blog.app.dao.mapper.phoenix_blog;

import com.snow.phoenix.blog.app.core.model.phoenix_blog.Blog;
import com.snow.phoenix.blog.app.core.model.phoenix_blog.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    Blog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoenix_blog..blog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Blog record);
}