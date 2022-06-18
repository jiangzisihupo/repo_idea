package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.PromotionSpace;

import java.util.List;

/**************************************
 * @author pan
 * @version 2022/6/7 21:37
 **************************************/
public interface CourseContentService {

    /*
    * 根据课程id 查询关联的章节信息及章节信息关联的课时信息
    * */
    public List<CourseSection> findSectionAndLessonById(Integer courseId);

    /*
    * 回显章节对应的课程信息
    * */
    public Course findCourseById (Integer courseId);

    /*
    *  新增章节信息
    * */
    public void saveSection(CourseSection courseSection);

    /*
    * 修改章节信息
    * */
    public void updateSection(CourseSection courseSection);

    /*
    * 修改章节状态
    * */
    public void updateSectionStatus(int id,int status);

}
