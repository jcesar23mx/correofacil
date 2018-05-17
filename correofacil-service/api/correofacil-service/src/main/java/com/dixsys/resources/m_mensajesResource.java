package com.dixsys.resources;

import com.dixsys.daos.m_mensajesDAO;
import com.dixsys.models.m_mensajes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("mensajes")
@Produces(MediaType.APPLICATION_JSON)
public class m_mensajesResource {
    private final m_mensajesDAO mMensajesDAO;

    public m_mensajesResource(m_mensajesDAO m_mensajesDAO) { this.mMensajesDAO = m_mensajesDAO; }
    @GET
    @Path("/entrada/{inboxId}")
    public Response get_InboxMensajes(@PathParam("inboxId") String inboxId) {
        try {
            List<m_mensajes> mMensajesLista = mMensajesDAO.getm_mensajesInbox(Integer.parseInt(inboxId));
            return Response.status((Response.Status.OK)).entity(mMensajesLista).build();
        }
        catch (Exception e) {
            System.out.print("Error"+ e.getMessage() + e.getCause());
            return Response.status((Response.Status.CONFLICT)).build();
        }
    }

    @GET
    @Path("/salida/{sentId}")
    public Response get_SentMensajes(@PathParam("sentId") String sentId) {
        try {
            List<m_mensajes> mMensajesLista = mMensajesDAO.getm_mensajesSent(Integer.parseInt(sentId));
            return Response.status((Response.Status.OK)).entity(mMensajesLista).build();
        }
        catch (Exception e) {
            System.out.print("Error"+ e.getMessage() + e.getCause());
            return Response.status((Response.Status.CONFLICT)).build();
        }
    }

}
