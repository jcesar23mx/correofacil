package com.dixsys.daos;

import com.dixsys.models.m_inbox;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jcesar23mx on 15/05/2018.
 */
@RegisterMapper(m_inboxMapper.class)
public interface m_inboxDAO {

    @SqlQuery("SELECT inboxID,\n" +
            "         inboxUsuario,\n" +
            "         inboxCategoria\n" +
            "FROM  carpetasUsuario\n" +
            "WHERE inboxUsuario = :inboxUsuario;")
    List<m_inbox> inboxUser(@Bind("inboxUsuario") Integer inboxUsuario);


}
