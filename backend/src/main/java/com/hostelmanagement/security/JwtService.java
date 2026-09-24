package com.hostelmanagement.security;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.crypto.SecretKey;
@Service
public class JwtService {
    private final SecretKey key; private final long expiration;
    public JwtService(@Value("${app.jwt.secret}") String secret,@Value("${app.jwt.expiration-ms}") long expiration){ this.key=Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)); this.expiration=expiration; }
    public String generate(String email){ Date now=new Date(); return Jwts.builder().setSubject(email).setIssuedAt(now).setExpiration(new Date(now.getTime()+expiration)).signWith(key).compact(); }
    public String extractEmail(String token){ return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getSubject(); }
    public boolean valid(String token){ try { Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token); return true; } catch (JwtException | IllegalArgumentException e) { return false; } }
}
