package org.cc11001100.blog.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * 随笔实体
 *
 * @date 2017/7/29 22:21
 * @author CC11001100
 * @email CC11001100@qq.com
 */
public class Post {

    /**
     * 创建日期
     */
    private Date dateCreated;

    /**
     * 描述
     */
    private String description;

    /**
     * 标题
     */
    private String title;

    /**
     * 随笔分类
     */
    private List<String> categories;

    private Enclosure  enclosure;

    private String link;

    private String permalink;

    private String postid;

    private Source source;

    private String userId;

    private String mt_allow_comments;

    private String mt_allow_pings;

    private String mt_convert_breaks;

    private String mt_text_more;

    private String mt_excerpt;

    private String mt_keywords;

    private String wp_slug;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMt_allow_comments() {
        return mt_allow_comments;
    }

    public void setMt_allow_comments(String mt_allow_comments) {
        this.mt_allow_comments = mt_allow_comments;
    }

    public String getMt_allow_pings() {
        return mt_allow_pings;
    }

    public void setMt_allow_pings(String mt_allow_pings) {
        this.mt_allow_pings = mt_allow_pings;
    }

    public String getMt_convert_breaks() {
        return mt_convert_breaks;
    }

    public void setMt_convert_breaks(String mt_convert_breaks) {
        this.mt_convert_breaks = mt_convert_breaks;
    }

    public String getMt_text_more() {
        return mt_text_more;
    }

    public void setMt_text_more(String mt_text_more) {
        this.mt_text_more = mt_text_more;
    }

    public String getMt_excerpt() {
        return mt_excerpt;
    }

    public void setMt_excerpt(String mt_excerpt) {
        this.mt_excerpt = mt_excerpt;
    }

    public String getMt_keywords() {
        return mt_keywords;
    }

    public void setMt_keywords(String mt_keywords) {
        this.mt_keywords = mt_keywords;
    }

    public String getWp_slug() {
        return wp_slug;
    }

    public void setWp_slug(String wp_slug) {
        this.wp_slug = wp_slug;
    }
}
