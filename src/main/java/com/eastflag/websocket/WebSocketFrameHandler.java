package com.eastflag.websocket;

import java.util.ArrayList;
import java.util.Locale;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Echoes uppercase content of text frames.
 */
public class WebSocketFrameHandler extends SimpleChannelInboundHandler<WebSocketFrame> {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketFrameHandler.class);


    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelRegistered:" + ctx);
        WebSocketServer.sContextList.add(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelUnregistered:" + ctx);
        WebSocketServer.sContextList.remove(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, WebSocketFrame frame) throws Exception {
        // ping and pong frames already handled

        if (frame instanceof TextWebSocketFrame) {
            // Send the uppercase string back.
            String request = ((TextWebSocketFrame) frame).text();
            logger.info("{} received {}", ctx.channel(), request);

            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(request).getAsJsonObject();

            if (json.get("command").getAsString().equals("broadcast")) {
                System.out.println("broadcast:" + WebSocketServer.sContextList.size());
                for(ChannelHandlerContext context : WebSocketServer.sContextList) {
                    System.out.println("context:" + ctx);
                    context.channel().writeAndFlush(new TextWebSocketFrame(request));
                }
            } else {
                ctx.channel().writeAndFlush(new TextWebSocketFrame(request));
            }


        } else {
            String message = "unsupported frame type: " + frame.getClass().getName();
            throw new UnsupportedOperationException(message);
        }
    }
}
