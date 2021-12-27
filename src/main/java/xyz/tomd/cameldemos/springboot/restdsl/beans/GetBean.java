package xyz.tomd.cameldemos.springboot.restdsl.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import xyz.tomd.cameldemos.springboot.restdsl.types.ResponseType;

@Component
public class GetBean {

	@Value("${hello.message.property}")
    private String propertyMessage;
	
    public ResponseType sayHello() {
		System.out.println("===>>>GetBean.sayHello: " + propertyMessage);
        return new ResponseType(propertyMessage);
    }

}
