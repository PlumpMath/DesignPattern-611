package com.pattern.Builder.demo1;

import java.util.ArrayList;
import java.util.List;

import com.pattern.FactoryMethod.demo1.MailSender;
import com.pattern.FactoryMethod.demo1.Sender;
import com.pattern.FactoryMethod.demo1.SmsSender;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}