package org.cc11001100.blog.dto;

/**
 *
 *  描述博客的相关信息
 *
 * @date 2017/7/29 22:19
 * @author CC11001100
 * @email CC11001100@qq.com
 */
public class BlogInfo {

    private String blogid;

    private String url;

    private String blogName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
    }
}
