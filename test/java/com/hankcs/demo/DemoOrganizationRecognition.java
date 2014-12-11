/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:25</create-date>
 *
 * <copyright file="DemoChineseNameRecoginiton.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014+ 上海林原信息科技有限公司. All Right Reserved+ http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.seg.Dijkstra.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

/**
 * 机构名识别
 * @author hankcs
 */
public class DemoOrganizationRecognition
{
    public static void main(String[] args)
    {
        String[] testCase = new String[]{
                "济南杨铭宇餐饮管理有限公司是由杨先生创办的餐饮企业。",
                "我在上海林原科技有限公司兼职工作，",
                "同时在上海外国语大学学习外语。",
        };
        Segment segment = new Segment().enableOrganizationRecognize(true);
        for (String sentence : testCase)
        {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }
}