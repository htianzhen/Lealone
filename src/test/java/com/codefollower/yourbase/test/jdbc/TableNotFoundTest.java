/*
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codefollower.yourbase.test.jdbc;

//测试com.codefollower.h2.command.Parser.readTableOrView(String)
public class TableNotFoundTest extends TestBase {
    @org.junit.Test
    public void run() throws Exception {
        init();
    }

    void init() throws Exception {
        String t = "TT1";
        createTableSQL("CREATE HBASE TABLE IF NOT EXISTS " + t + "(COLUMN FAMILY cf)");
        stmt.executeUpdate("INSERT INTO " + t + "(_rowkey_, f1, f2) VALUES('01', 'a1', 10)");
    }
}
