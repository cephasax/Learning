package crud.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import crud.springboot.converter.AlunoFormatter;
import crud.springboot.service.AlunoService;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private AlunoService alunoService;
	
    @Override
    public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new AlunoFormatter(alunoService));
    }
}