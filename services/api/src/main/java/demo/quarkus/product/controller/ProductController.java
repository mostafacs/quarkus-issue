package demo.quarkus.product.controller;

import demo.quarkus.model.Product;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    EntityManager entityManager;

    @GET
    public List<Product> getProducts() {

        return entityManager.createQuery("FROM Product", Product.class).setMaxResults(10).getResultList();
    }

}
