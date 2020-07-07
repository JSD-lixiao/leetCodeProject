package nio.netty.http;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/7/6 13:53
 */
public class TestChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();
        channelPipeline.addLast("httpServerCodec",new HttpServerCodec()).addLast("testHttpServerHandler",new TestHttpServerHandler());

    }
}
