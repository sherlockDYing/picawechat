// Copyright 2016-2101 Pica.
package com.wechat_study.demo.util;

import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName VideoUtil
 * @Description 视频工具
 * @Author caijia.rao
 * @Date 2019/8/14 13:55
 * @ModifyDate 2019/8/14 13:55
 * @Version 1.0
 */
public class VideoUtil {
    // public static String host = "http://************";//服务器IP
    //服务器路径
    public static String rootPath = "";
    /**
     * 图片格式
     */
    private static final String IMAGE_MAT = "png";
    private static final String ROTATE = "rotate";
    /**
    * 视频第几帧
    */
    public static final int MOD = 1;

    /**
     * @Description 获取视频缩略图
     * @Author caijia.rao
     * @Date 2019/8/14 14:02
     * @ModifyDate 2019/8/14 14:02
     * @Params [filePath, lpath, mod]
     * @Return java.lang.String
     */
    public static String randomGrabberFFmpegVideoImage(String filePath, String imageName, int mod) throws Exception {
        String targetFilePath = "";
        FFmpegFrameGrabber ff = FFmpegFrameGrabber.createDefault(filePath);
        ff.start();
        String rotate = ff.getVideoMetadata(ROTATE);
        int ffLength = ff.getLengthInFrames();
        Frame f;
        int i = 0;
        int index = mod;
        while (i < ffLength) {
            f = ff.grabImage();
            if (i == index) {
                if (null != rotate && rotate.length() > 1) {
                    OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
                    opencv_core.IplImage src = converter.convert(f);
                    f = converter.convert(rotate(src, Integer.valueOf(rotate))); //旋转图片
                }
                targetFilePath = getImagePath(imageName); //根据视频路径生成缩略图存放路径 
                doExecuteFrame(f, targetFilePath); //获取缩略图
                break;
            }
            i++;
        }
        ff.stop();
        return targetFilePath;//返回的是视频第一帧
    }

    /**
     * @Description 旋转图片
     * @Author caijia.rao
     * @Date 2019/8/14 14:13
     * @ModifyDate 2019/8/14 14:13
     * @Params [src, angle]
     * @Return org.bytedeco.javacpp.opencv_core.IplImage
     */
    public static opencv_core.IplImage rotate(opencv_core.IplImage src, int angle) {
        opencv_core.IplImage img = opencv_core.IplImage.create(src.height(), src.width(), src.depth(), src.nChannels());
        opencv_core.cvTranspose(src, img);
        opencv_core.cvFlip(img, img, angle);
        return img;
    }

    /**
     * @Description 根据视频路径生成缩略图存放路径 
     * @Author caijia.rao
     * @Date 2019/8/14 14:14
     * @ModifyDate 2019/8/14 14:14
     * @Params [filePath]
     * @Return java.lang.String
     */
    private static String getImagePath(String filePath) {
        return rootPath + filePath;
    }


    /**
     * @Description 截取缩略图 
     * @Author caijia.rao
     * @Date 2019/8/14 14:14
     * @ModifyDate 2019/8/14 14:14
     * @Params [f, targetFilePath]
     * @Return void
     */
    public static void doExecuteFrame(Frame f, String targetFilePath) {
        if (null == f || null == f.image) {
            return;
        }
        Java2DFrameConverter converter = new Java2DFrameConverter();
        BufferedImage bi = converter.getBufferedImage(f);
        File output = new File(targetFilePath);
        try {
            ImageIO.write(bi, IMAGE_MAT, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * @Description 根据视频长度随机生成随机数集合
     * @Author caijia.rao
     * @Date 2019/8/14 14:15
     * @ModifyDate 2019/8/14 14:15
     * @Params [baseNum, length] 基础数字，此处为视频长度;随机数集合长度
     * @Return java.util.List<java.lang.Integer> 随机数集合 
     */
    public static List<Integer> random(int baseNum, int length) {
        List<Integer> list = new ArrayList<Integer>(length);
        while (list.size() < length) {
            Integer next = (int) (Math.random() * baseNum);
            if (list.contains(next)) {
                continue;
            }
            list.add(next);
        }
        Collections.sort(list);
        return list;
    }


}
