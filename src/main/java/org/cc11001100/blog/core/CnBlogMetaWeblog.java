package org.cc11001100.blog.core;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.cc11001100.blog.dto.BlogInfo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CC11001100
 * @date 2017/7/29 22:34
 * @email CC11001100@qq.com
 */
public class CnBlogMetaWeblog {

    private String appKey;

    private String username;

    private String passwd;

    private String serverUrl;

    private XmlRpcClient xmlRpcClient;

    public CnBlogMetaWeblog(String appKey, String username, String passwd) {
        this.appKey = appKey;
        this.username = username;
        this.passwd = passwd;
        this.serverUrl = "http://rpc.cnblogs.com/metaweblog/" + username;

        try {
            xmlRpcClient = new XmlRpcClient();

            XmlRpcClientConfigImpl xmlRpcClientConfig = new XmlRpcClientConfigImpl();
            xmlRpcClientConfig.setServerURL(new URL(serverUrl));
            xmlRpcClient.setConfig(xmlRpcClientConfig);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public CnBlogMetaWeblog(String username, String passwd) {
        this("default", username, passwd);
    }

    /**
     * 获取博客信息
     *
     * @return
     */
    public BlogInfo getUsersBlogs(){

        List<String> params = new ArrayList<>();
        params.add(appKey);
        params.add(username);
        params.add(passwd);
        try {
            Object result = xmlRpcClient.execute("blogger.getUsersBlogs", params);

            return new BlogInfo();
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }

        return null;
    }

}
