package com.ping.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController{
	@RequestMapping(method = RequestMethod.GET, path = "/isalive")
	public String isalive() {
		return "OK";
	}
	
	@GetMapping("/principal")
	public OidcUser getOidcUserPrincipal( @AuthenticationPrincipal OidcUser principal) {
	    return principal;
	}
	
}
