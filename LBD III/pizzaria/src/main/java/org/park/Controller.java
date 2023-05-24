package org.park;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/pizzaria")
public class Controller {

	Model model = new Model();
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void cadastrarCliente(Cliente cliente) {
		model.addCliente(cliente);
		
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nome}/{cpf}/{endereco}/{data}")
	public Response cliente(@PathParam String nome, @PathParam String cpf, @PathParam String endereco, @PathParam String data) {
		List<Pedido> pedidosEncontrados = model.buscarCliente(new Cliente(nome,cpf,endereco,data));
		String json = new Gson().toJson(pedidosEncontrados);
		return Response.status(200).entity(json).build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nome}")
	public Response clienteporNome(@PathParam String nome) {
		List<Cliente> clienteEncontrado = model.buscarNome(nome);
		String json = new Gson().toJson(clienteEncontrado);
		return Response.status(200).entity(json).build();
		
	}
	
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}