package com.dixsys.resources;

import com.codahale.metrics.annotation.Timed;
import com.dixsys.daos.m_usuariosDAO;
import com.dixsys.models.m_usuarios;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jcesar23mx on 10/05/2018.
 */
@Path("usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class m_usuariosResource {
    private final m_usuariosDAO mUsuariosDAO;

    public m_usuariosResource(m_usuariosDAO m_usuariosDAO) {
        this.mUsuariosDAO = m_usuariosDAO;
    }

    @POST
    @Path("/login")
    @Timed
    public Response authentication(@FormParam("usucuenta") String usucuenta,
                                   @FormParam("usucontra") String usucontra) {
        m_usuarios result = mUsuariosDAO.loginUser(usucuenta, usucontra);

        if(result == null){
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        return Response.status(Response.Status.OK).entity(result).build();
    }
}
