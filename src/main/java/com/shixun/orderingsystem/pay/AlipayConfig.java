package com.shixun.orderingsystem.pay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    public static String app_id = "2016101700704435";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCs6BF8RbQahsP4/TrzEHTzuPmFr+6RJNqDN3QxD+Tjvqf5RteLJx+KzTw37TpzzwBacMV++p3VqcyKpQkpQZ1ZYaDDKQyXbbeybK1yeG2namxUyBOGVmwNdRlwiO/wnVpXuDcnTZs2xyK7mJDv2YuGf6obUcPwNIvJHPyi5Q4jZ98JVZ8z1WinVBRoYRWtUx62GDNa1MWi+9SqhsDCDk15+h+aodgPb6j+nPLr1VSzAodoHiOzOdZZ9UxlCzSeSz0zVl6hS3LOOfi0mE6oilwgO45UIiZDqC9UhXBXxMzJIyKqrad4I0sMHeKOR0RIOgvqpKIB5gLlV2fXib4M+qTbAgMBAAECggEABB+owxj6eaN7KwYHEOL0lxdzQ//1JZsGZxi8easSX2gdo3FQFK6DLxFD/WV3/mkSbhXAcA3UE9Nv4GKdPFGnSgltBxqEhVwFhIjY/iDnJJYCLWd0J8EJ5KxFRgzOBCQMkoj/L73HFOBc8LJrynyaukNzMCGcFa97IfnCALSLyMZYMv15+CFAVvHiUQEsGjqXt+MoVXJJaNHffu+Ht8N++zilILUFqwJdG/CYxVUjfHb3Hz8kfJKD9T9eq3T7WxWunTCEUef1hXRku94tPki4F1Z3x1PUMOFMBz+3MUKw/n6BztsBX7+JH/SgQcWEVI+t6PLQCUqCMSkR8sYnCipJAQKBgQD9R/PpinXu+9P6JPNX17DW7z/gKpny/UgMO7H4x7Hb87zNTB9WVrdeiVFWURZ1y1S+FEos0RGpQac0iffbHvcBIKb0zWH9v+823y8t2Z/FYFVVIE6B1u9lyAlcyZPE+2cP5BjOvFmcIOaPNmrzWsvUqXM1Qz3wTPZJOIde8597gQKBgQCuwzyJVvOgSqpRJoWjEkkGWMzS2AKq1FXhhhWyozDq7/GYL7Fzy2LwKViZLS/AA5zR+TXKDWWCd5NjjdMs765d/4AovB32i0ahsD7aTdufa8ji63807tpg9n9HpNAwuFw1Roe0vZqycRJGVsBKsNPZyvveZXeDK+i3yb3GZaC+WwKBgQCofktnG7Nk7qaQDDDOSTDda3/k0rJjkddyO+wjgkVx+22obXGTcFDAVT2E3KDCcCfJ45mMwvCq1oAzVW1Lmgfb+irXRCJiOmMa79JlABdnqLRb0wgnHCNaZH7F+VuSeWSQj79pGKfMU57NuvffOJHMwYVg84Cq8agOAcscgZmhAQKBgEBVFGrGPGasNagr0xPlfkY82CFhbRHvmjGrxz78PdyuOTQ5kkw6+Y/I2JmCfcpkSg0tfPSFG/H8DKCgK7WmAX0OueHE5g7E1Fpe47Q+5vL3nXqTED+vEWqSMuZvsEfPBfqCnSAWj+TSJNUJyD12fHX29+K1XVpHBqLpO9fVv2dzAoGAQ73L90hjDHfB3FJBgWRCYtNX0xgRZXmx79Q5QYK/eMIUVPdLPdhpwjYdJ/IZnrr/DdW5NAmps4yY0lgvV4qhry/l8SkqCq5J8ELo/g8Ft0PkqvlQL8RZsCeD6JTx2CeJthVlKiMIEugOAOU4qbpdOd1QRJCKPJh0sH6ne/1fJmQ=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArOgRfEW0GobD+P068xB087j5ha/ukSTagzd0MQ/k476n+UbXiycfis08N+06c88AWnDFfvqd1anMiqUJKUGdWWGgwykMl223smytcnhtp2psVMgThlZsDXUZcIjv8J1aV7g3J02bNsciu5iQ79mLhn+qG1HD8DSLyRz8ouUOI2ffCVWfM9Vop1QUaGEVrVMethgzWtTFovvUqobAwg5NefofmqHYD2+o/pzy69VUswKHaB4jsznWWfVMZQs0nks9M1ZeoUtyzjn4tJhOqIpcIDuOVCImQ6gvVIVwV8TMySMiqq2neCNLDB3ijkdESDoL6qSiAeYC5Vdn14m+DPqk2wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";
    public static String return_url = "http://192.168.8.18:8081";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
