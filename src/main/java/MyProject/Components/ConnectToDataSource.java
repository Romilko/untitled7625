package MyProject.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class Connection {
    @Autowired
    DataSource dataSource;
    public Connection connection{

    }
}
