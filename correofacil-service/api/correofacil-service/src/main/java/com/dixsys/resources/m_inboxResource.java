package com.dixsys.resources;

import com.dixsys.daos.m_inboxDAO;
import com.dixsys.models.m_inbox;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by jcesar23mx on 15/05/2018.
 */
@Path("inbox")
@Produces(MediaType.APPLICATION_JSON)
public class m_inboxResource {
    private final m_inboxDAO minboxDAO;

    public m_inboxResource(m_inboxDAO m_inboxDAO ) {
        this.minboxDAO = m_inboxDAO;
    }

    @GET
    @Path("/user")
    public Response get_inboxUser(@PathParam("inboxUsuario/{inboxUsuario}") String inboxUsuario){
        try {
            List<m_inbox> m_inboxLista = minboxDAO.inboxUser(Integer.parseInt(inboxUsuario));
            return Response.status((Response.Status.OK)).entity(m_inboxLista).build();
        }
        catch (Exception e) {
            System.out.print("Error"+ e.getMessage() + e.getCause());
            return Response.status((Response.Status.CONFLICT)).build();
        }

    }
}
