package cds.gen;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import javax.annotation.processing.Generated;

/**
 * Aspect for entities with canonical universal IDs
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-cuid
 */
@CdsName("cuid")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-09T07:41:58.579886500Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
public interface Cuid extends CdsData {
  String ID = "ID";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  static Cuid create() {
    return Struct.create(Cuid.class);
  }
}
