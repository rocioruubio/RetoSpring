package com.ntt;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("status.maxcontador")
public class StatusProperties {
	
private Long cont = 5L;
	
	public Long getCont() {
		return cont;
	}

	public void setCont(Long contador) {
		this.cont = contador;
	}

}
