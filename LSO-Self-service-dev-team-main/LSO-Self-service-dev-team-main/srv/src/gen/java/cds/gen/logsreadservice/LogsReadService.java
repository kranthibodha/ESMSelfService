package cds.gen.logsreadservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-16T12:14:12.050000700Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
@CdsName(LogsReadService_.CDS_NAME)
public interface LogsReadService extends CqnService {
  interface Application extends ApplicationService, LogsReadService {
  }

  interface Remote extends RemoteService, LogsReadService {
  }
}
