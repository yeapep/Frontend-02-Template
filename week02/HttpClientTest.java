package week02.gc;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientTest {
    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClients.createDefault();// 创建默认http连接
        HttpGet get = new HttpGet("http://localhost:8801");// 创建一个post请求

        HttpResponse response = client.execute(get);// 用http连接去执行get请求并且获得http响应
        HttpEntity entity = response.getEntity();// 从response中取到响实体
        String html = EntityUtils.toString(entity);// 把响应实体转成文本
        System.out.println(html);

    }
}
