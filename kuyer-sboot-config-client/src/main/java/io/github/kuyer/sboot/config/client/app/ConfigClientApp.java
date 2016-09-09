package io.github.kuyer.sboot.config.client.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientApp {
	
	@Value("${apptitle}")
	private String apptitle;
	
	@RequestMapping(value="apptitle", method=RequestMethod.GET)
	public String apptitle() {
		return apptitle;
	}

}
