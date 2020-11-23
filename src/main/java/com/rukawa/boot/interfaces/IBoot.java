package com.rukawa.boot.interfaces;

import java.io.FileNotFoundException;

public interface IBoot {

    /**
     * 重启
     *
     * @param shellName 没有后缀的脚本名
     * @throws FileNotFoundException 文件不存在异常
     */
    void restart(String shellName) throws FileNotFoundException;

    /**
     * 带参数重启
     *
     * @param shellName 没有后缀的脚本名
     * @param args      传递给脚本的参数
     * @throws FileNotFoundException 文件不存在异常
     */
    void restart(String shellName, String... args) throws FileNotFoundException;

    /**
     * 停止
     */
    void stop();
}