package dubbo.provider01;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.api01.HelloWorld;

@Service(version = "${helloworld.service.version}", 
			application = "${dubbo.application.id}", 
			protocol = "${dubbo.protocol.id}", 
			registry = "${dubbo.registry.id}")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return name + "，你好";
	}

}
