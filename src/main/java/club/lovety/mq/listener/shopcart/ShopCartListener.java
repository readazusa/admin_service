package club.lovety.mq.listener.shopcart;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class ShopCartListener implements MessageListener {

    private static final Logger log = LoggerFactory.getLogger(ShopCartListener.class);

    @Override
    public void onMessage(Message message) {
        try {
            log.debug("初始化的type: {}",message.getJMSType());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        ActiveMQTextMessage activeMQTextMessage = (ActiveMQTextMessage) message;
        log.debug("jmsType:{} ", activeMQTextMessage.getJMSType());
        try {
            String ShopCartInfoJson =  activeMQTextMessage.getText();
            log.info("ShopCartInfoJson: {}",ShopCartInfoJson);
//            shopCartService.receiveMqShopCart(ShopCartInfoJson);
        } catch (JMSException e) {
            log.error("读取mq中的购物车信息错误: ",e);
//            e.printStackTrace();
        }
    }
}
