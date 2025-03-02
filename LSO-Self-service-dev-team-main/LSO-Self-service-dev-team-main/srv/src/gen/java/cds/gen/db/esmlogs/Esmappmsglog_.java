package cds.gen.db.esmlogs;

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
@CdsName("db.esmlogs.esmappmsglog")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-09T07:41:58.579886500Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
public interface Esmappmsglog_ extends StructuredType<Esmappmsglog_> {
  String CDS_NAME = "db.esmlogs.esmappmsglog";

  ElementRef<String> ID();

  ElementRef<String> username();

  ElementRef<Instant> timestamp();

  ElementRef<String> status();

  ElementRef<String> msgtype();

  ElementRef<String> objectid();

  ElementRef<String> message();
}
