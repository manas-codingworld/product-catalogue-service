package com.practice.razor.restendpoints;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Named
@Path("/product")
@EnableAutoConfiguration
public class ProductCatalogueResource {
	
	public static Logger logger=LoggerFactory.getLogger(ProductCatalogueResource.class);
	
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getProductById(){
		logger.info("inside path");
		return "working";
	}

}
