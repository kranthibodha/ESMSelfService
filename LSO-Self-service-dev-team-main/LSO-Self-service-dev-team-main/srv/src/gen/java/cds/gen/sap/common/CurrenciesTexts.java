package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("sap.common.Currencies.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-16T12:22:12.221172700Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
public interface CurrenciesTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  /**
   * Type for a language code
   */
  String getLocale();

  /**
   * Type for a language code
   */
  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  CurrenciesTexts_ ref();

  static CurrenciesTexts create() {
    return Struct.create(CurrenciesTexts.class);
  }
}
