package com.dixsys;

import com.dixsys.config.CorreofacilConfiguration;
import com.dixsys.daos.m_usuariosDAO;
import com.dixsys.resources.m_usuariosResource;
import io.dropwizard.Application;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class CorreofacilService extends Application<CorreofacilConfiguration> {
    private static final Logger LOG = LoggerFactory.getLogger(CorreofacilService.class);

    public static void main(String[] args) throws Exception {
        new CorreofacilService().run(args);
    }

    @Override
    public String getName() {
        return "correofacil";
    }

    @Override
    public void initialize(Bootstrap<CorreofacilConfiguration> bootstrap) {
        bootstrap.addBundle(new MultiPartBundle());
    }

    @Override
    public void run(CorreofacilConfiguration configuration,
                    Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/correofacil/*");
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(),"mysql");

        final m_usuariosDAO m_usuariosDAO = jdbi.onDemand(m_usuariosDAO.class);
        environment.jersey().register(new m_usuariosResource(m_usuariosDAO));

        environment.getApplicationContext().addFilter(CrossDomainFilter.class,"/*", EnumSet.of(DispatcherType.REQUEST,DispatcherType.ERROR));

    }
}
