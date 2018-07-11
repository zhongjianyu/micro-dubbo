package dubbo.consumer01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.api01.HelloWorld;

@RestController
public class Consumer01 {
	@Reference(version = "${helloworld.service.version}", 
			application = "${dubbo.application.id}", 
			url = "dubbo://localhost:12345")
	private HelloWorld helloWorld;

	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return helloWorld.sayHello(name);
	}
}
