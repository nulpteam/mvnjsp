package com.bobik.mvn_jsp.models;

import java.util.List;

public interface LoginModelDAO {
List<TestTable> getFromDB(String sql);
String getTitle();
}
