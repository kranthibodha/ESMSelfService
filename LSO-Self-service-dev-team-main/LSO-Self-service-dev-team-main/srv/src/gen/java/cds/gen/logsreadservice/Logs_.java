package cds.gen.logsreadservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.Instant;
import javax.annotation.processing.Generated;

/**
 * Aspect for entities with canonical universal IDs
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-cuid
 */
@CdsName("LogsReadService.Logs")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-16T12:22:12.221172700Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
public interface Logs_ extends StructuredType<Logs_> {
  String CDS_NAME = "LogsReadService.Logs";

  ElementRef<String> ID();

  ElementRef<String> username();

  ElementRef<Instant> timestamp();

  ElementRef<String> status();

  ElementRef<String> msgtype();

  ElementRef<String> objectid();

  ElementRef<String> message();
}
