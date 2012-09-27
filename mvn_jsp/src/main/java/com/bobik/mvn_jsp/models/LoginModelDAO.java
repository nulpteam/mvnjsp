package com.bobik.mvn_jsp.models;

import java.util.List;

public interface LoginModelDAO {
List<String> getFromDB(String sql);
}
