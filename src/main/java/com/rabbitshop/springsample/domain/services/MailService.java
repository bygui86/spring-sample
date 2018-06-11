package com.rabbitshop.springsample.domain.services;

import com.rabbitshop.springsample.domain.data.MailDto;


public interface MailService {

	void sendEmail(final MailDto mailDto);

}
