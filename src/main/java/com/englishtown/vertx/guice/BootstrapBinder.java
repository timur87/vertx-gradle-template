package com.englishtown.vertx.guice;

import com.google.inject.AbstractModule;

public class BootstrapBinder extends AbstractModule {
	
	@Override
	protected void configure() {
		System.out.println("A");
	}
	
}