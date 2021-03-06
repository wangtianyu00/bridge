package com.happylich.bridge.game.activity;

/**
 * Created by lich on 2018/5/2.
 */

/**
 * WifiP2pGameActivity
 * 这个Activity同时充当服务器和客户端
 * 这个Activity实现了WifiP2p的一些方法，使得他能够获取与远程机器的连接
 *
 * 1. 注册广播
 *    创建IntentFilter对象
 *    添加表一的所有动作
 *    调用context.registerReceiver
 * 2. 接收广播传过来的消息并处理
 * 3. 在必要时解注册广播
 *
 * 不应该有这个类，Game负责Game，Select负责底层抽象
 * 创建点对点游戏
 */
public class WifiP2pGameActivity {
}
