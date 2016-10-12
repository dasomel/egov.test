package egovframework.example.cmmn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class EgovSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver{

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovSimpleMappingExceptionResolver.class);

	@Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		LOGGER.error("ExceptionURI : {}", request.getRequestURI());
        return super.resolveException(request, response, handler, ex);
    }
}