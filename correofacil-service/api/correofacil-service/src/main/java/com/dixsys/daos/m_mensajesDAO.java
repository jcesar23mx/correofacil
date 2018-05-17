package com.dixsys.daos;

import com.dixsys.models.m_mensajes;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(m_mensajesMapper.class)
public interface m_mensajesDAO {
    @SqlQuery("SELECT\n" +
            "\t  msjID ,\n" +
            "      msjAsunto ,\n" +
            "      msjTexto ,\n" +
            "      msjFechaOficio ,\n" +
            "      msjFechaRecibido ,\n" +
            "      msjFechaCaptura ,\n" +
            "      inboxid ,\n" +
            "      inboxName ,\n" +
            "      sentid ,\n" +
            "      sentName ,\n" +
            "      remitenteID ,\n" +
            "      rmtRazonSocial ,\n" +
            "      msjEstatus \n" +
            "FROM  v_mensajesentrada \n" +
            "WHERE inboxid = :inboxid;")
    List<m_mensajes> getm_mensajesInbox(@Bind("inboxid") Integer inboxid);

    @SqlQuery("SELECT\n" +
            "\t  msjID ,\n" +
            "      msjAsunto ,\n" +
            "      msjTexto ,\n" +
            "      msjFechaOficio ,\n" +
            "      msjFechaRecibido ,\n" +
            "      msjFechaCaptura ,\n" +
            "      inboxid ,\n" +
            "      inboxName ,\n" +
            "      sentid ,\n" +
            "      sentName ,\n" +
            "      remitenteID ,\n" +
            "      rmtRazonSocial ,\n" +
            "      msjEstatus \n" +
            "FROM  v_mensajesentrada \n" +
            "WHERE sentid = :sentid;")
    List<m_mensajes> getm_mensajesSent(@Bind("sentid") Integer sentid);

}
