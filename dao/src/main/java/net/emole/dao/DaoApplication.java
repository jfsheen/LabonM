package net.emole.dao;

import net.emole.model.ModelApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import(value={ModelApplication.class})
public class DaoApplication
{

}
