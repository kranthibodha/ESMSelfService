package cds.gen.db.esmlogs;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
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
public interface Esmappmsglog extends CdsData {
  String ID = "ID";

  String USERNAME = "username";

  String TIMESTAMP = "timestamp";

  String STATUS = "status";

  String MSGTYPE = "msgtype";

  String OBJECTID = "objectid";

  String MESSAGE = "message";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getUsername();

  void setUsername(String username);

  Instant getTimestamp();

  void setTimestamp(Instant timestamp);

  String getStatus();

  void setStatus(String status);

  String getMsgtype();

  void setMsgtype(String msgtype);

  String getObjectid();

  void setObjectid(String objectid);

  String getMessage();

  void setMessage(String message);

  Esmappmsglog_ ref();

  static Esmappmsglog create() {
    return Struct.create(Esmappmsglog.class);
  }

  static Esmappmsglog create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Esmappmsglog.class);
  }
}
