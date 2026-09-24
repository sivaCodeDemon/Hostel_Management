package com.hostelmanagement.security;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.*; import javax.servlet.http.*; import java.io.IOException; import java.util.Collections;
@Component
public class JwtFilter extends OncePerRequestFilter {
 private final JwtService jwt;
 public JwtFilter(JwtService jwt){this.jwt=jwt;}
 protected void doFilterInternal(HttpServletRequest req,HttpServletResponse res,FilterChain chain)throws ServletException,IOException{
  String h=req.getHeader("Authorization");
  if(h!=null&&h.startsWith("Bearer ")){String token=h.substring(7); if(jwt.valid(token)){String email=jwt.extractEmail(token); SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(User.withUsername(email).password("").roles("ADMIN").build(),null,Collections.emptyList()));}}
  chain.doFilter(req,res);
 }
}
