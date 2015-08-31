package net.emole.service;

import net.emole.dao.DaoApplication;
import net.emole.model.ModelApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@Import(value = {ModelApplication.class, DaoApplication.class})
public class ServiceApplication {
}
