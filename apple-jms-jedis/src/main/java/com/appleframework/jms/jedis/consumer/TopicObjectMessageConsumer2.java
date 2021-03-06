package com.appleframework.jms.jedis.consumer;

import com.appleframework.jms.core.consumer.IMessageConusmer;
import com.appleframework.jms.core.utils.ByteUtils;

/**
 * @author Cruise.Xu
 * 
 */
public class TopicObjectMessageConsumer2 extends TopicBaseMessageConsumer {

	private IMessageConusmer<Object> messageConusmer;

	public void setMessageConusmer(IMessageConusmer<Object> messageConusmer) {
		this.messageConusmer = messageConusmer;
	}

	@Override
	public void processByteMessage(byte[] message) {
		messageConusmer.processMessage(ByteUtils.fromByte(message));
	}

}
