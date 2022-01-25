package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements javax.servlet.Filter {

    private final String tempUUID = UUID.randomUUID().toString();;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse newResponse = (HttpServletResponse) response;
        newResponse.setHeader("Instance-Id", tempUUID);
        chain.doFilter(request, newResponse);
    }
}
