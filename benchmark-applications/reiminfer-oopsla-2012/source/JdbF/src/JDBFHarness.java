public class JDBFHarness implements Runnable {

  static java.lang.String java_lang_String_var = null;
  static org.jdbf.engine.caching.CacheManager org_jdbf_engine_caching_CacheManager_var = null;
  static org.jdbf.engine.criteria.Criteria org_jdbf_engine_criteria_Criteria_var = null;
  static int int_var = 0;
  static org.jdbf.engine.basic.PrimaryKey org_jdbf_engine_basic_PrimaryKey_var = null;
  static org.jdbf.engine.sql.QueryResults org_jdbf_engine_sql_QueryResults_var = null;
  static java.lang.String[] java_lang_StringAB_var = new java.lang.String[1];
  static java.lang.Object[] java_lang_ObjectAB_var = new java.lang.Object[1];
  static java.sql.Connection java_sql_Connection_var = null;
  static org.jdbf.engine.database.DatabaseImpl org_jdbf_engine_database_DatabaseImpl_var = null;
  static org.jdbf.engine.sql.connection.ConnectionManager org_jdbf_engine_sql_connection_ConnectionManager_var = null;
  static org.jdbf.engine.repository.RepositoryFactory org_jdbf_engine_repository_RepositoryFactory_var = null;
  static org.jdbf.engine.basic.ObjectMapped org_jdbf_engine_basic_ObjectMapped_var = null;

  static void main(String[] args) { 

      try {
	org_jdbf_engine_database_DatabaseImpl_var = new org.jdbf.engine.database.DatabaseImpl(java_lang_String_var, org_jdbf_engine_repository_RepositoryFactory_var, org_jdbf_engine_caching_CacheManager_var); 
        org_jdbf_engine_database_DatabaseImpl_var = org_jdbf_engine_database_DatabaseImpl_var;
      } catch (Exception e) {}

    JDBFHarness r = new JDBFHarness();
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(r);
      t.start();
    }
  }
  public void run() {
    try {
      while (true) {
        org_jdbf_engine_database_DatabaseImpl_var.beginTransaction();
        org_jdbf_engine_database_DatabaseImpl_var.begin();
        org_jdbf_engine_database_DatabaseImpl_var.close();
        org_jdbf_engine_database_DatabaseImpl_var.commitTransaction();
        org_jdbf_engine_database_DatabaseImpl_var.commit(java_sql_Connection_var);
        int_var = org_jdbf_engine_database_DatabaseImpl_var.delete(org_jdbf_engine_basic_ObjectMapped_var);
        int_var = org_jdbf_engine_database_DatabaseImpl_var.deleteForCriteria(org_jdbf_engine_criteria_Criteria_var);
        org_jdbf_engine_database_DatabaseImpl_var.destroy();
        org_jdbf_engine_sql_connection_ConnectionManager_var = org_jdbf_engine_database_DatabaseImpl_var.getConnectionManager();
        int_var = org_jdbf_engine_database_DatabaseImpl_var.insert(org_jdbf_engine_basic_ObjectMapped_var);
        org_jdbf_engine_database_DatabaseImpl_var.rollbackTransaction();
        org_jdbf_engine_database_DatabaseImpl_var.rollback(java_sql_Connection_var);
        org_jdbf_engine_sql_QueryResults_var = org_jdbf_engine_database_DatabaseImpl_var.select(java_lang_String_var, org_jdbf_engine_criteria_Criteria_var);
        org_jdbf_engine_sql_QueryResults_var = org_jdbf_engine_database_DatabaseImpl_var.selectByPrimaryKey(java_lang_String_var, org_jdbf_engine_basic_PrimaryKey_var);
        int_var = org_jdbf_engine_database_DatabaseImpl_var.update(org_jdbf_engine_basic_ObjectMapped_var, java_lang_StringAB_var);
        int_var = org_jdbf_engine_database_DatabaseImpl_var.updateForCriteria(java_lang_String_var, java_lang_StringAB_var, java_lang_ObjectAB_var, org_jdbf_engine_criteria_Criteria_var);
      }
    } catch (Throwable e) { }
  }
}
